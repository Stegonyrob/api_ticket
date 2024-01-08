package dev.stella.persistence.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.stella.appi_ticket.models.Incident;

import dev.stella.appi_ticket.repositories.IncidentRepository;
import dev.stella.persistence.IIncidentDAO;



@Component
public class IncidentDAOImpl implements IIncidentDAO{

@Autowired
private IncidentRepository incidentRepository;

@Override
public List<Incident> findAll() {
return (List<Incident>) incidentRepository.findAll();  
}

@Override
public Optional<Incident> findById(Long id) {
    return  incidentRepository.findById(id);}



@Override
public void deleteById(Long id) {
  incidentRepository.deleteById(id);}

@Override
public Incident save(Incident incident) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'save'");
}


    
}
