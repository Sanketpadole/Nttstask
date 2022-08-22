package ServiceInterface;

import org.springframework.stereotype.Service;

import Entity.UserEntity;

@Service
public interface UserServiceInterface {

	UserEntity findByEmail(UserEntity userEntity);

	UserEntity findByEmail(String email);

}
