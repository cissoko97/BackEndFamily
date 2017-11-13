package com.example.backendfamily.data.controller;

import com.example.backendfamily.data.entity.Camp;
import com.example.backendfamily.data.entity.Media;
import com.example.backendfamily.data.service.ICampService;
import com.example.backendfamily.data.service.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampRestController {
    @Autowired
    ICampService iCampService;

    @Autowired
    IMediaService iMediaService;

    @RequestMapping(value = "camps/" , method = RequestMethod.POST)
    public Camp addCamp(@RequestBody Camp camp)
    {
        return iCampService.create(camp);
    }

    @RequestMapping(value = "camps/" , method = RequestMethod.GET)
    public List<Camp> getAllCamp()
    {
        return iCampService.findAll();
    }

    @RequestMapping(value = "camps/{idcamp}/media" , method = RequestMethod.POST)
    public Media campAddMedia(@PathVariable long idcamp ,@RequestBody Media media)
    {
        media.setCamp(iCampService.findOne(idcamp));
        return iMediaService.create(media);
    }
    @RequestMapping(value = "media" , method = RequestMethod.GET)
    public List<Media> allMedia()
    {
        return iMediaService.getAll();
    }
}
