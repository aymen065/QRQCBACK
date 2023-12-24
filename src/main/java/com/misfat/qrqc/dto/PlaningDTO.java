package com.misfat.qrqc.dto;

import java.util.Date;
import java.sql.Time;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class PlaningDTO.
 */
public class PlaningDTO extends HistoriqueDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2731319498854442018L;

	/** The id. */
	private Long id;

	/** The ligne. */
	private LigneDTO ligne;

	/** The date. */
	private Date date;

	/** The heure. */
	private Time heure;

	/** The personnels. */
	private Set<Planing_PersonnelDTO> personnels;

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
	public LigneDTO getLigne() {
		return ligne;
	}

	/**
	 * Sets the ligne.
	 *
	 * @param ligne the new ligne
	 */
	public void setLigne(LigneDTO ligne) {
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
	public Set<Planing_PersonnelDTO> getPersonnels() {
		return personnels;
	}

	/**
	 * Sets the personnels.
	 *
	 * @param personnels the new personnels
	 */
	public void setPersonnels(Set<Planing_PersonnelDTO> personnels) {
		this.personnels = personnels;
	}

}
