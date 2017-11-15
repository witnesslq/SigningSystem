package com.genuine.admin.user.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.genuine.admin.user.dao.AdminDao;
import com.genuine.admin.user.entity.Admin;
import com.genuine.core.dao.impl.BaseDaoImpl;

public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {

	public List<Admin> FindAdminByAccountAndPassword(String account,String password) {
		
		Query query = getSession().createQuery("FROM Admin WHERE s_Name=? AND s_Password=?");
		
		query.setParameter(0, account);
		query.setParameter(1,password);
		
		return query.list();
	}

}
