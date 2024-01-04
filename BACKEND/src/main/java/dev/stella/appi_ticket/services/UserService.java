package dev.stella.appi_ticket.services;


import org.springframework.stereotype.Service;

import dev.stella.appi_ticket.controllers.Message;
import dev.stella.appi_ticket.exceptions.UserNotFoundException;
import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.repositories.UserRepository;

@Service
public class UserService {
   private final UserRepository repository;

   public UserService(UserRepository repository) {
       this.repository = repository;
   }

  
   public User getById(Long id) throws UserNotFoundException {
       return repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
   }

   public User save(User user) {
       return repository.save(user);
   }

   public User update(Long id, User user) throws UserNotFoundException {
       User updatingUser = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
       updatingUser.setName(user.getName());
       updatingUser.setUsername(user.getUsername());
       updatingUser.setPassword(user.getPassword());
       updatingUser.setRole(user.getRole());
       return repository.save(updatingUser);
   }

   public Message delete(Long id) throws Exception {
        
    User user = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));

    String userName = user.getUsername();

    repository.delete(user);

    Message message = new Message();

    message.setMessage(userName + " is deleted from the movies table");

    return message;
}
}
