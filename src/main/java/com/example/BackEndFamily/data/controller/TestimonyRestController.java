package com.example.backendfamily.data.controller;

import com.example.backendfamily.data.entity.Testimony;
import com.example.backendfamily.data.service.ITestimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestimonyRestController {
    @Autowired
    private ITestimonyService iTestimonyService;

    @RequestMapping(value = "testimony/one", method = RequestMethod.GET)
    public Testimony getOneTestimony(@RequestParam("id") Long id) {
        Testimony testimony = iTestimonyService.findOne(id);
        //System.out.println(testimony.getId()+" "+testimony.getLabel());
        return testimony;
    }

    @RequestMapping(value = "testimony/all", method = RequestMethod.GET)
    public List<Testimony> getAll() {
        return iTestimonyService.findAll();
    }
}
