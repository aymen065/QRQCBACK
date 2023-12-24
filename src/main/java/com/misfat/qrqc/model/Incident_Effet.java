package com.misfat.qrqc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Incident_Effet.
 */
@Entity
public class Incident_Effet implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8380951314718111116L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The effet. */
	@ManyToOne
	@JoinColumn(name = "effet_id")
	private Effet effet;

	/** The incident. */
	@JsonIgnoreProperties({"incidents"})
	@ManyToOne
	@JoinColumn(name = "incident_id")
	private Incident incident;

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
	public Effet getEffet() {
		return effet;
	}

	/**
	 * Sets the effet.
	 *
	 * @param effet the new effet
	 */
	public void setEffet(Effet effet) {
		this.effet = effet;
	}

	/**
	 * Gets the incident.
	 *
	 * @return the incident
	 */
	public Incident getIncident() {
		return incident;
	}

	/**
	 * Sets the incident.
	 *
	 * @param incident the new incident
	 */
	public void setIncident(Incident incident) {
		this.incident = incident;
	}

}
