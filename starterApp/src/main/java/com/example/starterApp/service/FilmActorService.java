package com.example.starterApp.service;

import com.example.starterApp.entity.Actor;
import com.example.starterApp.entity.FilmActor;

import java.util.List;

public interface FilmActorService {
    List<FilmActor> findByFilmId(Integer idByTitle);

//    List<FilmActor> findByFilmId(Integer film_id);

}
