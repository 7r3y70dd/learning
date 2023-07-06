package com.example.starterApp.repository;

import com.example.starterApp.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository <Film, Integer> {
    Film getByTitle(String title);

    Film getByTitleIgnoreCase(String title);

    List<Film> getByTitleContainingIgnoreCase(String title);

    @Query("SELECT f.id FROM Film f WHERE LOWER(f.title) = LOWER(:title)")
    Integer getIdByTitle(@Param("title") String title);
}
