package com.genuine.front.login.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.genuine.front.login.entity.School;
import com.genuine.front.login.service.SchoolService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolAction extends ActionSupport {

	private School school;
	private List<School> schoolList;
	private String loginResult;
	@Resource
	private SchoolService schoolService;
	
	//登录
	public String login() {
		//创建学校列表
		schoolList = new ArrayList<School>();
		//获取学校列表
		schoolList = schoolService.login(school.getS_Name(), school.getS_Password());
		//获取sessionMap
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		//判断并转发视图
		if(schoolList != null && schoolList.size() > 0){
			//设置返回结果msg
			loginResult = "victory";
			//登录成功，把对象放到session中
			sessionMap.put("school", schoolList.get(0));
			return "success";
		}
		loginResult = "defeat";
		return "error";
	}
	//注销
	public String logout() {
		//清空账户
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		sessionMap.remove("school");
		return "logout";
	}

	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}

	public String getLoginResult() {
		return loginResult;
	}

	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	
	

}
