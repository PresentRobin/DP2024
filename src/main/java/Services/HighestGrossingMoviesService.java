package Services;

import Entities.HighestGrossingMovies;
import Repos.HighestGrossingMoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HighestGrossingMoviesService {

    private final HighestGrossingMoviesRepo highestGrossingMoviesRepo;

    @Autowired
    public HighestGrossingMoviesService(HighestGrossingMoviesRepo highestGrossingMoviesRepo) {
        this.highestGrossingMoviesRepo = highestGrossingMoviesRepo;
    }

    public List<HighestGrossingMovies> findAll() {
        return highestGrossingMoviesRepo.findAll();
    }

    public Optional<HighestGrossingMovies> findById(Long id) {
        return highestGrossingMoviesRepo.findById(id);
    }


    public HighestGrossingMovies save(HighestGrossingMovies highestGrossingMovies) {
        return highestGrossingMoviesRepo.save(highestGrossingMovies);
    }

    public void deleteById(Long id) {
        highestGrossingMoviesRepo.deleteById(id);
    }
}
