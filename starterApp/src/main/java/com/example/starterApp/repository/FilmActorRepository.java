package com.example.starterApp.repository;

import com.example.starterApp.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorRepository extends JpaRepository<Film, Integer> {
}
