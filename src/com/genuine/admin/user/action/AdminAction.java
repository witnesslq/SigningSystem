package com.genuine.admin.user.action;

import javax.annotation.Resource;

import com.genuine.admin.user.entity.Admin;
import com.genuine.admin.user.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {
	
	private Admin admin;
	private String loginResult;
	
	@Resource
	private AdminService adminService;
	//��¼
	public String login() {
		if(adminService.login(admin.getS_Name(), admin.getS_Password()) != null&&adminService.login(admin.getS_Name(), admin.getS_Password()).size()>0) {
			//���÷��ؽ��msg
			loginResult = "victory";
			return "success";
		}else{
			loginResult = "defeat";
			return "error";
		}
	}
	//ע��
	public String logout() {
		return "logout";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
