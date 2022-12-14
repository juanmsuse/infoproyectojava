package com.ProyectoFinal.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ProyectoFinal.app.dto.UserDto;
import com.ProyectoFinal.app.entity.User;

@Repository
public interface IUserService {
	
	public List<User> findByAll();
	
	public List<User> findByDni(Integer dni);
	
	public List<User> findByLastname(String lastname);
	
	public UserDto save(UserDto user); 
	
	public UserDto findByCode(String code);
	
	public UserDto update(UserDto userDto );
	
	public void  removeBycode(String code);
	

}
