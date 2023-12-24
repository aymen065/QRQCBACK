package com.misfat.qrqc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.LigneDTO;
import com.misfat.qrqc.dto.ParamEnregistrementDTO;
import com.misfat.qrqc.model.Enregistrement;
import com.misfat.qrqc.service.EnregistrementService;
import com.misfat.qrqc.service.IncidentService;
import com.misfat.qrqc.service.LigneService;
import com.misfat.qrqc.service.PersonnelService;

// TODO: Auto-generated Javadoc
/**
 * The Class EnregistrementController.
 */
@RestController
@RequestMapping("/enregistrement")
public class EnregistrementController {

	/** The Enreg service. */
	@Autowired
	private EnregistrementService enregService;

	/** The Incident service. */
	@Autowired
	private IncidentService incidentService;

	/** The ligne service. */
	@Autowired
	private LigneService ligneService;

	/** The personnel service. */
	@Autowired
	private PersonnelService personnelService;

	/**
	 * Creates the enreg.
	 *
	 * @param setenregistrement the setenregistrement
	 * @return the param enregistrement DTO
	 */
	@PostMapping("/createEnreg")
	@ResponseBody
	ParamEnregistrementDTO createEnreg(@RequestBody ParamEnregistrementDTO setenregistrement) {

		EnregistrementDTO resEnrg = enregService.createEnregistrement(setenregistrement.getEnregistrement());
		resEnrg.setParam_role("niv1");
		if (resEnrg != null && resEnrg.getId() != null && resEnrg.getIncident().getId() != null) {
			if (setenregistrement.getEffet() != null && resEnrg.getIncident() != null) {
				incidentService.createIncidentEffet(setenregistrement.getEffet(), resEnrg.getIncident());
			}
			if (setenregistrement.getProcessus() != null) {
				ligneService.createEnregProcessus(resEnrg, setenregistrement.getProcessus());
			}
			if (setenregistrement.getPersonnel() != null) {
				personnelService.createEnregPersonnel(resEnrg, setenregistrement.getPersonnel());
			}

		}

		return new ParamEnregistrementDTO();
	}

	/**
	 * Validate enreg.
	 *
	 * @param setenregistrement the setenregistrement
	 * @return the param enregistrement DTO
	 */
	@PostMapping("/validateEnreg")
	@ResponseBody
	ParamEnregistrementDTO validateEnreg(@RequestBody ParamEnregistrementDTO setenregistrement) {
		EnregistrementDTO resEnrg = enregService.validateEnregistrement(setenregistrement.getEnregistrement());
		resEnrg.setParam_role("niv2");

		if (setenregistrement.getPersonnel() != null) {
			enregService.deletebyEnregIdAndRole(resEnrg.getId(), resEnrg.getParam_role());
			personnelService.createEnregPersonnel(resEnrg, setenregistrement.getPersonnel());
		}
		return new ParamEnregistrementDTO();
	}

	/**
	 * Gets the last num.
	 *
	 * @param ligne the ligne
	 * @return the last num
	 */
	@PostMapping("/getLastNum")
	Integer getLastNum(@RequestBody LigneDTO ligne) {
		return enregService.getLastNumLigne(ligne);
	}

	/**
	 * Gets the last num.
	 *
	 * @param enregistrementDTO the enregistrement DTO
	 * @return the last num
	 */
	@PostMapping("/getEnreg")
	List<Enregistrement> getLastNum(@RequestBody EnregistrementDTO enregistrementDTO) {
		return enregService.getAllEnregistrement(enregistrementDTO);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@GetMapping("/getAllEnreg")
	List<EnregistrementDTO> getAll() {
		return enregService.getAll();
	}

	/**
	 * Gets the one.
	 *
	 * @param id the id
	 * @return the one
	 */
	@GetMapping("/getOneEnreg/{id}")
	Enregistrement getOne(@PathVariable("id") Long id) {
		return enregService.getOne(id);

	}

	/**
	 * Delete by enreg.
	 *
	 * @param id the id
	 */
	@DeleteMapping("/deleteOneEnreg/{id}")

	void deleteByEnreg(@PathVariable("id") Long id) {
		enregService.deleteByEnreg(id);
	}
}
