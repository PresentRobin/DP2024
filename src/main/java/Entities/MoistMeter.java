package Entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "moistmeter_reviews")
public class MoistMeter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "review_date")
    private Date reviewDate;

    @Column(name = "category")
    private String category;

    @Column(name = "title")
    private String title;

    @Column(name = "imdb_rating")
    private double imdbRating;

    @Column(name = "rt_critics_rating")
    private double rtCriticsRating;

    @Column(name = "moistmeter_rating")
    private double moistmeterRating;

    @Column(name = "genre")
    private String genre;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public double getRtCriticsRating() {
        return rtCriticsRating;
    }

    public void setRtCriticsRating(double rtCriticsRating) {
        this.rtCriticsRating = rtCriticsRating;
    }

    public double getMoistmeterRating() {
        return moistmeterRating;
    }

    public void setMoistmeterRating(double moistmeterRating) {
        this.moistmeterRating = moistmeterRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
