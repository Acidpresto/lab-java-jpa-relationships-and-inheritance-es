package com.ironhack.lab7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long division_id;
    private String name;
    private String district;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="president_id")
    private Member president;

    @OneToMany (mappedBy = "division", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Member> members;

    public Division(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

}
