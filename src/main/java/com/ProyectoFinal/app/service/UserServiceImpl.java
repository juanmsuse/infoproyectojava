package com.ProyectoFinal.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoFinal.app.dto.UserDto;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.repository.IUserDao;
import com.ProyectoFinal.app.wrapper.UserWrapper;

@Service
public class UserServiceImpl implements IUserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private IUserDao userDao;
	

	@Override
	public List<User> findByAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public List<User> findByDni(Integer dni) {
		// TODO Auto-generated method stub
		return userDao.findByDni(dni);
	}

	@Override
	@Transactional
	public List<User> findByLastname(String lastname) {
		// TODO Auto-generated method stub
		return userDao.findByLastname(lastname);
	}

	@Override
	public UserDto save (UserDto userDto) {
		User user = UserWrapper.dtoToEntity(userDto);
		user = userDao.save(user);
		userDto = UserWrapper.entityToDto(user);
		return userDto;
	}
	
	@Override
	public UserDto update(UserDto userDto) {
		User userExist = userDao.findByCode(userDto.getCode());
		
		if(userExist != null) {
			
			User entityToPersist = new User(); 
			
			entityToPersist.setId(userExist.getId());
			entityToPersist.setCode(userDto.getCode());
			entityToPersist.setLastname(userDto.getLastname());
			entityToPersist.setName(userDto.getName());
			entityToPersist.setDni(userDto.getDni());
			
			
			
			
			userExist = userDao.save(entityToPersist);
			userDto = UserWrapper.entityToDto(userExist);
			return userDto;
		}
		
		
		return null;
	}

	@Override
	public UserDto findByCode(String code) {
		User user = userDao.findByCode(code);
		return UserWrapper.entityToDto(user);
	}
@Override
@Transactional
public void removeBycode(String code) {
	userDao.removeBycode(code);
}

	

}
