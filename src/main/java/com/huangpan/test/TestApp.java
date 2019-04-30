package com.huangpan.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huangpan.entity.User;
import com.huangpan.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestApp {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void t1() {
		User user = new User();
		user.setUsername("jack");
		user.setPassword("1234");
		userService.insert(user);
	}

}
