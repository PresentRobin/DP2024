package Services;

import Entities.VideoGameSales;
import Repos.VideoGameSalesRepo;
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

    public VideoGameSales findById(Long id) {
        return videoGameSalesRepository.findById(id).orElse(null);
    }

    public VideoGameSales save(VideoGameSales videoGameSales) {
        return videoGameSalesRepository.save(videoGameSales);
    }

    public void deleteById(Long id) {
        videoGameSalesRepository.deleteById(id);
    }
}
