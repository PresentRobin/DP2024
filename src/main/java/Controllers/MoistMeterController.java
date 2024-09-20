package Controllers;

import Entities.MoistMeter;
import Services.MoistMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/moistmeter")
public class MoistMeterController {

    private final MoistMeterService moistMeterService;

    @Autowired
    public MoistMeterController(MoistMeterService moistmeterReviewService) {
        this.moistMeterService = moistmeterReviewService;
    }

    @GetMapping
    public List<MoistMeter> getAllReviews() {
        return moistMeterService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MoistMeter> getReviewById(@PathVariable Long id) {
        Optional<MoistMeter> moist = moistMeterService.findById(id);
        if (moist.isPresent()) {
            return ResponseEntity.ok(moist.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public MoistMeter createReview(@RequestBody MoistMeter moistmeterReview) {
        return moistMeterService.save(moistmeterReview);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MoistMeter> updateReview(@PathVariable Long id, @RequestBody MoistMeter moistMeter) {
        Optional<MoistMeter> existingReview = moistMeterService.findById(id);
        if (existingReview.isPresent()) {
            moistMeter.setId(id);
            return ResponseEntity.ok(moistMeterService.save(moistMeter));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        Optional<MoistMeter> existingMoist = moistMeterService.findById(id);
        if (existingMoist.isPresent()) {
            moistMeterService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}