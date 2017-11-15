package com.genuine.admin.user.service;

import java.util.List;

import com.genuine.admin.user.entity.Admin;

public interface AdminService {
	
	//µÇÂ¼
	public List<Admin> login(String account,String password);

}
