package com.genuine.admin.customer.dao;

import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.login.entity.School;

public interface CustomerDao extends BaseDao<School> {
 
	//�����û�����ѯ����
	public List<School> FindObjectByAccount(String account);
}
