package com.example.backendfamily.data.service.impl;

import com.example.backendfamily.data.entity.Testimony;
import com.example.backendfamily.data.repository.TestimonyRepository;
import com.example.backendfamily.data.service.ITestimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("application.properties")
public class TestimonyService implements ITestimonyService{
    @Autowired
    TestimonyRepository testimonyRepository;

    @Override
    public Testimony findOne(Long id) {
        return testimonyRepository.findOne(id);
    }

    @Override
    public Testimony create(Testimony testimony) {
        return testimonyRepository.save(testimony);
    }

    @Override
    public List<Testimony> findAll() {
        return (List<Testimony>) testimonyRepository.findAll();
    }
}
