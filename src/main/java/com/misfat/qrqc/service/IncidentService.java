package com.misfat.qrqc.service;

import java.util.List;

import com.misfat.qrqc.dto.EffetDTO;
import com.misfat.qrqc.dto.IncidentDTO;
import com.misfat.qrqc.dto.Incident_EffetDTO;
import com.misfat.qrqc.model.Incident;

// TODO: Auto-generated Javadoc
/**
 * The Interface IncidentService.
 */
public interface IncidentService {

	/**
	 * Creates the incident.
	 *
	 * @param incidentDTO the incident DTO
	 * @return the incident DTO
	 */
	IncidentDTO createIncident(IncidentDTO incidentDTO);

	/**
	 * Creates the incident effet.
	 *
	 * @param effetDTO the effet DTO
	 * @param incident the incident
	 * @return the list
	 */
	List<Incident_EffetDTO> createIncidentEffet(List<EffetDTO> effetDTO, IncidentDTO incident);

	/**
	 * Gets the incident by id.
	 *
	 * @param id the id
	 * @return the incident by id
	 */
	Incident getIncidentById(Long id);

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	void deleteById(Long id);

}
