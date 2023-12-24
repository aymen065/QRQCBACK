package com.misfat.qrqc.dto;

import java.io.Serializable;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class LigneDTO.
 */
public class LigneDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7402566251238282297L;

	/** The id. */
	private Integer id;

	/** The code. */
	private String code;

	/** The libelle. */
	private String libelle;

	/** The processus. */
	private Set<ProcessusDTO> processus;

	/** The planings. */
	private Set<PlaningDTO> planings;

	/**
	 * Instantiates a new ligne DTO.
	 */
	public LigneDTO() {
		super();
	}

	/**
	 * Instantiates a new ligne DTO.
	 *
	 * @param id      the id
	 * @param code    the code
	 * @param libelle the libelle
	 */
	public LigneDTO(Integer id, String code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}

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
	 * Gets the processus.
	 *
	 * @return the processus
	 */
	public Set<ProcessusDTO> getProcessus() {
		return processus;
	}

	/**
	 * Sets the processus.
	 *
	 * @param processus the new processus
	 */
	public void setProcessus(Set<ProcessusDTO> processus) {
		this.processus = processus;
	}

	/**
	 * Gets the planings.
	 *
	 * @return the planings
	 */
	public Set<PlaningDTO> getPlanings() {
		return planings;
	}

	/**
	 * Sets the planings.
	 *
	 * @param planings the new planings
	 */
	public void setPlanings(Set<PlaningDTO> planings) {
		this.planings = planings;
	}

}
