package com.ironhack.lab7.model;


import com.ironhack.lab7.enums.Salutation;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Name {
    @Enumerated(EnumType.STRING)
    private Salutation Salutation;

    private String firstName;
    private String middleName;
    private String lastName;
}
