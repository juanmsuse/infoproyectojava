package com.ProyectoFinal.app.restcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoFinal.app.dto.UserDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Turn;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.service.IEventService;
import com.ProyectoFinal.app.service.ITurnService;
import com.ProyectoFinal.app.service.IUserService;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired IUserService userService;
	@Autowired ITurnService TurnService;
	@Autowired IEventService eventService;

	@GetMapping("/allactive")
	public List<User>findAll(){
		return userService.findByAll();
	}
	
	//@PostMapping("/new")
	//public ResponseEntity <Map<String,Object>>newUser(@RequestBody @Valid UserDto userDto) throws Exception{
		//log.info("user"+userDto.toString());
		//Map<String,Object>response= new HashMap<>();
		//UserDto newUser = userService.save(userDto);
		//response.put("user", newUser);
		//return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK); 
		
	//}
	@PostMapping("/create")
    public ResponseEntity<Object> newturno(@RequestBody UserDto userDto) {
                                                             
        Turn turn = new Turn();
        
        Event event = eventService.findByid(userDto.getEvent().getId());
        turn.setEvent(event);
        turn.setOrganization(event.getOrganization());
 
        
        userDto.setTurn(turn);
        Map<String, Object> response = new HashMap<>();
        UserDto newUser = userService.save(userDto);
        response.put("user", newUser);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

	
	@PutMapping("/update")
	public ResponseEntity<Map<String, Object>> update(@RequestBody UserDto userDto){
		log.info("user: "+userDto.toString());
		Map<String, Object> response = new HashMap<>();
		UserDto updateUser = userService.save(userDto);
		
		if(updateUser == null) {
			response.put("mensaje", "No se pudo actualizar la informacion del usuario.");
		}
		
		response.put("user", updateUser);
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	@GetMapping("/user/{dni}")
	public ResponseEntity<HashMap<String, Object>> usuario(@PathVariable(value = "dni") Integer dni){
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<User> usuario = userService.findByDni(dni);
		response.put("usuario", usuario);
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);
	}

	@DeleteMapping("/{code}")
	public void removeOne(@PathVariable("code")String code) {
		userService.removeBycode(code);
	}
	@GetMapping("/find/{lastname}")
	public ResponseEntity<HashMap<String, Object>> usuario(@PathVariable(value = "lastname") String lastname){
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<User> usuario = userService.findByLastname(lastname);
		response.put("usuario", usuario);
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);

}
}
