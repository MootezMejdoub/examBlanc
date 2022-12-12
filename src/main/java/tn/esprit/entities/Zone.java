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
public class Zone implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	private String ref;
	private float dimension;


	@OneToOne()
	private Personnel personnel;

	@OneToMany
	private List<Personnel> personnelList;


	@ManyToOne
	private Parking parking;
}