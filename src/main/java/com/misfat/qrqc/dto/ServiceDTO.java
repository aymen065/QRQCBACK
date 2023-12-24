package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceDTO.
 */
public class ServiceDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4567877222823723220L;

	/** The id. */
	private Integer id;

	/** The nom. */
	private String nom;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
