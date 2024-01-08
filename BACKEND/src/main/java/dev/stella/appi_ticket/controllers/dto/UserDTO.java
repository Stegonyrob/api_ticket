package dev.stella.appi_ticket.controllers.dto;



public class UserDTO {
  private Long id;
  private String name;
  private String username;
  private String password;
  private String role;

  private UserDTO(Builder builder) {
      this.id = builder.id;
      this.name = builder.name;
      this.username = builder.username;
      this.password = builder.password;
      this.role = builder.role;
  }

  public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getRole() {
    return role;
}

public void setRole(String role) {
    this.role = role;
}

public static class Builder {
      private Long id;
      private String name;
      private String username;
      private String password;
      private String role;

      public Builder id(Long id) {
          this.id = id;
          return this;
      }

      public Builder name(String name) {
          this.name = name;
          return this;
      }

      public Builder username(String username) {
          this.username = username;
          return this;
      }

      public Builder password(String password) {
          this.password = password;
          return this;
      }

      public Builder role(String role) {
          this.role = role;
          return this;
      }

      public UserDTO build() {
          return new UserDTO(this);
      }
  }
}
