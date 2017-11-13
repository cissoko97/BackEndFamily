package com.example.backendfamily.data.service.impl;

import com.example.backendfamily.data.entity.User;
import com.example.backendfamily.data.repository.UserRepository;
import com.example.backendfamily.data.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Component
@PropertySource("application.properties")
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User create(User user) {
        //user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findOne(Long idUser) {
        return userRepository.findOne(idUser);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
       //String hashpass = passwordEncoder.encode(password);
       return userRepository.findByEmailAndPassword(email,password);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
}
