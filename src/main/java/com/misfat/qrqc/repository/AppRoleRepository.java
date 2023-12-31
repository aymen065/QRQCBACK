package com.misfat.qrqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misfat.qrqc.model.AppRole;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Integer> {

}
