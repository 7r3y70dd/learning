package com.example.starterApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
@Data
@Entity
@Table(name="actor")
public class Actor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int actor_id;

    @Column(name="first_name", length=255)
    private String first_name;

    @Column(name="last_name", length=255)
    private String last_name;

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }
}
