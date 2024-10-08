package Application.Repos;

import Application.Entities.HighestGrossingMovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighestGrossingMoviesRepo extends JpaRepository<HighestGrossingMovies, Long> {
}
