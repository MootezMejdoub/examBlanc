package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface Personnel extends JpaRepository<tn.esprit.entities.Personnel, Integer> {

//	@Query("SELECT c FROM Contrat c INNER JOIN Assurance a on a.contrat.id= c.id WHERE a.beneficiaire.id = :idbf ORDER BY c.dateEffet")
//	List<Contrat> getContratBfJPQL(@Param("idbf") int id); 
//	
//	@Query(value="SELECT * FROM contrat c INNER JOIN assurance a on a.contrat_id= c.id WHERE a.beneficiaire_id = :idbf ORDER BY (c.date_effet) LIMIT 1",nativeQuery =true)
//	Contrat getContratBf(@Param("idbf") int id);
public List<tn.esprit.entities.Personnel> getAllPersonnelByParking(int id);
public List <tn.esprit.entities.Personnel> getPersonelByDate(LocalDate d,LocalDate d2);
public int nombreGardeJour(String s);

}