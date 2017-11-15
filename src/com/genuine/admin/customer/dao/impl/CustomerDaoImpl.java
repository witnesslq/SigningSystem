package com.genuine.admin.customer.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.genuine.admin.customer.dao.CustomerDao;
import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.login.entity.School;

public class CustomerDaoImpl extends BaseDaoImpl<School> implements CustomerDao{

	//根据用户名查询对象
	public List<School> FindObjectByAccount(String account) {
		
		Query query = getSession().createQuery("FROM School WHERE s_Name=?");
		query.setParameter(0, account);	
	    List<School> list = query.list();
	    return list;
	}
}
