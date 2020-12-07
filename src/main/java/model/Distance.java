package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "distances")
public class Distance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int distance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "first_city_id")
    private City firstCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "second_city_id")
    private City secondCity;

    public Distance() {
    }

    public Distance(int distance) {
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public City getFirstCity() {
        return firstCity;
    }

    public void setFirstCity(City firstCity) {
        this.firstCity = firstCity;
    }

    public City getSecondCity() {
        return secondCity;
    }

    public void setSecondCity(City secondCity) {
        this.secondCity = secondCity;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "id=" + id +
                ", distance=" + distance +
                ", firstCity=" + firstCity +
                ", secondCity=" + secondCity +
                '}';
    }
}
