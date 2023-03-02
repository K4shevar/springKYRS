package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
