package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class EffetDTO.
 */
public class EffetDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3795250427755569499L;

	/** The id. */
	private Integer id;

	/** The description. */
	private String description;

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
