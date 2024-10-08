package Application.Services;

import Application.Entities.MoistMeter;
import Application.Repos.MoistMeterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoistMeterService {

    private final MoistMeterRepo moistMeterRepo;

    @Autowired
    public MoistMeterService(MoistMeterRepo moistMeterRepo) {
        this.moistMeterRepo = moistMeterRepo;
    }

    public List<MoistMeter> findAll() {
        return moistMeterRepo.findAll();
    }

    public Optional<MoistMeter> findById(int id) {
        return moistMeterRepo.findById(id);
    }

    public MoistMeter save(MoistMeter moistmeterReview) {
        return moistMeterRepo.save(moistmeterReview);
    }

    public void deleteById(int id) {
        moistMeterRepo.deleteById(id);
    }
}
