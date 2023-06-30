package com.example.starterApp.contoller;

import com.example.starterApp.entity.Film;
import com.example.starterApp.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Optional;

@RestController
@Slf4j
public class HelloController {

    private final FilmService filmService;

    public HelloController(final FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/title/{title}")
    public String getByTime(final @PathVariable("title") String title) {
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

        Film film = filmService.getByTitle(title);

        return !Objects.isNull(film) ? film.getTitle() : "no film found";
    }
}