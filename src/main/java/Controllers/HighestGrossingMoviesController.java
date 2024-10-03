package Controllers;

import Entities.HighestGrossingMovies;
import Services.HighestGrossingMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class HighestGrossingMoviesController {

    private final HighestGrossingMoviesService highestGrossingMoviesService;

    @Autowired
    public HighestGrossingMoviesController(HighestGrossingMoviesService highestGrossingMoviesService) {
        this.highestGrossingMoviesService = highestGrossingMoviesService;
    }

    @GetMapping
    public List<HighestGrossingMovies> getAllMovies() {
        return highestGrossingMoviesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HighestGrossingMovies> getMovieById(@PathVariable Long id) {
        Optional<HighestGrossingMovies> highestGrossingMovies = Optional.ofNullable(highestGrossingMoviesService.findById(id));
        if (highestGrossingMovies.isPresent()) {
            return ResponseEntity.ok(highestGrossingMovies.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public HighestGrossingMovies createMovie(@RequestBody HighestGrossingMovies highestGrossingMovies) {
        return highestGrossingMoviesService.saveMovie(highestGrossingMovies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HighestGrossingMovies> updateMovies(@PathVariable Long id, @RequestBody HighestGrossingMovies highestGrossingMovies) {
        Optional<HighestGrossingMovies> existingGame = Optional.ofNullable(highestGrossingMoviesService.findById(id));
        if (existingGame.isPresent()) {
            highestGrossingMovies.setId(id);
            return ResponseEntity.ok(highestGrossingMoviesService.saveMovie(highestGrossingMovies));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        Optional<HighestGrossingMovies> existingMovie = Optional.ofNullable(highestGrossingMoviesService.findById(id));
        if (existingMovie.isPresent()) {
            highestGrossingMoviesService.deleteMovie(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
