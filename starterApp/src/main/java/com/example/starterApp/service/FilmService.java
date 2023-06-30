package com.example.starterApp.service;

import com.example.starterApp.entity.Film;

public interface FilmService {
    public Film getByTitle(String title);

    Film create(Film post);
}
