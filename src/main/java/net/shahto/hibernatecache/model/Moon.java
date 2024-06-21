package net.shahto.hibernatecache.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "moons")
public class Moon {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name="planet_id", nullable=false)
    private Planet planet;
    private String name;
    private int diameter;

    /**
     * Eager load of planets
     * @return
     */
    @Override
    public String toString() {
        return "Moon{" +
                "id=" + id +
                ", planet=" + planet.getName() +
                ", name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}