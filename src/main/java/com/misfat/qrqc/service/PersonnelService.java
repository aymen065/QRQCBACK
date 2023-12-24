package com.misfat.qrqc.service;

import java.util.List;

import com.misfat.qrqc.dto.ServiceDTO;
import com.misfat.qrqc.model.AppRole;
import com.misfat.qrqc.model.Personnel;
import com.misfat.qrqc.model.Service;
import com.misfat.qrqc.dto.ChangePasswordDTO;
import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.Enregistrement_PersonnelDTO;
import com.misfat.qrqc.dto.PersonnelDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface PersonnelService.
 */
public interface PersonnelService {

	/**
	 * List all services.
	 *
	 * @return the list
	 */
	List<ServiceDTO> ListAllServices();

	/**
	 * List personnel by service.
	 *
	 * @param services the services
	 * @return the list
	 */
	List<PersonnelDTO> ListPersonnelByService(List<Service> services);

	/**
	 * Creates the enreg personnel.
	 *
	 * @param enregistrement the enregistrement
	 * @param personnels     the personnels
	 * @return the list
	 */
	List<Enregistrement_PersonnelDTO> createEnregPersonnel(EnregistrementDTO enregistrement,
			List<PersonnelDTO> personnels);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	List<Personnel> getAll();

	/**
	 * Creates the.
	 *
	 * @param user the user
	 * @return the personnel
	 */
	Personnel create(Personnel user);

	/**
	 * Load user by username.
	 *
	 * @param userName the user name
	 * @param active the active
	 * @return the personnel
	 */
	Personnel loadUserByUsername(String userName, boolean active);

	/**
	 * Change password.
	 *
	 * @param changePasswordModel the change password model
	 * @return the personnel
	 */
	Personnel changePassword(ChangePasswordDTO changePasswordModel);

	/**
	 * Update.
	 *
	 * @param id   the id
	 * @param user the user
	 * @return the personnel
	 */
	Personnel update(Integer id, Personnel user);

	/**
	 * Check user credentials.
	 *
	 * @param password the password
	 * @param user     the user
	 * @return the boolean
	 */
	Boolean checkUserCredentials(String password, Personnel user);

	/**
	 * Match password.
	 *
	 * @param changePasswordDTO the change password DTO
	 * @return the boolean
	 */
	Boolean matchPassword(ChangePasswordDTO changePasswordDTO);
	/*
	 * Optional<Personnel> loadUserByUsernameAndActive(String userName, boolean
	 * active) throws UsernameNotFoundException;
	 */

	/**
	 * Valid login.
	 *
	 * @param login the login
	 * @return the boolean
	 */
	Boolean validLogin(String login);

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	List<AppRole> getList();
	
	/**
	 * Update password.
	 *
	 * @param user the user
	 * @return the personnel
	 */
	Personnel updatePassword(Personnel user);
}
