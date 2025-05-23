package com.ironhack.lab7;

import com.ironhack.lab7.enums.Status;
import com.ironhack.lab7.model.Association;
import com.ironhack.lab7.model.Division;
import com.ironhack.lab7.model.Member;
import com.ironhack.lab7.repository.AssociationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class AssociationDataInitializer implements CommandLineRunner {

    private final AssociationRepository associationRepository;

    public AssociationDataInitializer(AssociationRepository associationRepository) {
        this.associationRepository = associationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Association association = new Association();
        association.setName("Associació Catalana de Llavadores");

        Division d1 = new Division(
                "Divisió Barcelona",
                "Barcelonès",
                new Member("Marta Roca", Status.ACTIVE, LocalDate.now().plusMonths(10)),
                List.of(new Member("Jordi Serra", Status.ACTIVE, LocalDate.now().plusMonths(5)))
        );

        Division d2 = new Division(
                "Divisió Girona",
                "Gironès",
                new Member("Anna Soler", Status.ACTIVE, LocalDate.now().plusMonths(8)),
                List.of(new Member("Marc Puig", Status.LAPSED, LocalDate.now().minusMonths(1)))
        );

        Division d3 = new Division(
                "Divisió Lleida",
                "Segrià",
                new Member("Núria Casals", Status.ACTIVE, LocalDate.now().plusMonths(6)),
                List.of(new Member("Pau Riera", Status.ACTIVE, LocalDate.now().plusMonths(2)))
        );

        Division d4 = new Division(
                "Divisió Tarragona",
                "Tarragonès",
                new Member("Clara Pujol", Status.LAPSED, LocalDate.now().minusWeeks(2)),
                List.of(new Member("Oriol Vidal", Status.ACTIVE, LocalDate.now().plusMonths(3)))
        );

        Division d5 = new Division(
                "Divisió Terres de l’Ebre",
                "Baix Ebre",
                new Member("Laura Recasens", Status.ACTIVE, LocalDate.now().plusMonths(9)),
                List.of(new Member("Albert Roig", Status.LAPSED, LocalDate.now().minusDays(20)))
        );

        Division d6 = new Division(
                "Divisió Alt Pirineu i Aran",
                "Val d'Aran",
                new Member("Gemma Farré", Status.ACTIVE, LocalDate.now().plusMonths(12)),
                List.of(new Member("Joan Bosch", Status.ACTIVE, LocalDate.now().plusMonths(7)))
        );

        Division d7 = new Division(
                "Divisió Catalunya Central",
                "Osona",
                new Member("Judit Bové", Status.ACTIVE, LocalDate.now().plusMonths(11)),
                List.of(new Member("Allison Banda", Status.LAPSED, LocalDate.now().minusDays(10)))
        );

        List<Division> divisions = List.of(d1, d2, d3, d4, d5, d6, d7);

        for (Division division : divisions) {
            division.setAssociation(association);

            division.getPresident().setDivision(division);

            for (Member member : division.getMembers()) {
                member.setDivision(division);
            }
        }
            association.setDivisions(divisions);
            associationRepository.save(association);

            System.out.println("✅ Associació creada amb 7 divisions personalitzades.");
        }

    }


