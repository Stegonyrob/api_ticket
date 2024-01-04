package dev.stella.appi_ticket.repositories;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.stella.appi_ticket.models.User;

@Repository
public interface UserRepository extends CrudRepository <User,Long>{

   

    
}
