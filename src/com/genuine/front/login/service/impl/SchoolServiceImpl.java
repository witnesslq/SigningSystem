package com.genuine.front.login.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.genuine.front.login.dao.SchoolDao;
import com.genuine.front.login.entity.School;
import com.genuine.front.login.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService{

	@Resource
	private SchoolDao schoolDao;
	
	public List<School> login(String account, String password) {
		return schoolDao.FindSchoolByAccountAndPassword(account, password);
	}

	public School findObjectById(Serializable id) {
		return schoolDao.findObjectById(id);
	}

	public void updateSubmitById(String schoolId) {
		schoolDao.updateSubmitById(schoolId);
	}
	
	
}
