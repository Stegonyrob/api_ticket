package dev.stella.appi_ticket.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.IUserService;

@RestController
@RequestMapping(path = "/ticket/users")
public class UserController {

  @Autowired
  private IUserService userService;

  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
      return ResponseEntity.ok(userService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
      return userService.findById(id)
              .map(ResponseEntity::ok)
              .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {
      return ResponseEntity.ok(userService.save(user));
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
      return userService.findById(id)
              .map(user -> {
                 updateUserFields(user, updatedUser);
                 return ResponseEntity.ok(userService.save(user));
              })
              .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
      userService.deleteById(id);
      return ResponseEntity.noContent().build();
  }

  private void updateUserFields(User user, User updatedUser) {
      user.setName(updatedUser.getName());
      user.setUsername(updatedUser.getUsername());
      user.setPassword(updatedUser.getPassword());
      user.setRole(updatedUser.getRole());
  }
}
