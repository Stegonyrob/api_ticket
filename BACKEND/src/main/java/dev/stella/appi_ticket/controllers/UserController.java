package dev.stella.appi_ticket.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.stella.appi_ticket.controllers.dto.UserDTO;
import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.IUserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
   @Autowired
   private IUserService userService;


   
   @PostMapping("/save")
   public ResponseEntity<?> saveUSer(@RequestBody UserDTO userDTO) throws URISyntaxException {
       if (((String) userDTO.getName()).isBlank()) {
           return ResponseEntity.badRequest().build();
       }

   
       return ResponseEntity.created(new URI("/api/user/save")).build();
   }

   @PutMapping("/update/{id}")
   public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
       Optional<User> userOptional = userService.findById(id);

       if(userOptional.isPresent()){
           User user = userOptional.get();
                 userService.save(user);
           return ResponseEntity.ok("Registro Actualizado");
       }

       return ResponseEntity.notFound().build();
   }

   @DeleteMapping("/delete/{id}")
   public ResponseEntity<?> deleteById(@PathVariable Long id){
       if(id != null){
           userService.deleteById(id);
           return ResponseEntity.noContent().build();
       }

       return ResponseEntity.badRequest().body("El parametro id se encuentra vacio");
   }
}