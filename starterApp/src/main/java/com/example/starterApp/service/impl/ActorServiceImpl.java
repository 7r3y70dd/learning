package com.example.starterApp.service.impl;

import com.example.starterApp.entity.Actor;
import com.example.starterApp.repository.ActorRepository;
import com.example.starterApp.repository.FilmActorRepository;
import com.example.starterApp.service.ActorService;

public class ActorServiceImpl implements ActorService {
    private final com.example.starterApp.repository.ActorRepository ActorRepository;

    public ActorServiceImpl(ActorRepository ActorRepository) {
        this.ActorRepository = ActorRepository;
    }

    public Actor getByActorId(Integer actor_id){
        return ActorRepository.getReferenceById(actor_id);
    }
}
