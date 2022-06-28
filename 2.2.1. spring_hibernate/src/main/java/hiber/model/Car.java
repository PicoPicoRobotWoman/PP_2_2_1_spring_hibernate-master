package hiber.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() { }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public void setId(Long id) { this.id = id; }
    public Long getId() { return id; }

    public void setModel(String model) { this.model = model; }
    public String getModel() { return model; }

    public void setSeries(int series) { this.series = series; }
    public int getSeries() { return series; }
}
