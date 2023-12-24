package com.misfat.qrqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Ligne;

/**
 * The Interface LigneRepository.
 */
@Repository
public interface LigneRepository
		extends JpaRepository<Ligne, Integer> {

}
