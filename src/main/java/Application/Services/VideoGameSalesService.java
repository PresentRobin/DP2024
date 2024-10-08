package Application.Services;

import Application.Entities.VideoGameSales;
import Application.Repos.VideoGameSalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoGameSalesService {

    private final VideoGameSalesRepo videoGameSalesRepository;

    @Autowired
    public VideoGameSalesService(VideoGameSalesRepo videoGameSalesRepository) {
        this.videoGameSalesRepository = videoGameSalesRepository;
    }

    public List<VideoGameSales> findAll() {
        return videoGameSalesRepository.findAll();
    }

    public VideoGameSales findById(int id) {
        return videoGameSalesRepository.findById(id).orElse(null);
    }

    public VideoGameSales save(VideoGameSales videoGameSales) {
        return videoGameSalesRepository.save(videoGameSales);
    }

    public void deleteById(int id) {
        videoGameSalesRepository.deleteById(id);
    }
}
