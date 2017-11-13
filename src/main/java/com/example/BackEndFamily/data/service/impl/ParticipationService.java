package com.example.backendfamily.data.service.impl;

import com.example.backendfamily.data.entity.Participation;
import com.example.backendfamily.data.repository.ParticipationRepository;
import com.example.backendfamily.data.service.IParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class ParticipationService implements IParticipationService {
    @Autowired
    ParticipationRepository participationRepository;

    @Override
    public Participation create(Participation participation) {
        return participationRepository.save(participation);
    }
}
