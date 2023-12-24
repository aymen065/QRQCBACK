package com.misfat.qrqc.model;

import java.util.Date;
import java.sql.Time;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class Planing.
 */
@Entity
public class Planing extends Historique<String> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3934726616718014564L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The ligne. */
	@ManyToOne
	private Ligne ligne;

	/** The date. */
	private Date date;

	/** The heure. */
	private Time heure;

	/** The personnels. */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy="planing")
	//@JoinColumn(name = "planing_id")
	private Set<Planing_Personnel> personnels;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the ligne.
	 *
	 * @return the ligne
	 */
	public Ligne getLigne() {
		return ligne;
	}

	/**
	 * Sets the ligne.
	 *
	 * @param ligne the new ligne
	 */
	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the heure.
	 *
	 * @return the heure
	 */
	public Time getHeure() {
		return heure;
	}

	/**
	 * Sets the heure.
	 *
	 * @param heure the new heure
	 */
	public void setHeure(Time heure) {
		this.heure = heure;
	}

	/**
	 * Gets the personnels.
	 *
	 * @return the personnels
	 */
	public Set<Planing_Personnel> getPersonnels() {
		return personnels;
	}

	/**
	 * Sets the personnels.
	 *
	 * @param personnels the new personnels
	 */
	public void setPersonnels(Set<Planing_Personnel> personnels) {
		this.personnels = personnels;
	}

}
