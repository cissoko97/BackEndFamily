package com.example.backendfamily.data.service;

import com.example.backendfamily.data.entity.Camp;

import java.util.List;

public interface ICampService {
    Camp create(Camp camp);
    List<Camp> findAll();
    Camp findOne(long idCamp) ;
}
