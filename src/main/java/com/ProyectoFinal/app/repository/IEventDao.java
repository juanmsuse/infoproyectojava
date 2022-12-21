package com.ProyectoFinal.app.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProyectoFinal.app.entity.Event;

@Repository
public interface IEventDao extends  JpaRepository<Event, Long>{
	@Query(value="SELECT e FROM events e WHERE type=:type")
	List <Event> findbytype (String type);
}