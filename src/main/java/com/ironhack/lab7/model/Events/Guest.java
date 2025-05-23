package com.ironhack.lab7.model.Events;

import com.ironhack.lab7.enums.Status;
import com.ironhack.lab7.enums.Statuss;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private Statuss status;

    @ManyToOne
    @JoinColumn(name= "event_id")
    private Event event;


}
