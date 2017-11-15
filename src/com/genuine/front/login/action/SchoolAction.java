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
	
	//��¼
	public String login() {
		//����ѧУ�б�
		schoolList = new ArrayList<School>();
		//��ȡѧУ�б�
		schoolList = schoolService.login(school.getS_Name(), school.getS_Password());
		//��ȡsessionMap
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		//�жϲ�ת����ͼ
		if(schoolList != null && schoolList.size() > 0){
			//���÷��ؽ��msg
			loginResult = "victory";
			//��¼�ɹ����Ѷ���ŵ�session��
			sessionMap.put("school", schoolList.get(0));
			return "success";
		}
		loginResult = "defeat";
		return "error";
	}
	//ע��
	public String logout() {
		//����˻�
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
