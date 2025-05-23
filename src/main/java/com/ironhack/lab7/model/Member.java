package com.ironhack.lab7.model;

import com.ironhack.lab7.enums.Status;
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
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    private String memberName;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    public Member(String memberName, Status status, LocalDate renewalDate) {
        this.memberName = memberName;
        this.status = status;
        this.renewalDate = renewalDate;
    }
}
