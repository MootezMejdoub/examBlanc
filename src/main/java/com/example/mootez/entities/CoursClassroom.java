package com.example.houssembaltii.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToOne
    private  Classe classe;
}
