package Repos;

import Entities.MoistMeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoistMeterRepo extends JpaRepository<MoistMeter, Long> {
}
