package com.ProyectoFinal.app.repository;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ProyectoFinal.app.dto.UserDto;
import com.ProyectoFinal.app.entity.User;

public interface IUserDao extends  JpaRepository<User, Long>{
	public List<User> findByDni (Integer dni);
	
	public List<User> findByLastname (String lastname);
	
	public User findByCode(String code);

	public void removeBycode(String code);
	
}
