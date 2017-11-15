package com.genuine.front.login.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.login.dao.SchoolDao;
import com.genuine.front.login.entity.School;

public class SchoolDaoImpl extends BaseDaoImpl<School> implements SchoolDao{

	public List<School> FindSchoolByAccountAndPassword(String account,String password) {
		
		Query query = getSession().createQuery("FROM School WHERE s_Name=? AND s_Password=?");
		
		query.setParameter(0, account);
		query.setParameter(1,password);
		
		return query.list();
	}

	public void updateSubmitById(String schoolId) {
		School school = findObjectById(schoolId);
		school.setS_Submit("1");
		getHibernateTemplate().update(school);
	}

}
