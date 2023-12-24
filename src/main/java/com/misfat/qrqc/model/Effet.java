package com.misfat.qrqc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Effet.
 */
@Entity
public class Effet implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4779148542844823911L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The description. */
	private String description;

	
	/*@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, targetEntity = Incident_Effet.class)
	@JoinColumn(name = "effet_id")
	private Set<Incident_Effet> incidents;*/

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
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


}
