package com.genuine.front.login.dao;

import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.login.entity.School;


public interface SchoolDao extends BaseDao<School>{
	
	public List<School> FindSchoolByAccountAndPassword(String account,String password);

	public void updateSubmitById(String schoolId);

}
