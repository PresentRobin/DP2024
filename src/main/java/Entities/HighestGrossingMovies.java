package Entities;

import javax.persistence.*;

@Entity
@Table(name = "highest_grossing_movies")
public class HighestGrossingMovies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "movie_info")
    private String movieInfo;

    @Column(name = "year")
    private int year;

    @Column(name = "distributor")
    private String distributor;

    @Column(name = "budget")
    private long budget;

    @Column(name = "domestic_opening")
    private long domesticOpening;

    @Column(name = "domestic_sales")
    private long domesticSales;

    @Column(name = "international_sales")
    private long internationalSales;

    @Column(name = "world_wide_sales")
    private long worldWideSales;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "genre")
    private String genre;

    @Column(name = "running_time")
    private int runningTime;

    @Column(name = "license")
    private String license;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public long getDomesticOpening() {
        return domesticOpening;
    }

    public void setDomesticOpening(long domesticOpening) {
        this.domesticOpening = domesticOpening;
    }

    public long getDomesticSales() {
        return domesticSales;
    }

    public void setDomesticSales(long domesticSales) {
        this.domesticSales = domesticSales;
    }

    public long getInternationalSales() {
        return internationalSales;
    }

    public void setInternationalSales(long internationalSales) {
        this.internationalSales = internationalSales;
    }

    public long getWorldWideSales() {
        return worldWideSales;
    }

    public void setWorldWideSales(long worldWideSales) {
        this.worldWideSales = worldWideSales;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
