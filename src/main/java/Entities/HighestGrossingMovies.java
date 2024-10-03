package Entities;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "mytable")
public class HighestGrossingMovies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "lifetime_gross")
    private BigDecimal lifetimeGross;

    @Column(name = "year")
    private Integer year;

    @Column(name = "studio")
    private String studio;

    @Column(name = "rating")
    private String rating;

    @Column(name = "runtime")
    private BigDecimal runtime;

    @Column(name = "budget")
    private BigDecimal budget;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "vote_avg")
    private BigDecimal voteAvg;

    @Column(name = "vote_count")
    private Integer voteCount;

    @Column(name = "franchise_id")
    private Long franchiseId;

    // Getters and Setters
}
