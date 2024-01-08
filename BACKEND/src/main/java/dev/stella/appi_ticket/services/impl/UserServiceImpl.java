package dev.stella.appi_ticket.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.stella.appi_ticket.models.User;
import dev.stella.appi_ticket.services.IUserService;
import dev.stella.persistence.IUserDAO;

@Service
public class UserServiceImpl implements IUserService {

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
 public void deleteById(Long id) {
   userDAO.deleteById(id);
 }

 @Override
 public User findByUsernameAndPassword(String username, String password) {
   return userDAO.findByUsernameAndPassword(username, password);
 }

 @Override
 public boolean checkUserRole(String username, String role) {
   User user = userDAO.findByUsername(username);
   if (user != null && user.getRole().equals(role)) {
       return true;
   } else {
       return false;
   }
 }

@Override
public User save(User user) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'save'");
}
}
