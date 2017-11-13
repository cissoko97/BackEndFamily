package com.example.backendfamily.data.service;

import com.example.backendfamily.data.entity.Media;

import java.util.List;

public interface IMediaService {
    Media create(Media media);
    List<Media> getAll();
}
