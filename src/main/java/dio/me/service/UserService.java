package dio.me.service;

import java.util.List;

import dio.me.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	User create(User userToCreate);
	List<User> findAll();
}
