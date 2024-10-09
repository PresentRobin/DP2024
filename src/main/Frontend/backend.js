// HTML Elements
const searchButton = document.getElementById('searchButton');
const radioMovies = document.getElementById('radioMovies');
const radioGames = document.getElementById('radioGames');
const searchInput = document.getElementById('searchInput');
const resultSection = document.getElementById('resultSection');

// Event Listener for Search Button
searchButton.addEventListener('click', function() {
    const searchTerm = searchInput.value.trim();
    if (!searchTerm) {
        alert('Please enter a title.');
        return;
    }

    const isMovie = radioMovies.checked;
    fetchData(searchTerm, isMovie);
});

// Function to fetch data from API based on the title and category (Movie/Game)
function fetchData(title, isMovie) {
    const category = isMovie ? 'movies' : 'games'; // Define endpoint based on category

    // Send request to backend API
    fetch(`/api/${category}/search?title=${encodeURIComponent(title)}`)
        .then(response => response.json())
        .then(data => {
            if (data.error) {
                // Error handling for missing data
                if (data.error === 'no_movie_found') {
                    displayError("Can't find this movie");
                } else if (data.error === 'no_game_found') {
                    displayError("Can't find this game");
                } else if (data.error === 'no_moistmeter') {
                    displayError("Moist did not meter this :(");
                }
            } else {
                // Data found, now render the comparison chart
                renderComparisonChart(data);
            }
        })
        .catch(error => {
            console.error('Error fetching data:', error);
            displayError('Something went wrong. Please try again.');
        });
}

// Function to display an error message
function displayError(message) {
    resultSection.innerHTML = `<p style="color: rgba(0,186,213,255);">${message}</p>`;
}

// Function to render comparison chart between MoistMeter rating and movie/game data
function renderComparisonChart(data) {
    const { title, moistmeterRating, lifetimeGross, voteAvg, voteCount, globalSales, rank } = data;

    // Clear previous results
    resultSection.innerHTML = '';

    // Create a canvas element for the chart
    const canvas = document.createElement('canvas');
    canvas.id = 'comparisonChart';
    resultSection.appendChild(canvas);

    // Prepare data for chart
    let chartLabels = [];
    let chartData = [];

    if (radioMovies.checked) {
        // If searching for a movie
        chartLabels = ['MoistMeter Rating', 'Lifetime Gross', 'Vote Avg', 'Vote Count'];
        chartData = [moistmeterRating, lifetimeGross, voteAvg, voteCount];
    } else if (radioGames.checked) {
        // If searching for a game
        chartLabels = ['MoistMeter Rating', 'Global Sales', 'Rank'];
        chartData = [moistmeterRating, globalSales, rank];
    }

    // Create the bar chart using Chart.js
    new Chart(canvas, {
        type: 'bar',
        data: {
            labels: chartLabels,
            datasets: [{
                label: `${title} - Rating Comparison`,
                backgroundColor: 'rgba(0,186,213,255)',
                borderColor: 'rgba(1,63,88,255)',
                data: chartData,
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true,
                    max: 10 // Assuming all scores are on a scale of 1 to 10
                }
            }
        }
    });
}
