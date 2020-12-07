package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;

    @OneToMany(mappedBy = "firstCity", cascade = CascadeType.ALL)
    private List<Distance> firstDistancePoints = new ArrayList<>();

    @OneToMany(mappedBy = "secondCity", cascade = CascadeType.ALL)
    private List<Distance> secondDistancePoints = new ArrayList<>();

    public City() {
    }

    public City(String name, BigDecimal latitude, BigDecimal longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public List<Distance> getFirstDistancePoints() {
        return firstDistancePoints;
    }

    public void setFirstDistancePoints(List<Distance> firstDistancePoints) {
        this.firstDistancePoints = firstDistancePoints;
    }

    public List<Distance> getSecondDistancePoints() {
        return secondDistancePoints;
    }

    public void setSecondDistancePoints(List<Distance> secondDistancePoints) {
        this.secondDistancePoints = secondDistancePoints;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", firstDistancePoints=" + firstDistancePoints +
                ", secondDistancePoints=" + secondDistancePoints +
                '}';
    }
}
