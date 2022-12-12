package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Parking implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String designation;
	private String adresse;
	private int capacite;
	
	
	//il s'agit d'une association unidirectionnelle
	@OneToMany(mappedBy = "parking")
	private List<Zone> zone;
	
	

}
