package Application.Controllers;

import Application.Entities.HighestGrossingMovies;
import Application.Services.HighestGrossingMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<HighestGrossingMovies> getMovieById(@PathVariable int id) {
        Optional<HighestGrossingMovies> highestGrossingMovies = Optional.ofNullable(highestGrossingMoviesService.findById(id));
        return highestGrossingMovies.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }



    @PostMapping
    public HighestGrossingMovies createMovie(@RequestBody HighestGrossingMovies highestGrossingMovies) {
        return highestGrossingMoviesService.saveMovie(highestGrossingMovies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HighestGrossingMovies> updateMovies(@PathVariable int id, @RequestBody HighestGrossingMovies highestGrossingMovies) {
        Optional<HighestGrossingMovies> existingGame = Optional.ofNullable(highestGrossingMoviesService.findById(id));
        if (existingGame.isPresent()) {
            highestGrossingMovies.setMovieId(id);
            return ResponseEntity.ok(highestGrossingMoviesService.saveMovie(highestGrossingMovies));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        Optional<HighestGrossingMovies> existingMovie = Optional.ofNullable(highestGrossingMoviesService.findById(id));
        if (existingMovie.isPresent()) {
            highestGrossingMoviesService.deleteMovie(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
