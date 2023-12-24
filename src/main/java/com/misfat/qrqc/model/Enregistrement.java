package com.misfat.qrqc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Enregistrement.
 */
@Entity
public class Enregistrement implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1754065255744382132L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The date enreg. */
	@Temporal(TemporalType.DATE)
	private Date dateEnreg;

	/** The date prevue. */
	@Temporal(TemporalType.DATE)
	private Date datePrevue;

	/** The date cloture. */
	@Temporal(TemporalType.DATE)
	private Date dateCloture;

	/** The heure. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date heure;

	/** The article. */
	private String article;

	/** The num reunion. */
	private Integer numReunion;

	/** The incident. */
	@JsonIgnoreProperties({ "enregistrements" })
	@ManyToOne
	private Incident incident;

	/** The enregistrements processus. */
	@JsonIgnoreProperties({ "enregistrement" })
	// @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(cascade = { CascadeType.REMOVE },mappedBy="enregistrement")
	//@JoinColumn(name = "enregistrement_id")
	private Set<Enregistrement_Processus> processus;

	/** The enregistrements personnels. */
	@JsonIgnoreProperties({ "enregistrement" })
	@OneToMany(cascade = { CascadeType.REMOVE }, mappedBy="enregistrement")
	//@JoinColumn(name = "enregistrement_id")
	private Set<Enregistrement_Personnel> personnels;

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
	 * Gets the num reunion.
	 *
	 * @return the num reunion
	 */
	public Integer getNumReunion() {
		return numReunion;
	}

	/**
	 * Sets the num reunion.
	 *
	 * @param numReunion the new num reunion
	 */
	public void setNumReunion(Integer numReunion) {
		this.numReunion = numReunion;
	}

	/**
	 * Gets the date enreg.
	 *
	 * @return the date enreg
	 */
	public Date getDateEnreg() {
		return dateEnreg;
	}

	/**
	 * Sets the date enreg.
	 *
	 * @param dateEnreg the new date enreg
	 */
	public void setDateEnreg(Date dateEnreg) {
		this.dateEnreg = dateEnreg;
	}

	/**
	 * Gets the date prevue.
	 *
	 * @return the date prevue
	 */
	public Date getDatePrevue() {
		return datePrevue;
	}

	/**
	 * Sets the date prevue.
	 *
	 * @param datePrevue the new date prevue
	 */
	public void setDatePrevue(Date datePrevue) {
		this.datePrevue = datePrevue;
	}

	/**
	 * Gets the date cloture.
	 *
	 * @return the date cloture
	 */
	public Date getDateCloture() {
		return dateCloture;
	}

	/**
	 * Sets the date cloture.
	 *
	 * @param dateCloture the new date cloture
	 */
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}

	/**
	 * Gets the heure.
	 *
	 * @return the heure
	 */
	public Date getHeure() {
		return heure;
	}

	/**
	 * Sets the heure.
	 *
	 * @param heure the new heure
	 */
	public void setHeure(Date heure) {
		this.heure = heure;
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

	/**
	 * Gets the article.
	 *
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}

	/**
	 * Sets the article.
	 *
	 * @param article the new article
	 */
	public void setArticle(String article) {
		this.article = article;
	}

	/**
	 * Gets the processus.
	 *
	 * @return the processus
	 */
	public Set<Enregistrement_Processus> getProcessus() {
		return processus;
	}

	/**
	 * Sets the processus.
	 *
	 * @param processus the new processus
	 */
	public void setProcessus(Set<Enregistrement_Processus> processus) {
		this.processus = processus;
	}

	/**
	 * Gets the personnels.
	 *
	 * @return the personnels
	 */
	public Set<Enregistrement_Personnel> getPersonnels() {
		return personnels;
	}

	/**
	 * Sets the personnels.
	 *
	 * @param personnels the new personnels
	 */
	public void setPersonnels(Set<Enregistrement_Personnel> personnels) {
		this.personnels = personnels;
	}

}
