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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getLifetimeGross() {
        return lifetimeGross;
    }

    public void setLifetimeGross(BigDecimal lifetimeGross) {
        this.lifetimeGross = lifetimeGross;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public BigDecimal getRuntime() {
        return runtime;
    }

    public void setRuntime(BigDecimal runtime) {
        this.runtime = runtime;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public BigDecimal getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(BigDecimal voteAvg) {
        this.voteAvg = voteAvg;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Long getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Long franchiseId) {
        this.franchiseId = franchiseId;
    }
}
