package dev.stella.persistence.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.repositories.UserRepository;
import dev.stella.persistence.IUserDAO;

@Component
public class UserDAOImpl implements IUserDAO {

@Autowired
private UserRepository userRepository;

@Override
public List<User> findAll() {
return (List<User>) userRepository.findAll();  
}

@Override
public Optional<User> findById(Long id) {
return  userRepository.findById(id);

}

@Override
public void save(User user) {
userRepository.save(user);     
}

@Override
public void deleteById(Long id) {
userRepository.deleteById(id);     
}

@Override
public User findByUsernameAndPassword(String username, String password) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByUsernameAndPassword'");
}

@Override
public User findByUsername(String username) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
}

  
    
}
