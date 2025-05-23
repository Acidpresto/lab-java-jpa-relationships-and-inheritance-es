package com.ironhack.lab7.model.Tasks;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Entity
public class InternalTask extends Task {

    public InternalTask(String title, LocalDate dueDate, boolean completed) {
        super(title, dueDate, completed);}

}
