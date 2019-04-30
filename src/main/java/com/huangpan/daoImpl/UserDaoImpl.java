package com.huangpan.daoImpl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.huangpan.dao.UserDao;
import com.huangpan.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate  hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void insert(User user) {
		this.hibernateTemplate.save(user);

	}

}
