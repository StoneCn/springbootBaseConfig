package com.stone.service;

import com.stone.entity.User;

public interface IUserService {

	User getUserById(Long id);
	
	void saveUser(User user);

}
