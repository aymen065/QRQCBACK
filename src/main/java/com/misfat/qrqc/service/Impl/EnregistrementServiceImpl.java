package com.misfat.qrqc.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misfat.qrqc.configuration.EnregSpecification;
import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.IncidentDTO;
import com.misfat.qrqc.dto.LigneDTO;
import com.misfat.qrqc.model.Enregistrement;
import com.misfat.qrqc.model.Incident;
import com.misfat.qrqc.model.Ligne;
import com.misfat.qrqc.repository.EnregistrementRepository;
import com.misfat.qrqc.repository.Enregistrement_PersonnelRepository;
import com.misfat.qrqc.repository.Enregistrement_ProcessusRepository;
import com.misfat.qrqc.service.EnregistrementService;
import com.misfat.qrqc.service.IncidentService;

// TODO: Auto-generated Javadoc
/**
 * The Class EnregistrementServiceImpl.
 */
@Service
@Transactional
public class EnregistrementServiceImpl implements EnregistrementService {

	/** The repo enregistrement. */
	@Autowired
	private EnregistrementRepository repoEnregistrement;

	/** The incident service. */
	@Autowired
	private IncidentService incidentService;

	/** The repo ep. */
	@Autowired
	private Enregistrement_PersonnelRepository repo_ep;

	/** The repo epro. */
	@Autowired
	private Enregistrement_ProcessusRepository repo_epro;

	/** The mapper. */
	@Autowired
	private Mapper mapper;

	// @PersistenceContext
	// private EntityManager em;

	/** The eng specification. */
	@Autowired
	private EnregSpecification engSpecification;

	/**
	 * Creates the enregistrement.
	 *
	 * @param enregistrementDTO the enregistrement DTO
	 * @return the enregistrement DTO
	 */
	@Override
	public EnregistrementDTO createEnregistrement(EnregistrementDTO enregistrementDTO) {
		Enregistrement saveEnreg = mapper.map(enregistrementDTO, Enregistrement.class);

		if (saveEnreg.getIncident() != null && saveEnreg.getIncident().getId() == null) {
			saveEnreg.setIncident(
					mapper.map(incidentService.createIncident(enregistrementDTO.getIncident()), Incident.class));
		} else {
			saveEnreg.setIncident(incidentService.getIncidentById(enregistrementDTO.getIncident().getId()));
		}
		return mapper.map(repoEnregistrement.saveAndFlush(saveEnreg), EnregistrementDTO.class);
	}

	/**
	 * Gets the last num ligne.
	 *
	 * @param ligne the ligne
	 * @return the last num ligne
	 */
	@Override
	public Integer getLastNumLigne(LigneDTO ligne) {

		Ligne l = mapper.map(ligne, Ligne.class);
		Integer res = repoEnregistrement.getLastNumLigne(l.getId());
		if (res != null) {
			return res;
		} else {
			return 1;
		}
	}

	/**
	 * Gets the all enregistrement.
	 *
	 * @param enregistrementDTO the enregistrement DTO
	 * @return the all enregistrement
	 */
	@Override
	public List<Enregistrement> getAllEnregistrement(EnregistrementDTO enregistrementDTO) {

		List<Enregistrement> list = repoEnregistrement.findAll(engSpecification.getEnregistrements(enregistrementDTO));

		return list;
		// list.stream().map(e -> mapper.map(e,
		// EnregistrementDTO.class)).collect(Collectors.toList());
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public List<EnregistrementDTO> getAll() {
		List<Enregistrement> list = repoEnregistrement.findAll();
		return list.stream().map(e -> mapper.map(e, EnregistrementDTO.class)).collect(Collectors.toList());
	}

	/**
	 * Validate enregistrement.
	 *
	 * @param enregistrementDTO the enregistrement DTO
	 * @return the enregistrement DTO
	 */
	@Override
	public EnregistrementDTO validateEnregistrement(EnregistrementDTO enregistrementDTO) {
		if (enregistrementDTO.getId() != null) {
			EnregistrementDTO oldEnreg = mapper.map(getOne(enregistrementDTO.getId()), EnregistrementDTO.class);

			if (enregistrementDTO.getDatePrevue() != null) {
				oldEnreg.setDatePrevue(enregistrementDTO.getDatePrevue());
			}
			if (enregistrementDTO.getDateCloture() != null) {
				oldEnreg.setDateCloture(enregistrementDTO.getDateCloture());
			}
			if (enregistrementDTO.getIncident().getActionCorrective() != null) {
				IncidentDTO incident = oldEnreg.getIncident();
				incident.setActionCorrective(enregistrementDTO.getIncident().getActionCorrective());
				incidentService.createIncident(incident);
				// .setActionCorrective(enregistrementDTO.getIncident().getActionCorrective());
			}

			/* mapper.map(enregistrementDTO, oldEnreg); */
			Enregistrement toValidate = mapper.map(oldEnreg, Enregistrement.class);
			return mapper.map(repoEnregistrement.saveAndFlush(toValidate), EnregistrementDTO.class);

		}
		return null;
	}

	/**
	 * Gets the one.
	 *
	 * @param id the id
	 * @return the one
	 */
	@Override
	public Enregistrement getOne(Long id) {

		return repoEnregistrement.findById(id).get();
	}

	/**
	 * Deleteby enreg id and role.
	 *
	 * @param id   the id
	 * @param role the role
	 */
	@Override
	public void deletebyEnregIdAndRole(Long id, String role) {
		repo_ep.deletebyEnregIdAndRole(id, role);
	}

	/**
	 * Delete by enreg.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteByEnreg(Long id) {
		if (id != null) {
			Enregistrement e = getOne(id);

			repo_ep.deletebyEnregId(id);
			repo_epro.deletebyEnregId(id);
			repoEnregistrement.deleteById(id);
			incidentService.deleteById(e.getIncident().getId());

		}

	}

}
