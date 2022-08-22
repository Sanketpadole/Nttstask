package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.UserEntity;
@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Integer>{

}
