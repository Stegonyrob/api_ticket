package dev.stella.appi_ticket.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.stella.appi_ticket.controllers.dto.IncidentDTO;
import dev.stella.appi_ticket.models.Incident;
import dev.stella.appi_ticket.services.IIncidentService;
import dev.stella.persistence.IIncidentDAO;

@Service
public class IncidentServiceImpl implements IIncidentService {

  @Autowired
  private IIncidentDAO incidentDAO;

  @Override
  public List<Incident> findAll() {
      return incidentDAO.findAll();
  }

  @Override
  public Optional<Incident> findById(Long id) {
      return incidentDAO.findById(id);
  }

  @Override
  public Incident save(Incident incident) {
      validateIncident(incident);
      try {
          return incidentDAO.save(incident);
      } catch (Exception e) {
          throw new RuntimeException("Error al guardar el incidente.", e);
      }
  }

  @Override
  public void deleteById(Long id) {
      incidentDAO.deleteById(id);
  }

  @Override
  public void save(IncidentDTO incidentDTO) {
     throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

  private void validateIncident(Incident incident) {
      if (incident == null || incident.getName() == null || incident.getName().isEmpty()) {
          throw new IllegalArgumentException("El nombre del incidente no puede estar vacío.");
      }
  }
}
