package com.example.starterApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Data
@Entity
@Table(name = "actor")
@Getter
//@ToString(exclude = "films")
public class Actor {

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", length = 255)
    private String firstName;

    @Column(name = "last_name", length = 255)
    private String lastName;

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }

//    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "actors")
//    Set<Film> films;
}
