package com.misfat.qrqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Incident;

/**
 * The Interface IncidentRepository.
 */
@Repository
public interface IncidentRepository
		extends JpaRepository<Incident, Long> {

}
