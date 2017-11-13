package com.example.backendfamily.data.service.impl;

import com.example.backendfamily.data.entity.Media;
import com.example.backendfamily.data.repository.MediaRepository;
import com.example.backendfamily.data.service.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("application.properties")
public class MediaService implements IMediaService {
    @Autowired
    MediaRepository mediaRepository;

    @Override
    public Media create(Media media) {
        return mediaRepository.save(media);
    }

    @Override
    public List<Media> getAll() {
        return (List<Media>) mediaRepository.findAll();
    }
}
