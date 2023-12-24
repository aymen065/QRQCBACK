package com.misfat.qrqc.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.Enregistrement_ProcessusDTO;
import com.misfat.qrqc.dto.LigneDTO;
import com.misfat.qrqc.dto.ProcessusDTO;
import com.misfat.qrqc.model.Enregistrement_Processus;
import com.misfat.qrqc.model.Ligne;
import com.misfat.qrqc.model.Processus;
import com.misfat.qrqc.repository.Enregistrement_ProcessusRepository;
import com.misfat.qrqc.repository.LigneRepository;
import com.misfat.qrqc.repository.ProcessusRepository;
import com.misfat.qrqc.service.LigneService;

// TODO: Auto-generated Javadoc
/**
 * The Class LigneServiceImpl.
 */
@Service
@Transactional
public class LigneServiceImpl implements LigneService {

	/** The repo ligne. */
	@Autowired
	private LigneRepository repoLigne;

	/** The repo processus. */
	@Autowired
	private ProcessusRepository repoProcessus;

	/** The repo ep. */
	@Autowired
	private Enregistrement_ProcessusRepository repoEp;

	/** The mapper. */
	@Autowired
	private Mapper mapper;

	/**
	 * List all ligne.
	 *
	 * @return the list
	 */
	@Override
	public List<LigneDTO> ListAllLigne() {

		List<Ligne> list = repoLigne.findAll();

		if (list.isEmpty()) {
			return null;
		} else {
			List<LigneDTO> result = list.stream().map(e -> mapper.map(e, LigneDTO.class)).collect(Collectors.toList());
			return result;
		}

	}

	/**
	 * List processus by ligne.
	 *
	 * @param ligne the ligne
	 * @return the list
	 */
	@Override
	public List<ProcessusDTO> ListProcessusByLigne(Ligne ligne) {

		if (ligne == null)
			return null;
		if (ligne.getId() != null) {

			Integer id = ligne.getId();
			List<Processus> listProcessus = repoProcessus.getByLigneId(id);
			List<ProcessusDTO> result = listProcessus.stream().map(e -> mapper.map(e, ProcessusDTO.class))
					.collect(Collectors.toList());
			return result;

		} else {
			return null;
		}

	}

	/**
	 * Creates the enreg processus.
	 *
	 * @param enregistrement the enregistrement
	 * @param processus the processus
	 * @return the list
	 */
	@Override
	public List<Enregistrement_ProcessusDTO> createEnregProcessus(EnregistrementDTO enregistrement,
			List<ProcessusDTO> processus) {
		List<Enregistrement_ProcessusDTO> listEP = new ArrayList<Enregistrement_ProcessusDTO>();
		Enregistrement_ProcessusDTO ep = new Enregistrement_ProcessusDTO();
		if (!processus.isEmpty()) {
			processus.forEach(e -> {
				ep.setEnregistrement(enregistrement);
				ep.setProcessus(e);
				Enregistrement_Processus saveEP = mapper.map(ep, Enregistrement_Processus.class);
				listEP.add(mapper.map(repoEp.saveAndFlush(saveEP), Enregistrement_ProcessusDTO.class));
			});
			return listEP;
		} else {
			return null;
		}
	}

}
