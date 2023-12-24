package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Enregistrement_ProcessusDTO.
 */
public class Enregistrement_ProcessusDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1034926330868654238L;

	/** The id. */
	private Long id;

	/** The enregistrement. */
	private EnregistrementDTO enregistrement;

	/** The processus. */
	private ProcessusDTO processus;

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
	 * Gets the processus.
	 *
	 * @return the processus
	 */
	public ProcessusDTO getProcessus() {
		return processus;
	}

	/**
	 * Sets the processus.
	 *
	 * @param processus the new processus
	 */
	public void setProcessus(ProcessusDTO processus) {
		this.processus = processus;
	}

	public EnregistrementDTO getEnregistrement() {
		return enregistrement;
	}

	public void setEnregistrement(EnregistrementDTO enregistrement) {
		this.enregistrement = enregistrement;
	}

}
