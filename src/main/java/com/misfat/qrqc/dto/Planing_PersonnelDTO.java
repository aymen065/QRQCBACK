package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Planing_PersonnelDTO.
 */
public class Planing_PersonnelDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1586798149543486705L;

	/** The id. */
	private Long id;

	/** The personnel. */
	private PersonnelDTO personnel;

	/** The planing. */
	private PlaningDTO planing;

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
	 * Gets the personnel.
	 *
	 * @return the personnel
	 */
	public PersonnelDTO getPersonnel() {
		return personnel;
	}

	/**
	 * Sets the personnel.
	 *
	 * @param personnel the new personnel
	 */
	public void setPersonnel(PersonnelDTO personnel) {
		this.personnel = personnel;
	}

	/**
	 * Gets the planing.
	 *
	 * @return the planing
	 */
	public PlaningDTO getPlaning() {
		return planing;
	}

	/**
	 * Sets the planing.
	 *
	 * @param planing the new planing
	 */
	public void setPlaning(PlaningDTO planing) {
		this.planing = planing;
	}

}
