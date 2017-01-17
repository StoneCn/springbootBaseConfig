package com.stone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.entity.User;
import com.stone.repository.UserRepository;
import com.stone.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(Long id) {
		return userRepository.findOne(id);
	}
	
	public void saveUser(User user){
		userRepository.save(user);
	}

}
