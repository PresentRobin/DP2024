package Application.Entities;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "highestgrossingmovies")
public class HighestGrossingMovies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MovieID")
    private int movieId;

    @Column(name = "MovieIndex")
    private int movieIndex;

    @Column(name = "Title")
    private String title;

    @Column(name = "Lifetime_Gross")
    private BigDecimal lifetimeGross;

    @Column(name = "Year")
    private Integer year;

    @Column(name = "Studio")
    private String studio;

    @Column(name = "Rating")
    private String rating;

    @Column(name = "Runtime")
    private int runtime;

    @Column(name = "Budget")
    private int budget;

    @Column(name = "ReleaseDate")
    private Date releaseDate;

    @Column(name = "VoteAvg")
    private double voteAvg;

    @Column(name = "VoteCount")
    private Integer voteCount;

    @Column(name = "FranchiseID")
    private int franchiseId;

    // Getters and Setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
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

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(double voteAvg) {
        this.voteAvg = voteAvg;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public int getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(int franchiseId) {
        this.franchiseId = franchiseId;
    }
}
