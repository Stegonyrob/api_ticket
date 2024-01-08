package dev.stella.appi_ticket.services;

import java.util.List;
import java.util.Optional;

import dev.stella.appi_ticket.models.User;

public interface IUserService {

  List<User> findAll();

  Optional<User> findById(Long id);

  User save(User user);

  void deleteById(Long id);

User findByUsernameAndPassword(String username, String password);

boolean checkUserRole(String username, String role);
   
}
