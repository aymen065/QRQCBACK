package com.misfat.qrqc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// TODO: Auto-generated Javadoc
/**
 * The Class Ligne.
 */
@Entity
public class Ligne implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8769889823808010736L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The code. */
	private String code;

	/** The libelle. */
	private String libelle;

	/** The processus. */
	//@OneToMany(fetch = FetchType.LAZY, targetEntity = Processus.class)
	//@JoinColumn(name = "ligne_id")
	//private Set<Processus> processus;

	/** The planings. */
	//@OneToMany(fetch = FetchType.LAZY, targetEntity = Planing.class)
	//private Set<Planing> planings;

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
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Gets the libelle.
	 *
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the libelle.
	 *
	 * @param libelle the new libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
