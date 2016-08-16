package com.portal.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.portal.model.UserBean;

@Component
public class LoginDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean validateUser(UserBean bean){
		Query query = sessionFactory.getCurrentSession().createQuery("from UserBean where userID=? and password=?");
		query.setString(0, bean.getUserID());
		query.setString(1, bean.getPassword());
		Object o = query.uniqueResult();
		return o==null?false:true;
	}
	
}
