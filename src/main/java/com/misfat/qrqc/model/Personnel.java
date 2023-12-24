package com.misfat.qrqc.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Personnel.
 */
@Entity
public class Personnel extends Historique<String> implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -305914971223712508L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The nom. */
	@Column(name = "nom")
	private String nom;

	/** The prenom. */
	@Column(name = "prenom")
	private String prenom;

	/** The login. */
	@Column(name = "login")
	private String login;

	/** The password. */
	@Column(name = "password")
	private String password;

	/** The is active. */
	@Column(name = "is_active")
	private boolean active;

	/** The roles. */
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<AppRole> appRoles;

	/** The last login date. */
	@Column(name = "last_login_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginDate;

	/** The locked. */
	@Column(name = "locked")
	private Boolean locked;

	/** The service. */
	@ManyToOne
	// @JsonBackReference
	@JoinColumn(name = "service_id")
	private Service service;

	/** The enregistrements. */
	@JsonIgnoreProperties({ "personnel" })
	@OneToMany(mappedBy = "personnel")
	// @JoinColumn(name = "personnel_id")
	private Set<Enregistrement_Personnel> enregistrements;

	/** The planings. */
	@OneToMany(mappedBy = "personnel")
	private Set<Planing_Personnel> planings;

	public Personnel() {
		super();
	}

	public Personnel(Personnel user) {

		this.id = user.getId();
		this.login = user.getLogin();
		this.password = user.getPassword();
		this.appRoles = user.getAppRoles();
	}

	public Personnel(Integer id, String nom, String prenom, String login, String password, String mail, boolean active,
			Collection<AppRole> appRoles, Date lastLoginDate, Integer failedLoginAttempts, Date lastFailedLoginDate,
			Boolean locked, Service service, Set<Enregistrement_Personnel> enregistrements,
			Set<Planing_Personnel> planings) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.active = active;
		this.appRoles = appRoles;
		this.lastLoginDate = lastLoginDate;
		this.locked = locked;
		this.service = service;
		this.enregistrements = enregistrements;
		this.planings = planings;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * Gets the enregistrements.
	 *
	 * @return the enregistrements
	 */
	public Set<Enregistrement_Personnel> getEnregistrements() {
		return enregistrements;
	}

	/**
	 * Sets the enregistrements.
	 *
	 * @param enregistrements the new enregistrements
	 */
	public void setEnregistrements(Set<Enregistrement_Personnel> enregistrements) {
		this.enregistrements = enregistrements;
	}

	/**
	 * Gets the planings.
	 *
	 * @return the planings
	 */
	public Set<Planing_Personnel> getPlanings() {
		return planings;
	}

	/**
	 * Sets the planings.
	 *
	 * @param planings the new planings
	 */
	public void setPlanings(Set<Planing_Personnel> planings) {
		this.planings = planings;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(Service service) {
		this.service = service;
	}

	public Collection<AppRole> getAppRoles() {
		return appRoles;
	}

	public void setAppRoles(Collection<AppRole> appRoles) {
		this.appRoles = appRoles;
	}

}
