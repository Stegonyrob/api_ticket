package dev.stella.persistence;

import java.util.List;
import java.util.Optional;

import dev.stella.appi_ticket.models.Incident;



public  interface IIncidentDAO {

    List<Incident> findAll();

    Optional<Incident> findById(Long id);

    void save(Incident incident);

    void deleteById(Long id);
} 
