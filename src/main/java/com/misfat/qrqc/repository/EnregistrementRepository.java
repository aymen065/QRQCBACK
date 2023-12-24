package com.misfat.qrqc.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.model.Enregistrement;

/**
 * The Interface EnregistrementRepository.
 */
@Repository
public interface EnregistrementRepository extends JpaRepository<Enregistrement, Long> {
	
	@Query("SELECT MAX(E.numReunion)+1 FROM Enregistrement E JOIN E.processus EP JOIN EP.processus P JOIN P.ligne L WHERE L.id = :ligneId")
	Integer getLastNumLigne(Integer ligneId);

	List<Enregistrement> findByDateEnregBetween(Date dateEnregInf, Date dateEnregSup);

	List<Enregistrement> findAll(Specification<EnregistrementDTO> specification);

	

}
