package dev.stella.appi_ticket.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.stella.appi_ticket.controllers.dto.IncidentDTO;
import dev.stella.appi_ticket.controllers.dto.IncidentDTO.Builder;
import dev.stella.appi_ticket.models.Incident;
import dev.stella.appi_ticket.services.IIncidentService;

@RestController
@RequestMapping(path = "/api/incidents")
public class IncidentController {
  @Autowired
  private IIncidentService incidentService;

  @GetMapping(path = "/find/{id}")
  public ResponseEntity<?> findById(@PathVariable Long id){
      Optional<Incident> incidentOptional = incidentService.findById(id);
      if (incidentOptional.isPresent()) {
          Incident incident = incidentOptional.get();
          IncidentDTO incidentDTO = IncidentDTO.Builder.id(incident.getId())
              .name(incident.getName())
              .title(incident.getTitle())
              .date(incident.getDate())
              .description(incident.getDescription())
              .build();
          return ResponseEntity.ok(incidentDTO);
          
      }
      return ResponseEntity.notFound().build();
  }

  @GetMapping("/findAll")
  public ResponseEntity<?> findAll(){
      List<IncidentDTO> incidentDTOList = incidentService.findAll()
          .stream()
          .map(incident -> IncidentDTO.Builder.id(incident.getId())
              .name(incident.getName())
              .title(incident.getTitle())
              .date(incident.getDate())
              .description(incident.getDescription())
              .build())
          .collect(Collectors.toList());

      return ResponseEntity.ok(incidentDTOList);
  }

  @PostMapping("/save")
  public ResponseEntity<?> saveIncident(@RequestBody IncidentDTO incidentDTO) throws URISyntaxException {
      if (incidentDTO.getName().isBlank()) {
          return ResponseEntity.badRequest().build();
      }

      incidentService.save(((Builder) Incident.builder()).name(incidentDTO.getName()).build());
      return ResponseEntity.created(new URI("/api/incident/save")).build();
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<?> updateIncident(@PathVariable Long id, @RequestBody IncidentDTO incidentDTO){
      Optional<Incident> incidentOptional = incidentService.findById(id);

      if(incidentOptional.isPresent()){
          Incident incident = incidentOptional.get();
          incident.setName(incidentDTO.getName());
          incidentService.save(incident);
          return ResponseEntity.ok("Registro Actualizado");
      }

      return ResponseEntity.notFound().build();
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> deleteById(@PathVariable Long id){
      if(id != null){
          incidentService.deleteById(id);
          return ResponseEntity.noContent().build();
      }

      return ResponseEntity.badRequest().body("El parametro id se encuentra vacio");
  }
}
