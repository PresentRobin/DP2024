package Repos;

import Entities.VideoGameSales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGameSalesRepo extends JpaRepository<VideoGameSales, Long> {
    VideoGameSales findByRank(int rank);
}
