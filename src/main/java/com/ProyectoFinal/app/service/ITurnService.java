package com.ProyectoFinal.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.dto.TurnDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.Turn;
import com.ProyectoFinal.app.entity.User;

@Repository
public interface ITurnService {
	public List <Event> findBytype (String type);
	public List<Organization> findByname (String name);
	public List<User> findByLastname (String lastname);
	public TurnDto save(TurnDto turn);
	public List<Turn> findByid(Long Id);
}
