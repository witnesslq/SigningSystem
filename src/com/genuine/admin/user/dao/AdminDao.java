package com.genuine.admin.user.dao;

import java.util.List;

import com.genuine.admin.user.entity.Admin;
import com.genuine.core.dao.BaseDao;

public interface AdminDao extends BaseDao<Admin> {
	
	//�ʺ�����У��
	public List<Admin> FindAdminByAccountAndPassword(String account,String password);

}
