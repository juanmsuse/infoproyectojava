package com.ProyectoFinal.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.Turn;
import com.ProyectoFinal.app.entity.User;

public interface ITurnDao  extends  JpaRepository<Turn, Long>  {
	public  Event findByevent ( Event event);
	public Organization findByorganization (Organization organization);
	public User findByuser (User user);
	@Query(value = "SELECT t FROM turnos t WHERE  organization_id = :id")
    public List <Turn> findByid(Long id);


}
