package com.example.backendfamily.data.controller;

import com.example.backendfamily.data.entity.Camp;
import com.example.backendfamily.data.entity.Participation;
import com.example.backendfamily.data.entity.Testimony;
import com.example.backendfamily.data.entity.User;
import com.example.backendfamily.data.service.ICampService;
import com.example.backendfamily.data.service.IParticipationService;
import com.example.backendfamily.data.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {


    @Autowired
    IUserService iUserService;

    @Autowired
    IParticipationService iParticipationService;

    @Autowired
    ICampService iCampService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/users/get", method = RequestMethod.GET)
    public User PersonneCollection(@RequestParam("email") String email, @RequestParam("password") String password) {
        User user = iUserService.findByEmailAndPassword(email, password);
        //user.setParticipations(null);
        return user;
    }

    @RequestMapping(value = "/users/", method = RequestMethod.POST)
    public User Put(@RequestBody User user) {
        return iUserService.create(user);

    }

    @RequestMapping(value = "/users/", method = RequestMethod.DELETE)
    public void cleanUser() {
        iUserService.deleteAll();
    }

    @RequestMapping(value = "/users/", method = RequestMethod.GET)
    public List<User> gets() {
        return (List<User>) iUserService.findAll();
    }

    @RequestMapping(value = "/users/{id}/participations", method = RequestMethod.POST)
    public Participation addParticipation(@PathVariable("id") Long idUser , @RequestParam(name = "idcamp") Long idCamp) {
        User user = iUserService.findOne(idUser);
        Camp camp = iCampService.findOne(idCamp);
        return iParticipationService.create(new Participation((long) 0, camp, user));
    }
}
