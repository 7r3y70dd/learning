package com.example.starterApp.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int film_id;

    @Column(name="title", length=255)
    private String title;

    @Column(name="length")
    private Integer length;
}
