package com.example.starterApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "film_actor")
public class FilmActor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int filmId;

    @Column(name="actor_id", length=255)
    private Integer actor_id;
}
