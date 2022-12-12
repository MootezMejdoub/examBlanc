package com.example.houssembaltii.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClasse;
    private String titre;
    private int codeClasse;


    @OneToMany(mappedBy = "classe",fetch = FetchType.EAGER)
    private List<CoursClassroom> coursClassroomList;
}
