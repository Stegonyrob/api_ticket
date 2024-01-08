package dev.stella.appi_ticket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.stella.appi_ticket.models.Incident;
@Repository
public interface IncidentRepository extends CrudRepository <Incident,Long>{
    
}


 