package com.misfat.qrqc.service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misfat.qrqc.dto.EffetDTO;
import com.misfat.qrqc.dto.IncidentDTO;
import com.misfat.qrqc.dto.Incident_EffetDTO;
import com.misfat.qrqc.model.Incident;
import com.misfat.qrqc.model.Incident_Effet;
import com.misfat.qrqc.repository.IncidentRepository;
import com.misfat.qrqc.repository.Incident_EffetRepository;
import com.misfat.qrqc.service.IncidentService;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentServiceImpl.
 */
@Service
@Transactional
public class IncidentServiceImpl implements IncidentService {

	/** The repo incident. */
	@Autowired
	private IncidentRepository repoIncident;

	/** The repo incident effet. */
	@Autowired
	private Incident_EffetRepository repoIncidentEffet;

	/** The mapper. */
	@Autowired
	private Mapper mapper;

	/**
	 * Creates the incident.
	 *
	 * @param incidentDTO the incident DTO
	 * @return the incident DTO
	 */
	@Override
	public IncidentDTO createIncident(IncidentDTO incidentDTO) {

		Incident saveI = mapper.map(incidentDTO, Incident.class);

		return mapper.map(repoIncident.saveAndFlush(saveI), IncidentDTO.class);
	}

	/*
	 * @Override public List<Incident_EffetDTO>
	 * createIncidentEffet(List<Incident_EffetDTO> incident_effetDTO) {
	 * List<Incident_EffetDTO> result = new ArrayList<>();
	 * if(!incident_effetDTO.isEmpty()) { incident_effetDTO.forEach(e-> {
	 * Incident_Effet saveIE= mapper.map(e, Incident_Effet.class);
	 * if(saveIE.getIncident() != null && saveIE.getIncident().getId() == null) {
	 * saveIE.setIncident(mapper.map(createIncident(e.getIncident()),
	 * Incident.class)); } else {
	 * saveIE.setIncident(getIncidentById(e.getIncident().getId())); }
	 * 
	 * result.add(mapper.map(repoIncidentEffet.saveAndFlush(saveIE),
	 * Incident_EffetDTO.class)); }); } return result; }
	 */

	/**
	 * Gets the incident by id.
	 *
	 * @param id the id
	 * @return the incident by id
	 */
	@Override
	public Incident getIncidentById(Long id) {

		return repoIncident.getById(id);
	}

	/**
	 * Creates the incident effet.
	 *
	 * @param effets   the effets
	 * @param incident the incident
	 * @return the list
	 */
	@Override
	public List<Incident_EffetDTO> createIncidentEffet(List<EffetDTO> effets, IncidentDTO incident) {
		List<Incident_EffetDTO> listIE = new ArrayList<Incident_EffetDTO>();
		Incident_EffetDTO ie = new Incident_EffetDTO();
		if (!effets.isEmpty()) {
			effets.forEach(e -> {
				ie.setEffet(e);
				ie.setIncident(incident);
				Incident_Effet saveIE = mapper.map(ie, Incident_Effet.class);
				listIE.add(mapper.map(repoIncidentEffet.saveAndFlush(saveIE), Incident_EffetDTO.class));
			});
			return listIE;
		} else {
			return null;
		}
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {

		repoIncident.deleteById(id);
	}

}
