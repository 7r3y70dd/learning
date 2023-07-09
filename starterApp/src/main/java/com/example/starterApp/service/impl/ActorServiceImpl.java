package com.example.starterApp.service.impl;

import com.example.starterApp.entity.Actor;
import com.example.starterApp.repository.ActorRepository;
import com.example.starterApp.service.ActorService;
import org.springframework.stereotype.Component;

@Component
public class ActorServiceImpl implements ActorService {


    private final com.example.starterApp.repository.ActorRepository ActorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.ActorRepository = actorRepository;
    }

    public Actor getByActorId(Integer actor_id){
        return ActorRepository.getReferenceById(actor_id);
    }


    @Override
    public Actor getActorById(Integer actor_id) {
        return ActorRepository.getReferenceById(actor_id);
    }
}
