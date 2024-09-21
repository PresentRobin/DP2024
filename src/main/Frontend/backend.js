document.addEventListener('DOMContentLoaded', function() {
    fetchDataAndRenderCharts();
});

async function fetchDataAndRenderCharts() {
    try {
        // Fetch Video Game Sales Data
        const videoGameSalesResponse = await fetch('http://localhost:8080/api/videogames');
        const videoGameSalesData = await videoGameSalesResponse.json();

        // Fetch Moistmeter Review Data
        const moistmeterReviewResponse = await fetch('http://localhost:8080/api/moistmeter');
        const moistmeterReviewData = await moistmeterReviewResponse.json();

        // Fetch Highest Grossing Movies Data
        const highestGrossingMoviesResponse = await fetch('http://localhost:8080/api/movies');
        const highestGrossingMoviesData = await highestGrossingMoviesResponse.json();

        // Render Video Game Sales Chart
        renderVideoGameSalesChart(videoGameSalesData);

        // Render Moistmeter Chart
        renderMoistmeterReviewChart(moistmeterReviewData);

        // Render Highest Grossing Movies Chart
        renderHighestGrossingMoviesChart(highestGrossingMoviesData);

    } catch (error) {
        console.error('Error fetching data:', error);
    }
}

function renderVideoGameSalesChart(data) {
    const ctx = document.getElementById('videoGameSalesChart').getContext('2d');
    const chartData = {
        labels: data.map(item => item.name),
        datasets: [{
            label: 'Global Sales (in millions)',
            data: data.map(item => item.globalSales),
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
        }]
    };
    new Chart(ctx, {
        type: 'bar',
        data: chartData,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}

function renderMoistmeterReviewChart(data) {
    const ctx = document.getElementById('moistmeterReviewChart').getContext('2d');
    const chartData = {
        labels: data.map(item => item.title),
        datasets: [{
            label: 'Moistmeter Rating',
            data: data.map(item => item.moistmeterRating),
            backgroundColor: 'rgba(153, 102, 255, 0.2)',
            borderColor: 'rgba(153, 102, 255, 1)',
            borderWidth: 1
        }]
    };
    new Chart(ctx, {
        type: 'line',
        data: chartData,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}

function renderHighestGrossingMoviesChart(data) {
    const ctx = document.getElementById('highestGrossingMoviesChart').getContext('2d');
    const chartData = {
        labels: data.map(item => item.title),
        datasets: [{
            label: 'Worldwide Sales (in $)',
            data: data.map(item => item.worldWideSales),
            backgroundColor: 'rgba(255, 159, 64, 0.2)',
            borderColor: 'rgba(255, 159, 64, 1)',
            borderWidth: 1
        }]
    };
    new Chart(ctx, {
        type: 'bar',
        data: chartData,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}
