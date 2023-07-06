package com.example.starterApp.service.impl;

import com.example.starterApp.entity.Film;
import com.example.starterApp.repository.FilmRepository;
import com.example.starterApp.service.FilmService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    public FilmServiceImpl(final FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }


    @Override
    public Integer getIdByTitle(String title) {
        return filmRepository.getIdByTitle(title);
    }

    @Override
    public Film getByTitle(String title) {
        return filmRepository.getByTitle(title);
    }

    @Override
    public Film getByTitleIgnoreCase(String title){
        return filmRepository.getByTitleIgnoreCase(title);
    }

    public List<Film> getByKeyword(String keyword){
        return filmRepository.getByTitleContainingIgnoreCase(keyword);
    }

    @PostMapping
    public Film create(@RequestBody Film film){
        return filmRepository.save(film);
    }

}
