package dev.stella.appi_ticket.controllers.dto;

import java.util.Date;

public class IncidentDTO {
   private Long id;
   private String title;
   private Date date;
   private String description;

   private IncidentDTO(Builder builder) {
       this.id = builder.id;
       this.title = builder.title;
       this.date = builder.date;
       this.description = builder.description;
   }

   public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public void setName(String name) {
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    this.date = date;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public static class Builder {
       private Long id;
       private String title;
       private Date date;
       private String description;

       public static Builder id(Long id) {
        
           return null ;
       }

       public Builder name(String name) {
           return this;
       }

       public Builder title(String title) {
           this.title = title;
           return this;
       }

       public Builder date(Date date) {
           this.date = date;
           return this;
       }

       public Builder description(String description) {
           this.description = description;
           return this;
       }

       public IncidentDTO build() {
           return new IncidentDTO(this);
       }
   }

public String getName() {
    return null;
}
}
