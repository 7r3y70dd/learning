package com.example.starterApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public String index() {
        log.info("getting index");

        String message = "Greetings from Spring Boot!";

        log.info("got index; message={}", message);

        return message;
    }

}
