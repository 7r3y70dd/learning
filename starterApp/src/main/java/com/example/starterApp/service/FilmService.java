package com.example.starterApp.service;

import com.example.starterApp.entity.Film;

import java.util.List;

public interface FilmService {

    Integer getIdByTitle(String title);

    public Film getByTitle(String title);

    Film getByTitleIgnoreCase(String title);

    Film create(Film post);

    List<Film> getByKeyword(String title);
}
