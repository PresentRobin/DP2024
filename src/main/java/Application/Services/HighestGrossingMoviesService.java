package Application.Services;

import Application.Entities.HighestGrossingMovies;
import Application.Repos.HighestGrossingMoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HighestGrossingMoviesService {

    @Autowired
    private HighestGrossingMoviesRepo highestGrossingMoviesRepo;

    public List<HighestGrossingMovies> findAll() {
        return highestGrossingMoviesRepo.findAll();
    }

    public HighestGrossingMovies findById(int id) {
        return highestGrossingMoviesRepo.findById(id).orElse(null);
    }

    public HighestGrossingMovies saveMovie(HighestGrossingMovies highestGrossingMovies) {
        return highestGrossingMoviesRepo.save(highestGrossingMovies);
    }

    public void deleteMovie(int id) {
        highestGrossingMoviesRepo.deleteById(id);
    }

    public HighestGrossingMovies setMovieID(int oldId, int newId) {
        Optional<HighestGrossingMovies> movieOptional = highestGrossingMoviesRepo.findById(oldId);
        if (movieOptional.isPresent()) {
            HighestGrossingMovies movie = movieOptional.get();
            movie.setMovieId(newId);  // Set the new ID
            return highestGrossingMoviesRepo.save(movie);  // Save with new ID
        }
        return null;  // Return null if the movie with oldId doesn't exist
    }
}
