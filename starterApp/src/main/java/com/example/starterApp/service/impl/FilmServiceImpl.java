package com.example.starterApp.service.impl;

import com.example.starterApp.entity.Film;
import com.example.starterApp.repository.FilmRepository;
import com.example.starterApp.service.FilmService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    public FilmServiceImpl(final FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    @Override
    public Optional<Film> getByTitle(String title) {
        return filmRepository.findById(1);
    }
}
