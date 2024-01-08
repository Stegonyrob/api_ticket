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

  public String getTitle() {
      return title;
  }

  public Date getDate() {
      return date;
  }

  public String getDescription() {
      return description;
  }

  public static class Builder {
      private Long id;
      private String title;
      private Date date;
      private String description;

      public Builder id(Long id) {
          this.id = id;
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

    public Builder name(String name) {
        return null;
    }
  }

public String getName() {
    return null;
}
}
