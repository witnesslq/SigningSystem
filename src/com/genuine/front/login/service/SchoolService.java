package com.genuine.front.login.service;

import java.io.Serializable;
import java.util.List;

import com.genuine.front.login.entity.School;

public interface SchoolService {
	
	//登录业务逻辑
	public List<School> login(String account,String password);
	
	
	//根据id查找用户
	public School findObjectById(Serializable id);


	public void updateSubmitById(String schoolId);
}
