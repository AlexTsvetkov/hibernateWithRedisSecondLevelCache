package net.shahto.hibernatecache.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.Set;

@Data
@Entity
@Cache(region = "planetCache", usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "planets")
public class Planet {
    @Id
    private long id;
    private String name;
    private String type;
    private float mass;
    private int diameter;
    private float distance;
    @OneToMany(mappedBy="planet", cascade=CascadeType.ALL)
    private Set<Moon> moons;
}