package com.misfat.qrqc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

// TODO: Auto-generated Javadoc
/**
 * The Class Historique.
 *
 * @param <U> the generic type
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Historique<U> implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9062656987355202887L;

	/** The creation user. */
	@CreatedBy
	// change this to entity user
	@Column(name = "creation_user")
	private U creationUser;

	/** The creation date. */
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	private Date creationDate;

	/** The update user. */
	@LastModifiedBy
	@Column(name = "update_user")
	private U updateUser;

	/** The update date. */
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;

	/**
	 * Gets the creation user.
	 *
	 * @return the creation user
	 */
	public U getCreationUser() {
		return creationUser;
	}

	/**
	 * Sets the creation user.
	 *
	 * @param creationUser the new creation user
	 */
	public void setCreationUser(U creationUser) {
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
	public U getUpdateUser() {
		return updateUser;
	}

	/**
	 * Sets the update user.
	 *
	 * @param updateUser the new update user
	 */
	public void setUpdateUser(U updateUser) {
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
