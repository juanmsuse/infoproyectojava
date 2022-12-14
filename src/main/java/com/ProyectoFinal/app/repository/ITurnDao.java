package com.ProyectoFinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoFinal.app.entity.Turn;

public interface ITurnDao  extends  JpaRepository<Turn, Long>  {

}
