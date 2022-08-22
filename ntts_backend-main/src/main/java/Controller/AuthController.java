spackage Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import DTO.ErrorResponseDto;
import DTO.ForgotPasswordRequestDto;
import DTO.SuccessResponseDto;
import Entity.UserEntity;
import Exception.ResourceNotFoundException;
import ServiceInterface.ForgotPasswordRequestInterface;
import ServiceInterface.UserServiceInterface;
import config.jwtTokenUtil;

@RestController
public class AuthController {
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@Autowired
	private ForgotPasswordRequestInterface forgotPasswordRequestInterface;
	@PostMapping("/forgot-pass")
	public ResponseEntity<?>forgotPass(@RequestBody ForgotPasswordRequestDto forgotPassBody,HttpServletRequest request)throws Exception{
try {
	
		UserEntity userEntity=userServiceInterface.findByEmail(forgotPassBody.getEmail());
		final String token=jwtTokenUtil.generateTokenOnForgotPass(userEntity.getEmail());
		forgotPasswordRequestInterface.createForgotPasswordRequest(userEntity.getId(),token);
		return new ResponseEntity<>(new SuccessResponseDto("Success","success",null),HttpStatus.ACCEPTED);
}
	catch(ResourceNotFoundException e) {
		return new ResponseEntity<>(new ErrorResponseDto(e.getMessage(),"UserNotFound"),HttpStatus.NOT_FOUND);
	}
		
//}catch(ResourceNotFoundException e) {
//	return new ResponseEntity<>(new ErrorResponseDto(e.getMessage(),"UserNotFound"),HttpStatus.NOT_FOUND);
		
		
		

	}
}
			
			
			
		
		


	
