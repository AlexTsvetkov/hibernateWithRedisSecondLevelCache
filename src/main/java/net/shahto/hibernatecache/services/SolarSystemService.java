package net.shahto.hibernatecache.services;

import jakarta.transaction.Transactional;
import net.shahto.hibernatecache.model.Planet;
import net.shahto.hibernatecache.repositories.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolarSystemService {

    private final PlanetRepository planetRepository;

    public SolarSystemService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    @Transactional
    public Optional<Planet> getPlanetById(long id) {
        return planetRepository.findById(id);
    }

    @Transactional
    public Planet updatePlanet(Planet planet) {
        return planetRepository.save(planet);
    }
}