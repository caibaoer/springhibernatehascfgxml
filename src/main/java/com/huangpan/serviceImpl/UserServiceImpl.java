package com.huangpan.serviceImpl;

import com.huangpan.dao.UserDao;
import com.huangpan.entity.User;
import com.huangpan.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void insert(User user) {
		this.userDao.insert(user);
	}

}
