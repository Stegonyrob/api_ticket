package dev.stella.appi_ticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.IUserService;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

 @Autowired
 private IUserService userService;

 @PostMapping("/login")
 public ResponseEntity<?> loginUser(@RequestBody User user) {
 User foundUser = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
 if (foundUser != null) {
     return ResponseEntity.ok("Login successful");
 } else {
     return ResponseEntity.status(401).body("Invalid credentials");
 }
 }
}

