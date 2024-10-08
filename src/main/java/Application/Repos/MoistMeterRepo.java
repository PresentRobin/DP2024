package Application.Repos;

import Application.Entities.MoistMeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoistMeterRepo extends JpaRepository<MoistMeter, Integer> {
}
