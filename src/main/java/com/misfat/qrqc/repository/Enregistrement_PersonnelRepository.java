package com.misfat.qrqc.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Enregistrement_Personnel;

/**
 * The Interface Enregistrement_PersonnelRepository.
 */
@Repository
public interface Enregistrement_PersonnelRepository extends JpaRepository<Enregistrement_Personnel, Long> {
	@Transactional
	@Modifying
	@Query("DELETE FROM Enregistrement_Personnel EP WHERE EP.enregistrement.id = :id AND EP.role= :role ")
	void deletebyEnregIdAndRole(@Param("id") Long id,@Param("role") String role);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Enregistrement_Personnel EP WHERE EP.enregistrement.id = :id")
	void deletebyEnregId(@Param("id") Long id);
}
