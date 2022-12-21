package com.ProyectoFinal.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoFinal.app.dto.TurnDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.Turn;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.repository.ITurnDao;
import com.ProyectoFinal.app.wrapper.OrganizationWrapper;
import com.ProyectoFinal.app.wrapper.TurnWrapper;

@Service
public class TurnServiceImpl implements ITurnService {
private static final Logger log = LoggerFactory.getLogger(TurnServiceImpl.class);
	
@Autowired
ITurnDao turnDao;

@Override
public List<Event> findBytype(String type) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Organization> findByname(String name) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<User> findByLastname(String lastname) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public TurnDto save(TurnDto turnDto) {
	Turn turn = TurnWrapper.dtoToEntity(turnDto);
	turn = turnDao.save(turn);
	turnDto = TurnWrapper.entityToDto(turn);
	return turnDto;
}

@Override
public List<Turn> findByid(Long Id) {
	// TODO Auto-generated method stub
	return turnDao.findByid(Id);
}
	

}
