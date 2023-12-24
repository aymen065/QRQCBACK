package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentDTO.
 */
public class IncidentDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5879807979804532645L;

	/** The id. */
	private Long id;

	/** The probleme. */
	private String probleme;

	/** The cause. */
	private String cause;

	/** The action corrective. */
	private String actionCorrective;

	/** The enregistrements. */
	// private Set<EnregistrementDTO> enregistrements;

	// private Set<Incident_EffetDTO> incidents;

	/**
	 * Instantiates a new incident.
	 */
	public IncidentDTO() {
		super();
	}

	/**
	 * Instantiates a new incident DTO.
	 *
	 * @param id               the id
	 * @param probleme         the probleme
	 * @param cause            the cause
	 * @param actionCorrective the action corrective
	 */
	public IncidentDTO(Long id, String probleme, String cause, String actionCorrective) {
		super();
		this.id = id;
		this.probleme = probleme;
		this.cause = cause;
		this.actionCorrective = actionCorrective;
	}

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
	 * Gets the probleme.
	 *
	 * @return the probleme
	 */
	public String getProbleme() {
		return probleme;
	}

	/**
	 * Sets the probleme.
	 *
	 * @param probleme the new probleme
	 */
	public void setProbleme(String probleme) {
		this.probleme = probleme;
	}

	/**
	 * Gets the cause.
	 *
	 * @return the cause
	 */
	public String getCause() {
		return cause;
	}

	/**
	 * Sets the cause.
	 *
	 * @param cause the new cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}

	/**
	 * Gets the action corrective.
	 *
	 * @return the action corrective
	 */
	public String getActionCorrective() {
		return actionCorrective;
	}

	/**
	 * Sets the action corrective.
	 *
	 * @param actionCorrective the new action corrective
	 */
	public void setActionCorrective(String actionCorrective) {
		this.actionCorrective = actionCorrective;
	}

}
