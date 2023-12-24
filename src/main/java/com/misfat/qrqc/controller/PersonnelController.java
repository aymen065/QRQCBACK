package com.misfat.qrqc.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.misfat.qrqc.dto.ChangePasswordDTO;
import com.misfat.qrqc.dto.PersonnelDTO;
import com.misfat.qrqc.dto.ServiceDTO;
import com.misfat.qrqc.model.AppRole;
import com.misfat.qrqc.model.Personnel;
import com.misfat.qrqc.model.Service;
import com.misfat.qrqc.service.PersonnelService;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonnelController.
 */
@RestController
@RequestMapping("/personnel")
public class PersonnelController {

	/** The personnel service. */
	@Autowired
	private PersonnelService personnelService;

	/**
	 * List all service.
	 *
	 * @return the list
	 */
	@GetMapping("/listAllService")
	List<ServiceDTO> listAllService() {
		return personnelService.ListAllServices();
	}

	/**
	 * List personnel.
	 *
	 * @param service the service
	 * @return the list
	 */
	@PostMapping("/listPersonnel")
	List<PersonnelDTO> listPersonnel(@RequestBody List<Service> service) {
		return personnelService.ListPersonnelByService(service);

	}

	/**
	 * List all personnel.
	 *
	 * @return the list
	 */
	@GetMapping("/listAllPersonnel")
	List<Personnel> listAllPersonnel() {
		return personnelService.getAll();
	}

	/**
	 * Adds the user.
	 *
	 * @param user the user
	 * @return the personnel
	 */
	@PostMapping("/create")
	// @PreAuthorize("hasRole('ROLE_SUPER')")
	public Personnel addUser(@RequestBody Personnel user) {

		return personnelService.create(user);
	}
	

	/**
	 * Valid login.
	 *
	 * @param login the login
	 * @return true, if successful
	 */
	@GetMapping("/validLogin")
	public boolean validLogin(@RequestParam("query") String login) {
		return personnelService.validLogin(login);
	}

	/**
	 * User.
	 *
	 * @param user the user
	 * @return the personnel
	 */
	@RequestMapping("/user")
	public Personnel user(Principal user) {
		return personnelService.loadUserByUsername(user.getName(), true);
	}

	/**
	 * Change password.
	 *
	 * @param changePasswordModel the change password model
	 * @return the personnel
	 */
	@PostMapping("/change-password")
	public Personnel changePassword(@RequestBody ChangePasswordDTO changePasswordModel) {

		return personnelService.changePassword(changePasswordModel);
	}

	/**
	 * Check password.
	 *
	 * @param changePasswordModel the change password model
	 * @return the boolean
	 */
	@PostMapping("/check-password")
	public Boolean checkPassword(@RequestBody ChangePasswordDTO changePasswordModel) {

		return personnelService.matchPassword(changePasswordModel);
	}

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	@GetMapping("/listRole")
	public List<AppRole> getList() {
		return personnelService.getList();

	}

	@PostMapping("/update-password")
	// @PreAuthorize("hasRole('ROLE_SUPER')")
	public Personnel changePasswordAdmin(@RequestBody Personnel user) {

		return personnelService.updatePassword(user);
	}
	
	@PostMapping("/update")
	//@PreAuthorize("hasRole('ROLE_SUPER')")
	public Personnel updateUser(@RequestBody Personnel user) {

		return personnelService.update(user.getId(), user);
	}

}
