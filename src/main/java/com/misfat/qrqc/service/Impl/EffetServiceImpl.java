package com.misfat.qrqc.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misfat.qrqc.dto.EffetDTO;
import com.misfat.qrqc.model.Effet;
import com.misfat.qrqc.repository.EffetRepository;
import com.misfat.qrqc.service.EffetService;

// TODO: Auto-generated Javadoc
/**
 * The Class EffetServiceImpl.
 */
@Service
@Transactional
public class EffetServiceImpl implements EffetService {

	/** The repo effet. */
	@Autowired
	private EffetRepository repoEffet;

	/** The mapper. */
	@Autowired
	private Mapper mapper;

	/**
	 * List ALL effet.
	 *
	 * @return the list
	 */
	@Override
	public List<EffetDTO> ListALLEffet() {
		List<Effet> list = repoEffet.findAll();

		if (list.isEmpty()) {
			return null;
		} else {
			List<EffetDTO> result = list.stream().map(e -> mapper.map(e, EffetDTO.class)).collect(Collectors.toList());
			return result;
		}

	}

}
