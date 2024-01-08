package dev.stella.appi_ticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.stella.appi_ticket.models.Incident;
import dev.stella.appi_ticket.services.IIncidentService;

import java.util.List;

@RestController
@RequestMapping(path = "/ticket/incidents")
public class IncidentController {

  @Autowired
  private IIncidentService incidentService;

  @GetMapping
  public List<Incident> getAllIncidents() {
      return incidentService.findAll();
  }

  @GetMapping("/{id}")
  public Incident getIncidentById(@PathVariable Long id) {
      return incidentService.findById(id).orElseThrow(() -> new RuntimeException("Incident not found"));
  }

  @PostMapping
  public Incident createIncident(@RequestBody Incident incident) {
      return incidentService.save(incident);
  }

  @PutMapping("/{id}")
  public Incident updateIncident(@PathVariable Long id, @RequestBody Incident updatedIncident) {
      return incidentService.findById(id).map(incident -> {
          // Actualiza los campos necesarios aquí
          return incidentService.save(incident);
      }).orElseThrow(() -> new RuntimeException("Incident not found"));
  }

  @DeleteMapping("/{id}")
  public void deleteIncident(@PathVariable Long id) {
      incidentService.deleteById(id);
  }
}
