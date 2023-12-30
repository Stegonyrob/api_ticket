package dev.stella.appi_ticket.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import dev.stella.appi_ticket.models.User;


public interface UserRepository extends JpaRepository <User,Long>{

    
}
