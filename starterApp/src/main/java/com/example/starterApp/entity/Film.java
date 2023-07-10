package com.example.starterApp.entity;

import com.example.starterApp.service.ActorService;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "film")
@EqualsAndHashCode(callSuper = false)
@Getter
@ToString(exclude = "actors")
public class Film {

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "length")
    private Integer length;

    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "description")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "film_actor",
            joinColumns = {@JoinColumn(name = "film_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")})
    Set<Actor> actors = new HashSet<>();


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
