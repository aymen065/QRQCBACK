package com.misfat.qrqc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class EnregistrementDTO.
 */
public class EnregistrementDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4443245469608016273L;

	/** The id. */
	private Long id;

	/** The date enreg. */
	private Date dateEnreg;

	/** The date prevue. */
	private Date datePrevue;

	/** The date cloture. */
	private Date dateCloture;

	/**
	 * ****************** Facultatif pour filtrage
	 * *******************************************************.
	 */
	/** The date enreg inf. */
	private Date dateEnregInf;

	/** The date enreg sup. */
	private Date dateEnregSup;

	/** The Ligne id. */
	private Integer Ligne_id;

	/** The Processus id. */
	private List<Integer> Processus_id;

	/** The role. */
	private String param_role;

	/** ***********************************************************************. */

	/** The heure. */
	private Date heure;

	/** The article. */
	private String article;

	/** The num reunion. */
	private Integer numReunion;

	/** The incident. */
	private IncidentDTO incident;

	/** The processus. */
	private Set<Enregistrement_ProcessusDTO> processus;

	/** The personnels. */
	private Set<Enregistrement_PersonnelDTO> personnels;

	/**
	 * Instantiates a new enregistrement DTO.
	 */
	public EnregistrementDTO() {

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

	/**
	 * Gets the date enreg inf.
	 *
	 * @return the date enreg inf
	 */
	public Date getDateEnregInf() {
		return dateEnregInf;
	}

	/**
	 * Sets the date enreg inf.
	 *
	 * @param dateEnregInf the new date enreg inf
	 */
	public void setDateEnregInf(Date dateEnregInf) {
		this.dateEnregInf = dateEnregInf;
	}

	/**
	 * Gets the date enreg sup.
	 *
	 * @return the date enreg sup
	 */
	public Date getDateEnregSup() {
		return dateEnregSup;
	}

	/**
	 * Sets the date enreg sup.
	 *
	 * @param dateEnregSup the new date enreg sup
	 */
	public void setDateEnregSup(Date dateEnregSup) {
		this.dateEnregSup = dateEnregSup;
	}

	/**
	 * Gets the ligne id.
	 *
	 * @return the ligne id
	 */
	public Integer getLigne_id() {
		return Ligne_id;
	}

	/**
	 * Sets the ligne id.
	 *
	 * @param ligne_id the new ligne id
	 */
	public void setLigne_id(Integer ligne_id) {
		Ligne_id = ligne_id;
	}

	/**
	 * Gets the processus id.
	 *
	 * @return the processus id
	 */
	public List<Integer> getProcessus_id() {
		return Processus_id;
	}

	/**
	 * Sets the processus id.
	 *
	 * @param processus_id the new processus id
	 */
	public void setProcessus_id(List<Integer> processus_id) {
		Processus_id = processus_id;
	}

	/**
	 * Gets the processus.
	 *
	 * @return the processus
	 */
	public Set<Enregistrement_ProcessusDTO> getProcessus() {
		return processus;
	}

	/**
	 * Sets the processus.
	 *
	 * @param processus the new processus
	 */
	public void setProcessus(Set<Enregistrement_ProcessusDTO> processus) {
		this.processus = processus;
	}

	/**
	 * Gets the param role.
	 *
	 * @return the param role
	 */
	public String getParam_role() {
		return param_role;
	}

	/**
	 * Sets the param role.
	 *
	 * @param param_role the new param role
	 */
	public void setParam_role(String param_role) {
		this.param_role = param_role;
	}

	/**
	 * Gets the personnels.
	 *
	 * @return the personnels
	 */
	public Set<Enregistrement_PersonnelDTO> getPersonnels() {
		return personnels;
	}

	/**
	 * Sets the personnels.
	 *
	 * @param personnels the new personnels
	 */
	public void setPersonnels(Set<Enregistrement_PersonnelDTO> personnels) {
		this.personnels = personnels;
	}

}
