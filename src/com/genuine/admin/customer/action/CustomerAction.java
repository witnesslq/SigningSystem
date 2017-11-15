package com.genuine.admin.customer.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.genuine.admin.customer.service.CustomerService;
import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.front.login.entity.School;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport{
	
	private List<School> schoolList;
	private School school;
	
	
	//��ѯ
	private String name;
	//��ҳ��ѯ
	private PageResult pageResult;
	private int pageNo;
	private int pageSize;
	//ȫѡ����
	private String[] selectedRow;
	
	@Resource
	private CustomerService customerService;
	//�б�	
	public String listUI() throws Exception{
		/** ===================�����ҳ===================*/
		QueryHelper queryHelper = new QueryHelper(School.class, "");
		//ѧУ�б�
		if(school != null) {
			//�������û����Ƿ�Ϊ��
			if(StringUtils.isNotBlank(school.getS_Name())) {
				if(!"������ѧУ����".equals(school.getS_Name())) {
					queryHelper.addCondition("s_name like ?", "%" + school.getS_Name() + "%");
				}
			}
		}
		pageResult = customerService.getPageResult(queryHelper, getPageNo(), getPageSize());
		/** ===================�����ҳ===================*/
		return "listUI";
	}
	/*=========================ɾ������======================*/
	//����ɾ��
	public String delete() {
		
		if(school != null) {
			customerService.deleteObject(school.getS_Id());
		}
		//ˢ���û��б�
		return "list";
	}
	//ȫ��ɾ��
	public String deleteAll() {
		//ȫѡ�Ƿ�Ϊ��
		if(selectedRow != null) {
			for(String id : selectedRow) {
				customerService.deleteObject(id);
			}
		}
		return "list";
	}
	/*=========================ɾ������======================*/
	
	/*=========================��������======================*/
	public String addUI() {
		return "addUI";
	}
	
	public String add(){
		
		if(school != null) {
			customerService.save(school);
		}
		return "list";
	}
//У���ʺ�Ψһ��
	public void verifyAccount(){
		try {
			//1����ȡ�ʺ�
			if(school != null && StringUtils.isNotBlank(school.getS_Name())){
				String res = "true";
				//school.getS_Name(),ת��
				String schoolName = new String(school.getS_Name().getBytes("iso-8859-1"),"utf-8");
				//2�������ʺš�id��ѯ�û���¼
				List<School> userList = customerService.findObjectByAccount(schoolName);
				if(userList != null && userList.size() > 0){//˵�����ʺ��Ѿ�����
					res = "false";
				}
				HttpServletResponse response = ServletActionContext.getResponse();
				response.setContentType("text/html;charset=utf-8");
				ServletOutputStream outputStream = response.getOutputStream();
				outputStream.write(res.getBytes());
				outputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*=========================��������======================*/
	/*=========================�༭����======================*/
	public String editUI() {
		//��ѯ��ŵ�action��
		if(school != null) {
			//���¸�ֵ�ŵ�action��
			school = customerService.findObjectById(school.getS_Id());
		}
		return "editUI";
	}
	public String edit() {
		if(school != null) {
			customerService.updateObject(school);
		}
		return "list";
	}
	/*=========================�༭����======================*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String[] getSelectedRow() {
		return selectedRow;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		if(pageSize<1) pageSize = 9;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public PageResult getPageResult() {
		return pageResult;
	}
	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}
	public void setSelectedRow(String[] selectedRow) {
		this.selectedRow = selectedRow;
	}
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public List<School> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(List<School> schoolList) {
		this.schoolList = schoolList;
	}
	
}
