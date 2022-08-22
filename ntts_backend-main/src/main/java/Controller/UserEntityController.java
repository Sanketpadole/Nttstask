package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.UserEntity;
import ServiceInterface.UserServiceInterface;

@RestController
public class UserEntityController {
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@GetMapping
	public UserEntity userEntity(@RequestBody UserEntity userEntity) {
		return userServiceInterface.findByEmail(userEntity);
	}
	
	

}
