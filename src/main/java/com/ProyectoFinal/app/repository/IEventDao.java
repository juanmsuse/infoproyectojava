package com.ProyectoFinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoFinal.app.entity.Event;

public interface IEventDao  extends  JpaRepository<Event, Long>  {

}
