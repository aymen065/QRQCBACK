package com.misfat.qrqc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Planing_Personnel.
 */
@Entity
@Table(name="planing_personnel")
public class Planing_Personnel implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4414994498731287394L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The personnel. */
	@ManyToOne
	//@JoinColumn(name = "personnel_id")
	private Personnel personnel;

	/** The planing. */
	@ManyToOne
	private Planing planing;

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
	 * Gets the planing.
	 *
	 * @return the planing
	 */
	public Planing getPlaning() {
		return planing;
	}

	/**
	 * Sets the planing.
	 *
	 * @param planing the new planing
	 */
	public void setPlaning(Planing planing) {
		this.planing = planing;
	}

}
