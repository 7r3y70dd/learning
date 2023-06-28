package com.example.starterApp.service.impl;

import com.example.starterApp.entity.Film;
import com.example.starterApp.repository.FilmRepository;
import com.example.starterApp.service.FilmService;
import org.springframework.stereotype.Component;

@Component
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    public FilmServiceImpl(final FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    @Override
    public Film getByTitle(String title) {
        return filmRepository.getByTitle(title);
    }
}
