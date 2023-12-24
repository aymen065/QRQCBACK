package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Incident_EffetDTO.
 */
public class Incident_EffetDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2924862406556731291L;

	/** The id. */
	private Long id;

	/** The effet. */
	private EffetDTO effet;

	/** The incident. */
	private IncidentDTO incident;

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
	 * Gets the effet.
	 *
	 * @return the effet
	 */
	public EffetDTO getEffet() {
		return effet;
	}

	/**
	 * Sets the effet.
	 *
	 * @param effet the new effet
	 */
	public void setEffet(EffetDTO effet) {
		this.effet = effet;
	}

	/**
	 * Gets the incident.
	 *
	 * @return the incident
	 */
	public IncidentDTO getIncident() {
		return incident;
	}

	/**
	 * Sets the incident.
	 *
	 * @param incident the new incident
	 */
	public void setIncident(IncidentDTO incident) {
		this.incident = incident;
	}

}
