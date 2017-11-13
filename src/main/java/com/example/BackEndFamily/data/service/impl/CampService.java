package com.example.backendfamily.data.service.impl;

import com.example.backendfamily.data.entity.Camp;
import com.example.backendfamily.data.repository.CampRepository;
import com.example.backendfamily.data.service.ICampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("application.properties")
public class CampService implements ICampService {
    @Autowired
    CampRepository campRepository;

    @Override
    public Camp create(Camp camp) {
        return campRepository.save(camp);
    }

    @Override
    public List<Camp> findAll() {
        return (List<Camp>) campRepository.findAll();
    }

    @Override
    public Camp findOne(long idCamp) {
        return campRepository.findOne(idCamp);
    }
}
