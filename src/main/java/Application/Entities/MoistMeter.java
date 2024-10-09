package Application.Entities;


import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "moistmeter")
public class MoistMeter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "review_date")
    private Date reviewDate;

    @Column(name = "category")
    private String category;

    @Column(name = "title")
    private String title;

    @Column(name = "imdb_rating")
    private Double imdbRating;

    @Column(name = "rt_critics_rating")
    private Double rtCriticsRating;

    @Column(name = "moistmeter_rating")
    private Double moistmeterRating;

    @Column(name = "genre")
    private String genre;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Double getRtCriticsRating() {
        return rtCriticsRating;
    }

    public void setRtCriticsRating(double rtCriticsRating) {
        this.rtCriticsRating = rtCriticsRating;
    }

    public Double getMoistmeterRating() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MoistMeter that)) return false;
        return Objects.equals(this.title, that.title);  // Check equality based on title
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title);  // Hash based on title
    }
}
