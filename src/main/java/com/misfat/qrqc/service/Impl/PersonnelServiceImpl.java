package com.misfat.qrqc.service.Impl;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.misfat.qrqc.dto.ChangePasswordDTO;
import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.dto.Enregistrement_PersonnelDTO;
import com.misfat.qrqc.dto.PersonnelDTO;
import com.misfat.qrqc.dto.ServiceDTO;
import com.misfat.qrqc.model.AppRole;
import com.misfat.qrqc.model.Enregistrement_Personnel;
import com.misfat.qrqc.model.Personnel;
import com.misfat.qrqc.repository.AppRoleRepository;
import com.misfat.qrqc.repository.Enregistrement_PersonnelRepository;
import com.misfat.qrqc.repository.PersonnelRepository;
import com.misfat.qrqc.repository.ServiceRepository;
import com.misfat.qrqc.service.PersonnelService;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonnelServiceImpl.
 */
@Service
@Transactional
public class PersonnelServiceImpl implements PersonnelService {

	/** The repo service. */
	@Autowired
	private ServiceRepository repoService;

	/** The repo personnel. */
	@Autowired
	private PersonnelRepository repoPersonnel;
	
	/** The repo app role. */
	@Autowired
	private AppRoleRepository repoAppRole;

	/** The repo ep. */
	@Autowired
	private Enregistrement_PersonnelRepository repoEp;

	/** The mapper. */
	@Autowired
	private Mapper mapper;

	/** The pwd enc. */
	private PasswordEncoder pwdEnc;

	/**
	 * Instantiates a new personnel service impl.
	 *
	 * @param pwdEnc the pwd enc
	 */
	public PersonnelServiceImpl(PasswordEncoder pwdEnc) {
		this.pwdEnc = pwdEnc;
	}

	/**
	 * List all services.
	 *
	 * @return the list
	 */
	@Override
	public List<ServiceDTO> ListAllServices() {

		List<com.misfat.qrqc.model.Service> list = repoService.findAll();
		if (list.isEmpty()) {
			return null;
		} else {
			List<ServiceDTO> result = list.stream().map(e -> mapper.map(e, ServiceDTO.class))
					.collect(Collectors.toList());
			return result;
		}

	}

	/**
	 * List personnel by service.
	 *
	 * @param services the services
	 * @return the list
	 */
	@Override
	public List<PersonnelDTO> ListPersonnelByService(List<com.misfat.qrqc.model.Service> services) {

		if (services.isEmpty() || services == null) {
			return null;
		}
		List<Personnel> listPer = new ArrayList<Personnel>();
		services.forEach(s -> {
			List<Personnel> personnels = repoPersonnel.getByServiceId(s.getId());
			personnels.forEach(p -> {
				listPer.add(p);
			});
		});
		List<PersonnelDTO> result = listPer.stream().map(e -> mapper.map(e, PersonnelDTO.class))
				.collect(Collectors.toList());

		/*
		 * spec = personnel.service.id.in(serviceDTO.stream().map(e->e.getId()).collect(
		 * Collectors.toList())); List<Personnel> list = (List<Personnel>)
		 * repoPeorsonnel.findAll(spec); List<PersonnelDTO> result = list.stream().map(e
		 * -> mapper.map(e, PersonnelDTO.class)) .collect(Collectors.toList());
		 */
		return result;

	}

	/**
	 * Creates the enreg personnel.
	 *
	 * @param enregistrement the enregistrement
	 * @param personnels     the personnels
	 * @return the list
	 */
	@Override
	public List<Enregistrement_PersonnelDTO> createEnregPersonnel(EnregistrementDTO enregistrement,
			List<PersonnelDTO> personnels) {

		List<Enregistrement_PersonnelDTO> listEP = new ArrayList<Enregistrement_PersonnelDTO>();
		Enregistrement_PersonnelDTO ep = new Enregistrement_PersonnelDTO();
		if (!personnels.isEmpty()) {
			personnels.forEach(e -> {
				ep.setEnregistrement(enregistrement);
				ep.setPersonnel(e);
				ep.setRole(enregistrement.getParam_role());
				Enregistrement_Personnel saveEP = mapper.map(ep, Enregistrement_Personnel.class);
				listEP.add(mapper.map(repoEp.saveAndFlush(saveEP), Enregistrement_PersonnelDTO.class));
			});
			return listEP;
		} else {
			return null;
		}
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public List<Personnel> getAll() {

		return repoPersonnel.findAll();
	}

	/**
	 * Load user by username.
	 *
	 * @param userName the user name
	 * @param active the active
	 * @return the personnel
	 */
	@Override
	public Personnel loadUserByUsername(String userName, boolean active) {
		Personnel user = repoPersonnel.findByLoginAndActive(userName, active);
		if(user != null) {
			return user;
		}
		return null;
	}

	/**
	 * Creates the.
	 *
	 * @param user the user
	 * @return the personnel
	 */
	@Override
	public Personnel create(Personnel user) {
		if (user != null) {
			user.setPassword(pwdEnc.encode(user.getPassword()));
			user.setActive(true);
			user = repoPersonnel.saveAndFlush(user);
		}
		return user;
	}

	/**
	 * Change password.
	 *
	 * @param changePasswordModel the change password model
	 * @return the personnel
	 */
	@Override
	public Personnel changePassword(ChangePasswordDTO changePasswordModel) {
		Personnel user = repoPersonnel.findById(changePasswordModel.getUserId()).orElse(null);
		if (Boolean.TRUE.equals(checkUserCredentials(changePasswordModel.getOldPassword(), user))) {
			user.setLastLoginDate(new Date());
			user.setPassword(pwdEnc.encode(changePasswordModel.getNewPassword()));
			update(user.getId(), user);
		}
		return user;
	}
	
	/**
	 * Check user credentials.
	 *
	 * @param password the password
	 * @param user the user
	 * @return the boolean
	 */
	@Override
	public Boolean checkUserCredentials(String password, Personnel user) {

		return pwdEnc.matches(password, user.getPassword());
	}

	/**
	 * Update.
	 *
	 * @param id the id
	 * @param user the user
	 * @return the personnel
	 */
	@Override
	public Personnel update(Integer id, Personnel user) {
		Personnel oldUser =repoPersonnel.findById(id).orElse(null);
		mapper.map(user,oldUser);
		return repoPersonnel.saveAndFlush(oldUser); 
	}
	
	/**
	 * Match password.
	 *
	 * @param changePasswordDTO the change password DTO
	 * @return the boolean
	 */
	@Override
	public Boolean matchPassword(ChangePasswordDTO changePasswordDTO) {

		Personnel user =repoPersonnel.findById(changePasswordDTO.getUserId()).orElse(null);
		return checkUserCredentials(changePasswordDTO.getOldPassword(), user);
	}

	/**
	 * Valid login.
	 *
	 * @param login the login
	 * @return the boolean
	 */
	@Override
	public Boolean validLogin(String login) {
		
		return repoPersonnel.existsLogin(login);
	}

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	@Override
	public List<AppRole> getList() {
		List<AppRole> roles= repoAppRole.findAll();
		return roles;
	}

	/**
	 * Update password.
	 *
	 * @param user the user
	 * @return the personnel
	 */
	@Override
	public Personnel updatePassword(Personnel user) {
		if (user.getPassword() != null) {
			user.setPassword(pwdEnc.encode(user.getPassword()));
			update(user.getId(), user);
			return user;
		}
		return null;
	}

}
