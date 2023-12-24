package com.misfat.qrqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Effet;

/**
 * The Interface EffetRepository.
 */
@Repository
public interface EffetRepository
		extends JpaRepository<Effet, Integer>{

}
