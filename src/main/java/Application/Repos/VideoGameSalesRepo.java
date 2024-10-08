package Application.Repos;

import Application.Entities.VideoGameSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameSalesRepo extends JpaRepository<VideoGameSales, Integer> {
}
