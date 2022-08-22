package Entity;

import javax.persistence.Entity;

@Entity
public class UserEntity {
	private Integer Id;
	public UserEntity(Integer id, String email) {
		super();
		Id = id;
		Email = email;
	}



	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	private String Email;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public UserEntity(String email) {
		super();
		Email = email;
	}

	public UserEntity() {
		super();
		
	}



	

}
