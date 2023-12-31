package dev.stella.appi_ticket.models;
import java.sql.Date;

import dev.stella.appi_ticket.controllers.dto.IncidentDTO.Builder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "incidents")
public class Incident {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private Date date;
   private String name;
   private String title;
   private String description;
   private String departament;
   private String solution;
 @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Date getDate() {
    return date;
}
public void setDate(Date date) {
    this.date = date;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public String getDepartament() {
    return departament;
}
public void setDepartament(String departament) {
    this.departament = departament;
}
public String getSolution() {
    return solution;
}
public void setSolution(String solution) {
    this.solution = solution;
}
public static Builder builder() {
    return null;
}
}
