package com.example.starterApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@Entity
@Table(name = "film")
@EqualsAndHashCode(callSuper = false)
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

    @Column(name="description")
    private String description;

//    @Column(name="release_year")
//    private Integer release_year;
//
//    @Column(name="rental_duration")
//    private Integer rental_duration;
//
//    @Column(name="rental_rate")
//    private Integer rental_rate;
//
//    @Column(name="replacement_cost")
//    private Integer replacement_cost;
//
//    @Column(name="rating")
//    private Integer rating;
//
//    @Column(name="last_update")
//    private String last_update;
//
//    @Column(name="special_features")
//    private Integer special_features;
//
//    @Column(name="full_text")
//    private String full_text;
}
