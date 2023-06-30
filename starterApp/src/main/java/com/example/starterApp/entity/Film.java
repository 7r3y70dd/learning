package com.example.starterApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "film")
public class Film {

//    public Film(String title, Integer length, Integer language_id){
//        this.title = title;
//        this.length = length;
//        this.language_id = language_id;
//    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int film_id;

    @Column(name="title", length=255)
    private String title;

    @Column(name="length")
    private Integer length;

    @Column(name="language_id")
    private Integer language_id;
}
