package dev.stella.appi_ticket.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.stella.appi_ticket.models.User;

@Repository
public interface UserRepository extends CrudRepository <User,Long>{

    Optional<User> findByUsernameAndPassword(String username, String password);

    
}
