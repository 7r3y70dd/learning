package com.example.starterApp.contoller;

import com.example.starterApp.entity.Film;
import com.example.starterApp.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
public class HelloController {

    private final FilmService filmService;

    public HelloController(final FilmService filmService){
        this.filmService = filmService;
    }

    @GetMapping("/")
    public String index() {

        log.info("getting index");

        String message = "Greetings from Spring Boot!";

        log.info("got index; message={}", message);

        Film film = filmService.getByTitle("Academy Dinosaur");

        System.out.println("film: " + film.getTitle());

        return film.getTitle();
    }

}
