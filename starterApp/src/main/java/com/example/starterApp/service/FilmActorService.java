package com.example.starterApp.service;

import com.example.starterApp.entity.FilmActor;

import java.util.List;

public interface FilmActorService {
    public List<FilmActor> getByFilmId(Integer film_id);
}
