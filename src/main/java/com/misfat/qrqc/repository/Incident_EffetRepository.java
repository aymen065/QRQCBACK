package com.misfat.qrqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Incident_Effet;

/**
 * The Interface Incident_EffetRepository.
 */
@Repository
public interface Incident_EffetRepository extends JpaRepository<Incident_Effet, Long> {

}
