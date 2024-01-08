package dev.stella.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import dev.stella.appi_ticket.models.User;
@Component
public interface IUserDAO {
    List<User> findAll();
    
    Optional<User> findById(Long id);

    void save(User user);

    void deleteById(Long id);

    User findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}
