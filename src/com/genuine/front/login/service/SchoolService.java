package com.genuine.front.login.service;

import java.io.Serializable;
import java.util.List;

import com.genuine.front.login.entity.School;

public interface SchoolService {
	
	//��¼ҵ���߼�
	public List<School> login(String account,String password);
	
	
	//����id�����û�
	public School findObjectById(Serializable id);


	public void updateSubmitById(String schoolId);
}
