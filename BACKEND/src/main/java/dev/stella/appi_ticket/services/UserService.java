package dev.stella.appi_ticket.services;

import java.util.List;
import org.springframework.stereotype.Service;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.repositories.UserRepository;


@Service
public class UserService {
    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public List<User> getAll(){
    List<User> users = (List<User>) repository.findAll();
    return users;
    }
    public User getById(Long id) throws Exception{
        User users  = repository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"))
    return User;
    }
     public User save(User user) {

        User newUser = repository.save(user);
        return newUser;
    }


    
    public User update(Long id, User user) throws Exception {

       User updatingUser =  repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));

        updatingUser.setName(user.getName());
        updatingUser.setUsername(user.getUsername());
        updatingUser.setPassword(user.getPassword());
        updatingUser.setRole(user.getRole());
        User updateduser = repository.save(updatingUser);

        return updateduser;
    }

    public String delete(Long id) throws Exception {

        User user = ((Object) repository.findById(id)).orElseThrow(() -> new UserNotFoundException("User not found"));

        repository.delete(user);

        String message = "The User is deleted";

        return message;
    }

}
