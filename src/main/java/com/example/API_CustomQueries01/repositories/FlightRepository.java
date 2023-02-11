package com.example.API_CustomQueries01.repositories;

import com.example.API_CustomQueries01.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-flight")
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
