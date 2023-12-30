package dev.stella.appi_ticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.stella.appi_ticket.models.Incident;

public interface IncidentRepository extends JpaRepository <Incident,Long>{
    
}
