package com.example.starterApp.contoller;

import com.example.starterApp.entity.Film;
import com.example.starterApp.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class FilmController {

    private final FilmService filmService;

    public FilmController(final FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping(value = "/title/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getByTitle(final @PathVariable("title") String title) {
        log.info("getting index");
//
//        String message = "Greetings from Spring Boot!";
//
//        log.info("got index; message={}", message);
//
//        Film post = new Film("postTitle", 120, 1);
//
//        filmService.create(post);
//
//        Film film = filmService.getByTitle("postTitle");
//
//        System.out.println("film: " + film.getTitle());

        Film film = filmService.getByTitleIgnoreCase(title);

        return !Objects.isNull(film) ? film.getTitle() : "no film found";
    }

    @GetMapping(value = "/titleContaining/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> titleContaining(final @PathVariable("title") String title) {
        List<Film> films = filmService.getByKeyword(title);

        return films.stream().map(Film::getTitle).collect(Collectors.toList());
    }
}