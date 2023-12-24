package com.misfat.qrqc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonnelDTO.
 */
public class PersonnelDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5302919364193230353L;

	/** The id. */
	private Integer id;

	/** The nom. */
	private String nom;

	/** The prenom. */
	private String prenom;

	/** The login. */
	private String login;

	/** The active. */
	private boolean active;

	/** The last login date. */
	private Date lastLoginDate;

	/** The locked. */
	private Boolean locked;

	/** The service. */
	private ServiceDTO service;

	/** The enregistrements. */
	// private Set<Enregistrement_PersonnelDTO> enregistrements;

	/** The planings. */
	private Set<Planing_PersonnelDTO> planings;

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
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the login.
	 *
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the login.
	 *
	 * @param login the new login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Checks if is active.
	 *
	 * @return true, if is active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * Gets the last login date.
	 *
	 * @return the last login date
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * Sets the last login date.
	 *
	 * @param lastLoginDate the new last login date
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * Gets the locked.
	 *
	 * @return the locked
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * Sets the locked.
	 *
	 * @param locked the new locked
	 */
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public ServiceDTO getService() {
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(ServiceDTO service) {
		this.service = service;
	}

	/**
	 * Gets the planings.
	 *
	 * @return the planings
	 */
	public Set<Planing_PersonnelDTO> getPlanings() {
		return planings;
	}

	/**
	 * Sets the planings.
	 *
	 * @param planings the new planings
	 */
	public void setPlanings(Set<Planing_PersonnelDTO> planings) {
		this.planings = planings;
	}

}
