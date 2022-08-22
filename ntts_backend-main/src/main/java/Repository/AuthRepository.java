package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.UserEntity;

public interface AuthRepository extends JpaRepository<UserEntity,Integer> {

}
