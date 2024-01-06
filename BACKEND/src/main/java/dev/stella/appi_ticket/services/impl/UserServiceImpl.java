package dev.stella.appi_ticket.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.IUserService;
import dev.stella.persistence.IUserDAO;

@Service
public class UserServiceImpl implements IUserService{

@Autowired
private IUserDAO userDAO;


    @Override
    public List<User> findAll() {
    return userDAO.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
 return userDAO.findById(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
 }

    @Override
    public void deleteById(Long id) {
 userDAO.deleteById(id);
    }
    
    
}
