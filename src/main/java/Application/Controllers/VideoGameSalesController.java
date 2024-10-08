package Application.Controllers;

import Application.Entities.VideoGameSales;
import Application.Services.VideoGameSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/videogames")
public class VideoGameSalesController {

    private final VideoGameSalesService videoGameSalesService;

    @Autowired
    public VideoGameSalesController(VideoGameSalesService videoGameSalesService) {
        this.videoGameSalesService = videoGameSalesService;
    }

    @GetMapping
    public List<VideoGameSales> getAllVideoGames() {
        return videoGameSalesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VideoGameSales> getVideoGameById(@PathVariable Long id) {
        Optional<VideoGameSales> videoGameSales = Optional.ofNullable(videoGameSalesService.findById(id));
        return videoGameSales.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public VideoGameSales createVideoGame(@RequestBody VideoGameSales videoGameSales) {
        return videoGameSalesService.save(videoGameSales);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VideoGameSales> updateVideoGame(@PathVariable Long id, @RequestBody VideoGameSales videoGameSales) {
        Optional<VideoGameSales> existingGame = Optional.ofNullable(videoGameSalesService.findById(id));
        if (existingGame.isPresent()) {
            videoGameSales.setId(id);
            return ResponseEntity.ok(videoGameSalesService.save(videoGameSales));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideoGame(@PathVariable Long id) {
        Optional<VideoGameSales> existingGame = Optional.ofNullable(videoGameSalesService.findById(id));
        if (existingGame.isPresent()) {
            videoGameSalesService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
