package com.ironhack.lab7.model.Events;

import jakarta.persistence.Entity;

@Entity
public class Exhibition extends Event {

    private String name;
    private String description;
}
