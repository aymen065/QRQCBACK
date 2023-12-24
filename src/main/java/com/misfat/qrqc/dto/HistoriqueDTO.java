package com.misfat.qrqc.dto;

import java.io.Serializable;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class HistoriqueDTO.
 */
public class HistoriqueDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 420978258921518441L;

	/** The creation user. */
	private String creationUser;

	/** The creation date. */
	private Date creationDate;

	/** The update user. */
	private String updateUser;

	/** The update date. */
	private Date updateDate;

	/**
	 * Instantiates a new Audit dto.
	 */
	public HistoriqueDTO() {
	}

	/**
	 * Instantiates a new Audit dto.
	 *
	 * @param creationUser the creation user
	 * @param creationDate the creation date
	 */
	public HistoriqueDTO(String creationUser, Date creationDate) {
		this.creationUser = creationUser;
		this.creationDate = creationDate;
	}

	/**
	 * Gets the creation user.
	 *
	 * @return the creation user
	 */
	public String getCreationUser() {
		return creationUser;
	}

	/**
	 * Sets the creation user.
	 *
	 * @param creationUser the new creation user
	 */
	public void setCreationUser(String creationUser) {
		this.creationUser = creationUser;
	}

	/**
	 * Gets the creation date.
	 *
	 * @return the creation date
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate the new creation date
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Gets the update user.
	 *
	 * @return the update user
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * Sets the update user.
	 *
	 * @param updateUser the new update user
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * Gets the update date.
	 *
	 * @return the update date
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * Sets the update date.
	 *
	 * @param updateDate the new update date
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
