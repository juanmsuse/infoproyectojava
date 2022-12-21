package com.ProyectoFinal.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoFinal.app.entity.Organization;

public interface IOrganizationDao extends  JpaRepository<Organization, Long> {
	
	public void removeBypassword(String password);
	
	public Organization findBycuit (Integer cuit);
	
	public List<Organization> findByname (String name);
	
	public Organization findBypassword (String password);

}
