package dev.stella.appi_ticket.repositories;

import java.util.List;

import dev.stella.appi_ticket.models.Incident;
import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.UserupdatingUser;

public interface UserRepository {

    List<User> findAll();

    User save(User user);

    Object findById(Long id);

    void delete(UserupdatingUser userupdatingUser);

    void delete(User user);
    
}
