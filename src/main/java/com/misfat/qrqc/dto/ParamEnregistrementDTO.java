package com.misfat.qrqc.dto;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ParamEnregistrementDTO.
 */
public class ParamEnregistrementDTO {
	/** The enreg. */
	private EnregistrementDTO enregistrement;

	/** The effet. */
	private List<EffetDTO> effet;

	/** The processus. */
	private List<ProcessusDTO> processus;

	/** The personnel. */
	private List<PersonnelDTO> personnel;

	/**
	 * Gets the processus.
	 *
	 * @return the processus
	 */
	public List<ProcessusDTO> getProcessus() {
		return processus;
	}

	/**
	 * Sets the processus.
	 *
	 * @param processus the new processus
	 */
	public void setProcessus(List<ProcessusDTO> processus) {
		this.processus = processus;
	}

	/**
	 * Gets the personnel.
	 *
	 * @return the personnel
	 */
	public List<PersonnelDTO> getPersonnel() {
		return personnel;
	}

	/**
	 * Sets the personnel.
	 *
	 * @param personnel the new personnel
	 */
	public void setPersonnel(List<PersonnelDTO> personnel) {
		this.personnel = personnel;
	}

	/**
	 * Gets the enregistrement.
	 *
	 * @return the enregistrement
	 */
	public EnregistrementDTO getEnregistrement() {
		return enregistrement;
	}

	/**
	 * Sets the enregistrement.
	 *
	 * @param enregistrement the new enregistrement
	 */
	public void setEnregistrement(EnregistrementDTO enregistrement) {
		this.enregistrement = enregistrement;
	}

	/**
	 * Gets the effet.
	 *
	 * @return the effet
	 */
	public List<EffetDTO> getEffet() {
		return effet;
	}

	/**
	 * Sets the effet.
	 *
	 * @param effet the new effet
	 */
	public void setEffet(List<EffetDTO> effet) {
		this.effet = effet;
	}

}
