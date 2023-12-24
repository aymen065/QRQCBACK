package com.misfat.qrqc.dto;

import java.io.Serializable;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class ProcessusDTO.
 */
public class ProcessusDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1442512768310014967L;

	/** The id. */
	private Integer id;

	/** The code. */
	private String code;

	/** The libelle. */
	private String libelle;

	/** The ligne. */
	private LigneDTO ligne;

	/** The enregistrements. */
	// private Set<Enregistrement_ProcessusDTO> enregistrements;

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
	 * Gets the enregistrements.
	 *
	 * @return the enregistrements
	 */
	public Set<Enregistrement_ProcessusDTO> getEnregistrements() {
		return null;
	}

}
