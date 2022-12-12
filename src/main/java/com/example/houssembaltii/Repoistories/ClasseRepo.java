package com.example.houssembaltii.Repoistories;

import com.example.houssembaltii.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepo extends JpaRepository<Classe,Integer> {
    public  Classe  findByCodeClasse(int codeClasse);
}
