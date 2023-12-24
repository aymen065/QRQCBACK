package com.misfat.qrqc.service;

import java.util.List;

import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.Enregistrement_ProcessusDTO;
import com.misfat.qrqc.dto.LigneDTO;
import com.misfat.qrqc.dto.ProcessusDTO;
import com.misfat.qrqc.model.Ligne;

// TODO: Auto-generated Javadoc
/**
 * The Interface LigneService.
 */
public interface LigneService {

	/**
	 * List all ligne.
	 *
	 * @return the list
	 */
	List<LigneDTO> ListAllLigne();

	/**
	 * List processus by ligne.
	 *
	 * @param ligne the ligne
	 * @return the list
	 */
	List<ProcessusDTO> ListProcessusByLigne(Ligne ligne);


	/**
	 * Creates the enreg processus.
	 *
	 * @param enregistrement the enregistrement
	 * @param processus the processus
	 * @return the list
	 */
	List<Enregistrement_ProcessusDTO> createEnregProcessus(EnregistrementDTO enregistrement, List<ProcessusDTO> processus);
}
