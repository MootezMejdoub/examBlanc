package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.entities.Personnel;
import tn.esprit.entities.Zone;

public interface ZoneRepo extends JpaRepository<Zone, Integer> {
}
