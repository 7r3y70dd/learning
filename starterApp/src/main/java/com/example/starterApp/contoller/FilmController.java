package com.example.starterApp.contoller;

import com.example.starterApp.entity.Actor;
import com.example.starterApp.entity.Film;
import com.example.starterApp.entity.FilmActor;
import com.example.starterApp.service.ActorService;
import com.example.starterApp.service.FilmActorService;
import com.example.starterApp.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class FilmController {

    private final FilmService filmService;
    private final FilmActorService filmActorService;
    private final ActorService actorService;


    public FilmController(final FilmService filmService, FilmActorService filmActorService, ActorService actorService) {
        this.filmService = filmService;
        this.filmActorService = filmActorService;
        this.actorService = actorService;
    }

    @GetMapping(value = "/title/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getByTitle(final @PathVariable("title") String title) {
        List<Film> films = filmService.getByKeyword(title);

        return films.stream().map(Film::getTitle).collect(Collectors.toList());
    }

    @GetMapping(value = "/actorsbytitle/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getActorByTitle(final @PathVariable("title") String title){
        List<FilmActor> filmActorsId = filmActorService.getByFilmId(filmService.getIdByTitle(title));
        List<String> actorNames = new ArrayList<>();

//        for (FilmActor filmActor : filmActorsId) {
//            Actor actor = actorService.getByActorId(filmActorService.getActorId());
//            if (actor != null) {
//                String fullName = actor.getFirstName() + " " + actor.getLastName();
//                actorNames.add(fullName);
//            }
//        }
        return null;
    }

//    @GetMapping(value = "/titleContaining/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<String> titleContaining(final @PathVariable("title") String title) {
//        List<Film> films = filmService.getByKeyword(title);
//
//        return films.stream().map(Film::getTitle).collect(Collectors.toList());
//    }
}