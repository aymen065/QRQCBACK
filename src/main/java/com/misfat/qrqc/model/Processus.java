package com.misfat.qrqc.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// TODO: Auto-generated Javadoc
/**
 * The Class Processus.
 */
@Entity
public class Processus implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4016191809009362209L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The code. */
	private String code;

	/** The libelle. */
	private String libelle;

	/** The ligne. */
	@ManyToOne
	@JoinColumn(name = "ligne_id")
	private Ligne ligne;

	/** The enregistrements. */
	@JsonIgnoreProperties({"processus"})
	@OneToMany(mappedBy="processus")
	//@JoinColumn(name = "enregistrement_id")
	private Set<Enregistrement_Processus> enregistrements;

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
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Gets the libelle.
	 *
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the libelle.
	 *
	 * @param libelle the new libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Gets the ligne.
	 *
	 * @return the ligne
	 */
	public Ligne getLigne() {
		return ligne;
	}

	/**
	 * Sets the ligne.
	 *
	 * @param ligne the new ligne
	 */
	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}

	/**
	 * Gets the enregistrements.
	 *
	 * @return the enregistrements
	 */
	public Set<Enregistrement_Processus> getEnregistrements() {
		return enregistrements;
	}

	/**
	 * Sets the enregistrements.
	 *
	 * @param enregistrements the new enregistrements
	 */
	public void setEnregistrements(Set<Enregistrement_Processus> enregistrements) {
		this.enregistrements = enregistrements;
	}

}
