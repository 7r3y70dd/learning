package com.example.starterApp.service.impl;

import com.example.starterApp.entity.FilmActor;
import com.example.starterApp.repository.FilmActorRepository;
import com.example.starterApp.service.FilmActorService;

import java.util.List;

public class FilmActorServiceImpl implements FilmActorService {

    private final FilmActorRepository filmActorRepository;

    public FilmActorServiceImpl(FilmActorRepository filmActorRepository) {
        this.filmActorRepository = filmActorRepository;
    }

    @Override
    public List<FilmActor> getByFilmId(Integer film_id) {
        return (List<FilmActor>) filmActorRepository.getReferenceById(film_id);
    }
}
