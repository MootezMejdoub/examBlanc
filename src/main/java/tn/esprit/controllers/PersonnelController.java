package tn.esprit.controllers;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Zone;
import tn.esprit.entities.Poste;
import tn.esprit.entities.Parking;

import tn.esprit.repositories.ParkingRepo;
import tn.esprit.repositories.Personnel;
import tn.esprit.repositories.ZoneRepo;


@Slf4j
@RestController
@RequestMapping("rest")
public class PersonnelController {

	@Autowired
	Personnel personnelRepo;
	@Autowired
	ParkingRepo parkingRepository;
	@Autowired
	ZoneRepo zoneRepository;



	//http://localhost:9090/rest/add-Utilisateur
	@PostMapping("/add-personel")
	public tn.esprit.entities.Personnel ajouter(@RequestBody tn.esprit.entities.Personnel entity) {
		return	personnelRepo.save(entity);
	}

	@PostMapping("/addPersonnel")
	public tn.esprit.entities.Personnel ajouterPersonnel(@RequestBody  tn.esprit.entities.Personnel personnel){
		return personnelRepo.save(personnel);}
	@PostMapping("/ajoutParkingetZone")
	public void ajoutParkingetZone(@RequestBody Parking parking){
		parkingRepository.save(parking);



	}
	@PostMapping("/affecterPersonnelZone/{idZone}/{idGarde}")
	public void affecterPersonnelZone( @PathVariable  int idZone, @PathVariable int idGarde) {
		Zone zone = zoneRepository.findById(idZone).orElse(null);
		tn.esprit.entities.Personnel personnel = personnelRepo.findById(idGarde).orElse(null);
		if(zone != null && personnel != null){
			zone.setPersonnel(personnel);
			zoneRepository.save(zone);
		}
	}

	@GetMapping("/getAllpersonnelByParking/{id}")
	public List <tn.esprit.entities.Personnel> getAllPersonnelByParking(@PathVariable int id){
		return personnelRepo.getAllPersonnelByParking(id);
	}
	@GetMapping("/nombreGardeJour/{adresse}")
	public  Integer nombreGardeJour( @PathVariable String adresse ){
		return personnelRepo.nombreGardeJour(adresse);

	}

	@GetMapping("/getPbyD/{date1}/{date2}")
	public List<tn.esprit.entities.Personnel>getPersonalByDate(@PathVariable LocalDate date1, @PathVariable LocalDate date2)
	{
		return personnelRepo.getPersonelByDate(date1,date2);
	}


}
