package dev.stella.appi_ticket.services;

import java.util.List;
import java.util.Optional;

import dev.stella.appi_ticket.controllers.dto.IncidentDTO;
import dev.stella.appi_ticket.models.Incident;

public interface IIncidentService {

  List<Incident> findAll();

  Optional<Incident> findById(Long id);

  Incident save(Incident incident);

  void deleteById(Long id);

  void save(IncidentDTO incidentDTO);
   
}
