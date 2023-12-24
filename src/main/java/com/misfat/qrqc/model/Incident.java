package com.misfat.qrqc.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// TODO: Auto-generated Javadoc
/**
 * The Class Incident.
 */
@Entity
public class Incident implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2832971027022375210L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The probleme. */
	private String probleme;

	/** The cause. */
	private String cause;

	/** The action corrective. */
	private String actionCorrective;
	
	/** The enregistrements. */
	@JsonIgnoreProperties({"incident"})
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy="incident")
	//@JoinColumn(name = "incident_id")
	private Set<Enregistrement> enregistrements;

	
	/** The incidents. */
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JsonIgnoreProperties({"incident"})
	@OneToMany(cascade = { CascadeType.REMOVE }, mappedBy="incident")
	//@JoinColumn(name = "incident_id")
	private Set<Incident_Effet> incidents;

	/**
	 * Instantiates a new incident.
	 */
	public Incident() {
		super();
	}

	/**
	 * Instantiates a new incident.
	 *
	 * @param id               the id
	 * @param probleme         the probleme
	 * @param cause            the cause
	 * @param actionCorrective the action corrective
	 */
	public Incident(Long id, String probleme, String cause, String actionCorrective) {
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

	/**
	 * Gets the enregistrements.
	 *
	 * @return the enregistrements
	 */
	public Set<Enregistrement> getEnregistrements() {
		return enregistrements;
	}

	/**
	 * Sets the enregistrements.
	 *
	 * @param enregistrements the new enregistrements
	 */
	public void setEnregistrements(Set<Enregistrement> enregistrements) {
		this.enregistrements = enregistrements;
	}

	/**
	 * Gets the incidents.
	 *
	 * @return the incidents
	 */
	public Set<Incident_Effet> getIncidents() {
		return incidents;
	}

	/**
	 * Sets the incidents.
	 *
	 * @param incidents the new incidents
	 */
	public void setIncidents(Set<Incident_Effet> incidents) {
		this.incidents = incidents;
	}

}
