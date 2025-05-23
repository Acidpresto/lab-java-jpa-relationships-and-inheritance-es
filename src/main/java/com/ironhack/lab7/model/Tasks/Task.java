package com.ironhack.lab7.model.Tasks;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate dueTime;
    private boolean completed;

    public Task(String title, LocalDate dueTime, boolean completed) {
        this.title = title;
        this.dueTime = dueTime;
        this.completed = completed;
    }
}
