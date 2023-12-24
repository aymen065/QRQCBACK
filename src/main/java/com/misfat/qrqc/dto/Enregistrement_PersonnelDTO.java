package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Enregistrement_PersonnelDTO.
 */
public class Enregistrement_PersonnelDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 661609615720468845L;

	/** The id. */
	private Long id;

	/** The enregistrement. */
	private EnregistrementDTO enregistrement;

	/** The personnel. */
	private PersonnelDTO personnel;

	/** The role. */
	private String role;

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
	 * Gets the enregistrement.
	 *
	 * @return the enregistrement
	 */
	public EnregistrementDTO getEnregistrement() {
		return enregistrement;
	}

	/**
	 * Sets the enregistrement.
	 *
	 * @param enregistrement the new enregistrement
	 */
	public void setEnregistrement(EnregistrementDTO enregistrement) {
		this.enregistrement = enregistrement;
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
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
