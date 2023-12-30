package dev.stella.appi_ticket.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.stella.appi_ticket.exceptions.IncidentNotFoundException;
import dev.stella.appi_ticket.models.Incident;
import dev.stella.appi_ticket.repositories.IncidentRepository;

@Service
public class IncidentService {
    private final IncidentRepository repository;

    public IncidentService(IncidentRepository repository) {
        this.repository = repository;
    }

   public List<Incident> getAll(){
    return repository.findAll();
   }
   public Incident getById(Long id) throws IncidentNotFoundException{
    return repository.findById(id).orElseThrow(() ->  new IncidentNotFoundException("Incident not found")  );
   }
    
   public Incident save(Incident incident){
    return repository.save(incident);
   }
   public Incident update(Long id , Incident incident) throws IncidentNotFoundException{
    Incident updatingIncident = repository.findById(id).orElseThrow(() -> new IncidentNotFoundException("Incident not found"));
    updatingIncident.setDate(incident.getDate());
    updatingIncident.setName(incident.getName());
    updatingIncident.setDepartament(incident.getDepartament());
    updatingIncident.setDescription(incident.getDescription());
    updatingIncident.setTitle(incident.getTitle());
    updatingIncident.setSolution(incident.getSolution());
    return repository.save(updatingIncident);
   }
    public String delete(Long id) throws IncidentNotFoundException{
        Incident incident = repository.findById(id).orElseThrow(() -> new IncidentNotFoundException("Incident not found"));
 repository.delete(incident);
return " The incident is deleted" ;  }
}
