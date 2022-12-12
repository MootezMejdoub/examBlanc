package com.example.houssembaltii.Repoistories;

import com.example.houssembaltii.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Integer> {
    /*@Query("SELECT COUNT(u)" +
            "from Utilisateur u where u.niveau= :niveau")
    public  int count(@Param() Niveau niveau);*/

    //public int countByNiveau(Niveau niveau);

}
