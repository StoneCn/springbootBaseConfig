package com.stone.repository;

import org.springframework.data.repository.CrudRepository;

import com.stone.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	
}
