package com.example.backendfamily.data.service;

import com.example.backendfamily.data.entity.Testimony;

import java.util.List;

public interface ITestimonyService {
    Testimony findOne(Long id);
    Testimony create(Testimony testimony);
    List<Testimony> findAll();
}
