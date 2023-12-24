package com.misfat.qrqc.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class ChangePasswordDTO.
 */
public class ChangePasswordDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3866561047188025430L;

	/** The user id. */

	private Integer userId;

	/** The old password. */
	private String oldPassword;

	/** The new password. */
	private String newPassword;

	/** The confirmation. */
	private String confirmation;

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public Integer getUserId() {

		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(Integer userId) {

		this.userId = userId;
	}

	/**
	 * Gets the old password.
	 *
	 * @return the old password
	 */
	public String getOldPassword() {

		return oldPassword;
	}

	/**
	 * Sets the old password.
	 *
	 * @param oldPassword the new old password
	 */
	public void setOldPassword(String oldPassword) {

		this.oldPassword = oldPassword;
	}

	/**
	 * Gets the new password.
	 *
	 * @return the new password
	 */
	public String getNewPassword() {

		return newPassword;
	}

	/**
	 * Sets the new password.
	 *
	 * @param newPassword the new new password
	 */
	public void setNewPassword(String newPassword) {

		this.newPassword = newPassword;
	}

	/**
	 * Gets the confirmation.
	 *
	 * @return the confirmation
	 */
	public String getConfirmation() {

		return confirmation;
	}

	/**
	 * Sets the confirmation.
	 *
	 * @param confirmation the new confirmation
	 */
	public void setConfirmation(String confirmation) {

		this.confirmation = confirmation;
	}

}
