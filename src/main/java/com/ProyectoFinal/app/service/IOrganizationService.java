package com.ProyectoFinal.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.entity.Organization;


@Repository
public interface IOrganizationService {
	public OrganizationDto save(OrganizationDto organization);
	
	public void removeBypassword(String password);
	
	public List<Organization> findByname (String name);
	
	public Organization findBycuit (Integer cuit);
	
	public List<Organization>findByAll();

}
