package com.misfat.qrqc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misfat.qrqc.dto.EffetDTO;
import com.misfat.qrqc.service.EffetService;

// TODO: Auto-generated Javadoc
/**
 * The Class EffetController.
 */
@RestController
@RequestMapping("/effet")
public class EffetController {

	/** The effet service. */
	@Autowired
	private EffetService effetService;

	/**
	 * List all.
	 *
	 * @return the list
	 */
	@GetMapping("/listAll")
	List<EffetDTO> listAll() {
		return effetService.ListALLEffet();
	}

}
