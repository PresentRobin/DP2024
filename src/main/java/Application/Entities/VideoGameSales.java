package Application.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "videogamesales")
public class VideoGameSales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "rank")
    private int rank;

    @Column(name = "name")
    private String name;

    @Column(name = "platform")
    private String platform;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "na_sales")
    private double naSales;

    @Column(name = "eu_sales")
    private double euSales;

    @Column(name = "jp_sales")
    private double jpSales;

    @Column(name = "other_sales")
    private double otherSales;

    @Column(name = "global_sales")
    private double globalSales;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getNaSales() {
        return naSales;
    }

    public void setNaSales(double naSales) {
        this.naSales = naSales;
    }

    public double getEuSales() {
        return euSales;
    }

    public void setEuSales(double euSales) {
        this.euSales = euSales;
    }

    public double getJpSales() {
        return jpSales;
    }

    public void setJpSales(double jpSales) {
        this.jpSales = jpSales;
    }

    public double getOtherSales() {
        return otherSales;
    }

    public void setOtherSales(double otherSales) {
        this.otherSales = otherSales;
    }

    public double getGlobalSales() {
        return globalSales;
    }

    public void setGlobalSales(double globalSales) {
        this.globalSales = globalSales;
    }
}
