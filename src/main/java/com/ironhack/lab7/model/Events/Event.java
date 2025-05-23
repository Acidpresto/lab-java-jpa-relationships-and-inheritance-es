package com.ironhack.lab7.model.Events;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime date;
    private Integer duration;
    private String location;

    @OneToMany(mappedBy = "event")
    private List<Guest> guests;

}
