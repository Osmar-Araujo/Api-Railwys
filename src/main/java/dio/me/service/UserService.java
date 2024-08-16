package dio.me.service;

import dio.me.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	User create(User userToCreate);

}
