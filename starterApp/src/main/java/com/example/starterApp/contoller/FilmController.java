package com.example.starterApp.contoller;

import com.example.starterApp.entity.Actor;
import com.example.starterApp.entity.Film;
import com.example.starterApp.service.ActorService;
import com.example.starterApp.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class FilmController {

    private final FilmService filmService;
    private final ActorService actorService;


    public FilmController(final FilmService filmService, ActorService actorService) {
        this.filmService = filmService;
        this.actorService = actorService;
    }

    @GetMapping(value = "/title/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getByTitle(final @PathVariable("title") String title) {
        List<Film> films = filmService.getByKeyword(title);

        return films.stream().map(Film::getTitle).collect(Collectors.toList());
    }

    @GetMapping(value = "/actorsbytitle/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Actor> getActorByTitle(final @PathVariable("title") String title) {
        return filmService.getByTitle(title).getActors();
    }
    
}