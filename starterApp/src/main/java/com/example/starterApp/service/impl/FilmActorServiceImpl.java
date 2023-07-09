package com.example.starterApp.service.impl;

import com.example.starterApp.entity.FilmActor;
import com.example.starterApp.repository.FilmActorRepository;
import com.example.starterApp.service.FilmActorService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FilmActorServiceImpl implements FilmActorService {

    private final FilmActorRepository filmActorRepository;

    public FilmActorServiceImpl(FilmActorRepository filmActorRepository) {
        this.filmActorRepository = filmActorRepository;
    }

    @Override
    public List<FilmActor> findByFilmId(Integer idByTitle) {
        return filmActorRepository.findByFilmId(idByTitle);
    }

//    @Override
//    public List<FilmActor> findByFilmId(Integer film_id) {
//        return (List<FilmActor>) filmActorRepository.findByFilmId(film_id);
//    }


}
