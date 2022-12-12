package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.entities.Parking;
import tn.esprit.entities.Personnel;

public interface ParkingRepo extends JpaRepository<Parking, Integer> {
}
