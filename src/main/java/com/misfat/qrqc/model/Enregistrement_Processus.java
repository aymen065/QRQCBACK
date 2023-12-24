package com.misfat.qrqc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Enregistrement_Processus.
 */
@Entity
//@Table(name="[enregistrement_processus]")
public class Enregistrement_Processus implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3698682012356460826L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The enregistrement. */
	@ManyToOne
    @JsonIgnoreProperties({"processus"})
	private Enregistrement enregistrement;

	/** The procesus. */
	@JsonIgnoreProperties({"enregistrements"})
	@ManyToOne
	private Processus processus;

	/** The libre. */
	private String libre;

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
	 * Gets the enregistrement.
	 *
	 * @return the enregistrement
	 */
	public Enregistrement getEnregistrement() {
		return enregistrement;
	}

	/**
	 * Sets the enregistrement.
	 *
	 * @param enregistrement the new enregistrement
	 */
	public void setEnregistrement(Enregistrement enregistrement) {
		this.enregistrement = enregistrement;
	}

	/**
	 * Gets the processus.
	 *
	 * @return the processus
	 */
	public Processus getProcessus() {
		return processus;
	}

	/**
	 * Sets the processus.
	 *
	 * @param processus the new processus
	 */
	public void setProcessus(Processus processus) {
		this.processus = processus;
	}

	/**
	 * Gets the libre.
	 *
	 * @return the libre
	 */
	public String getLibre() {
		return libre;
	}

	/**
	 * Sets the libre.
	 *
	 * @param libre the new libre
	 */
	public void setLibre(String libre) {
		this.libre = libre;
	}

}
