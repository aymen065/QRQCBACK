package com.misfat.qrqc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Personnel;

/**
 * The Interface PersonnelRepository.
 */
@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {

	@Query("SELECT P FROM Personnel P WHERE P.service.id = :id ")
	List<Personnel> getByServiceId(Integer id);

	Personnel findByLoginAndActive(String userName, Boolean active);

	@Query("SELECT case when count(P)>0 then true else false end FROM Personnel P WHERE P.login = :login ")
	Boolean existsLogin (String login );
}
