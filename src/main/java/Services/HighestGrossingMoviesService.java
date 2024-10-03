package Services;

import Entities.HighestGrossingMovies;
import Repos.HighestGrossingMoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighestGrossingMoviesService {

    @Autowired
    private HighestGrossingMoviesRepo highestGrossingMoviesRepo;

    public List<HighestGrossingMovies> getHighestGrossingMoviesgetAllMovies() {
        return highestGrossingMoviesRepo.findAll();
    }

    public HighestGrossingMovies getMovieById(Long id) {
        return highestGrossingMoviesRepo.findById(id).orElse(null);
    }

    public HighestGrossingMovies saveMovie(HighestGrossingMovies highestGrossingMovies) {
        return highestGrossingMoviesRepo.save(highestGrossingMovies);
    }

    public void deleteMovie(Long id) {
        highestGrossingMoviesRepo.deleteById(id);
    }
}
