package com.ProyectoFinal.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.repository.IOrganizationDao;
import com.ProyectoFinal.app.wrapper.OrganizationWrapper;
import com.ProyectoFinal.app.wrapper.UserWrapper;

@Service
public class OrganizationServiceImpl implements IOrganizationService {
	private static final Logger log = LoggerFactory.getLogger(OrganizationServiceImpl.class);
	@Autowired
	public IOrganizationDao organizationDao;
	@Override
	public OrganizationDto save(OrganizationDto organizationDto) {
		Organization organization = OrganizationWrapper.dtoToEntity(organizationDto);
		organization = organizationDao.save(organization);
		organizationDto = OrganizationWrapper.entityToDto(organization);
		return organizationDto;
	}

	@Override
	@Transactional
	public void removeBypassword(String password) {
		organizationDao.removeBypassword(password);
		
	}

	@Override
	@Transactional
	public List<Organization> findByname(String name) {
		// TODO Auto-generated method stub
		return organizationDao.findByname(name);
	}

	@Override
	@Transactional
	public Organization findBycuit(Integer cuit) {
		// TODO Auto-generated method stub
		return organizationDao.findBycuit(cuit);
	}

	@Override
	public List<Organization> findByAll() {
		// TODO Auto-generated method stub
		return organizationDao.findAll();
	}

}
