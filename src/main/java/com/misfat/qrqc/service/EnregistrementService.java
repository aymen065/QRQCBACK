package com.misfat.qrqc.service;

import java.util.List;

import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.LigneDTO;
import com.misfat.qrqc.model.Enregistrement;

// TODO: Auto-generated Javadoc
/**
 * The Interface EnregistrementService.
 */
public interface EnregistrementService {

	/**
	 * Creates the enregistrement.
	 *
	 * @param enregistrementDTO the enregistrement DTO
	 * @return the enregistrement DTO
	 */
	EnregistrementDTO createEnregistrement(EnregistrementDTO enregistrementDTO);

	/**
	 * Gets the last num ligne.
	 *
	 * @param ligne the ligne
	 * @return the last num ligne
	 */
	Integer getLastNumLigne(LigneDTO ligne);

	/**
	 * Gets the all enregistrement.
	 *
	 * @param enregistrement the enregistrement
	 * @return the all enregistrement
	 */
	List<Enregistrement> getAllEnregistrement(EnregistrementDTO enregistrement);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	List<EnregistrementDTO> getAll();

	/**
	 * Validate enregistrement.
	 *
	 * @param enregistrementDTO the enregistrement DTO
	 * @return the enregistrement DTO
	 */
	EnregistrementDTO validateEnregistrement(EnregistrementDTO enregistrementDTO);

	/**
	 * Gets the one.
	 *
	 * @param id the id
	 * @return the one
	 */
	Enregistrement getOne(Long id);

	/**
	 * Deleteby enreg id and role.
	 *
	 * @param id the id
	 * @param role the role
	 */
	void deletebyEnregIdAndRole(Long id, String role);
	
	/**
	 * Delete by enreg.
	 *
	 * @param id the id
	 */
	void deleteByEnreg(Long id);

}
