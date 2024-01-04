package dev.stella.appi_ticket.controllers;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.UserService;
@RestController
@RequestMapping(path = "${api-endpoint}/users")
public class UserController {

  UserService service;

  public UserController(UserService service) {
      this.service = service;
  }


  @GetMapping(path = "/{id}")
  public ResponseEntity<User> show(@PathVariable("id") Long id) throws Exception {
      User user = this.service.getById(id);
      return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(user);
  }

  @PostMapping(path = "")
  public ResponseEntity<User> create(@RequestBody User user) {
      User newUser = this.service.save(user);
      return ResponseEntity.status(201).body(newUser);
  }
  @PutMapping("/{id}")
  public ResponseEntity<User> update(@PathVariable("id") Long id, @RequestBody User user) throws Exception {

      User updatedUser = service.update(id, user);

      return ResponseEntity.status(200).body(updatedUser);
  }
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Message> remove(@PathVariable("id") Long id) throws Exception { 

      Message delete = service.delete(id);

      return ResponseEntity.status(200).body(delete);
  }

}