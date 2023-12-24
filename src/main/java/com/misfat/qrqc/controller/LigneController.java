package com.misfat.qrqc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.misfat.qrqc.dto.LigneDTO;
import com.misfat.qrqc.dto.ProcessusDTO;
import com.misfat.qrqc.model.Ligne;
import com.misfat.qrqc.model.Processus;
import com.misfat.qrqc.model.Service;
import com.misfat.qrqc.repository.LigneRepository;
import com.misfat.qrqc.repository.ProcessusRepository;
import com.misfat.qrqc.repository.ServiceRepository;
import com.misfat.qrqc.service.LigneService;

// TODO: Auto-generated Javadoc
/**
 * The Class LigneController.
 */
@RestController
@RequestMapping("/ligne")
public class LigneController {

	/** The ligne service. */
	@Autowired
	private LigneService ligneService;
	@Autowired
	private LigneRepository LigneRepo;
	@Autowired
	private ProcessusRepository procRepo;
	@Autowired
	private ServiceRepository serviceRepo;

	/**
	 * List all.
	 *
	 * @return the list
	 */
	@GetMapping("/listAll")
	List<LigneDTO> listAll() {
		return ligneService.ListAllLigne();
	}

	/**
	 * List processus.
	 *
	 * @param ligne the ligne
	 * @return the list
	 */
	@PostMapping("/listProcessus")
	List<ProcessusDTO> listProcessus(@RequestBody Ligne ligne) {
		return ligneService.ListProcessusByLigne(ligne);

	}
	@PostMapping("/create/ligne")
	Ligne createLigne(@RequestBody Ligne ligne) {
		return LigneRepo.save(ligne);

	}
	@PostMapping("/create/processus")
	Processus createProcessus(@RequestBody Processus proc) {
		return procRepo.save(proc);

	}
	@PostMapping("/create/service")
	Service createService(@RequestBody Service service) {
		return serviceRepo.save(service);

	}
	

}
