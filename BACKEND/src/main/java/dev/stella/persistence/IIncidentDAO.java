package dev.stella.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import dev.stella.appi_ticket.models.Incident;


@Component
public  interface IIncidentDAO {

    List<Incident> findAll();

    Optional<Incident> findById(Long id);

    Incident save(Incident incident);

    void deleteById(Long id);
} 
