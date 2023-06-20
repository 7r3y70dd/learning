package com.example.starterApp.service;

import com.example.starterApp.entity.Film;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface FilmService {
    public Optional<Film> getByTitle(String title);
}
