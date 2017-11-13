package com.example.backendfamily.data.service;

import com.example.backendfamily.data.entity.User;

import java.util.List;

public interface IUserService {
    User findOne(Long idUser);
    User create(User user);
    User update(User user);
    User findByEmailAndPassword(String email, String password);
    void deleteAll();
    List<User> findAll();
}
