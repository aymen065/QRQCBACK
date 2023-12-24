package com.misfat.qrqc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



// TODO: Auto-generated Javadoc
/**
 * The Class Enregistrement_Personnel.
 */
@Entity
@Table(name="enregistrement_personnel")
public class Enregistrement_Personnel implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6537197586826778438L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The enregistrement. */
	@JsonIgnoreProperties({ "personnels" })
	@ManyToOne
	private Enregistrement enregistrement;

	/** The personnel. */
	@JsonIgnoreProperties({ "enregistrements" })
	@ManyToOne
	private Personnel personnel;

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
	public Enregistrement getEnregistrement() {
		return enregistrement;
	}

	/**
	 * Sets the enregistrement.
	 *
	 * @param enregistrement the new enregistrement
	 */
	public void setEnregistrement(Enregistrement enregistrement) {
		this.enregistrement = enregistrement;
	}

	/**
	 * Gets the personnel.
	 *
	 * @return the personnel
	 */
	public Personnel getPersonnel() {
		return personnel;
	}

	/**
	 * Sets the personnel.
	 *
	 * @param personnel the new personnel
	 */
	public void setPersonnel(Personnel personnel) {
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
