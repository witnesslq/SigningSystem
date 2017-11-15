package com.genuine.admin.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.genuine.admin.user.dao.AdminDao;
import com.genuine.admin.user.entity.Admin;
import com.genuine.admin.user.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Resource
	private AdminDao adminDao;

	public List<Admin> login(String account, String password) {
		return adminDao.FindAdminByAccountAndPassword(account, password);
	}
	
	
}
