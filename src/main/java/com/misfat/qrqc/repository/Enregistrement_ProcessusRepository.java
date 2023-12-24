package com.misfat.qrqc.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Enregistrement_Processus;

/**
 * The Interface Enregistrement_ProcessusRepository.
 */
@Repository
public interface Enregistrement_ProcessusRepository extends JpaRepository<Enregistrement_Processus, Long> {
	

	@Transactional
	@Modifying
	@Query("DELETE FROM Enregistrement_Processus EP WHERE EP.enregistrement.id = :id")
	void deletebyEnregId(@Param("id") Long id);
}
