package com.genuine.admin.user.entity;

import java.io.Serializable;


public class Admin implements Serializable{
	
	//id
	private String s_Id;
	//学校名称
	private String s_Name;
	//初始密码
	private String s_Password;
	
	
	public String getS_Id() {
		return s_Id;
	}
	public void setS_Id(String s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_Name() {
		return s_Name;
	}
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}
	public String getS_Password() {
		return s_Password;
	}
	public void setS_Password(String s_Password) {
		this.s_Password = s_Password;
	}
}
