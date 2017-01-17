package com.stone.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stone.ApplicationStart;
import com.stone.entity.User;
import com.stone.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class UserServiceTest {
	
	@Autowired
	private IUserService userServiceImpl;
	@Test
	public void testGetUserById() {
		Long id = 1l;
		User user = userServiceImpl.getUserById(id);
		System.out.println(user);
	}
	
	@Test
	public void testSaveUser(){
		User user = new User();
		user.setName("ads");
		user.setUserAddress("asfdljs");
		userServiceImpl.saveUser(user);
	}

}
