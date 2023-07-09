package com.example.starterApp.repository;

import com.example.starterApp.entity.Actor;
import com.example.starterApp.entity.Film;
import com.example.starterApp.entity.FilmActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, Integer> {

    List<FilmActor> findByFilmId(Integer film_id);
}
