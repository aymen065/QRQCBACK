package com.misfat.qrqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.Service;

/**
 * The Interface ServiceRepository.
 */
@Repository
public interface ServiceRepository
		extends JpaRepository<Service, Integer>{

}
