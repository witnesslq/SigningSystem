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
	
	
	//查询
	private String name;
	//分页查询
	private PageResult pageResult;
	private int pageNo;
	private int pageSize;
	//全选数组
	private String[] selectedRow;
	
	@Resource
	private CustomerService customerService;
	//列表	
	public String listUI() throws Exception{
		/** ===================加入分页===================*/
		QueryHelper queryHelper = new QueryHelper(School.class, "");
		//学校列表
		if(school != null) {
			//搜索的用户名是否为空
			if(StringUtils.isNotBlank(school.getS_Name())) {
				if(!"请输入学校名称".equals(school.getS_Name())) {
					queryHelper.addCondition("s_name like ?", "%" + school.getS_Name() + "%");
				}
			}
		}
		pageResult = customerService.getPageResult(queryHelper, getPageNo(), getPageSize());
		/** ===================加入分页===================*/
		return "listUI";
	}
	/*=========================删除功能======================*/
	//单个删除
	public String delete() {
		
		if(school != null) {
			customerService.deleteObject(school.getS_Id());
		}
		//刷新用户列表
		return "list";
	}
	//全部删除
	public String deleteAll() {
		//全选是否为空
		if(selectedRow != null) {
			for(String id : selectedRow) {
				customerService.deleteObject(id);
			}
		}
		return "list";
	}
	/*=========================删除功能======================*/
	
	/*=========================新增功能======================*/
	public String addUI() {
		return "addUI";
	}
	
	public String add(){
		
		if(school != null) {
			customerService.save(school);
		}
		return "list";
	}
//校验帐号唯一性
	public void verifyAccount(){
		try {
			//1、获取帐号
			if(school != null && StringUtils.isNotBlank(school.getS_Name())){
				String res = "true";
				//school.getS_Name(),转码
				String schoolName = new String(school.getS_Name().getBytes("iso-8859-1"),"utf-8");
				//2、根据帐号、id查询用户记录
				List<School> userList = customerService.findObjectByAccount(schoolName);
				if(userList != null && userList.size() > 0){//说明该帐号已经存在
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
	
	/*=========================新增功能======================*/
	/*=========================编辑功能======================*/
	public String editUI() {
		//查询完放到action中
		if(school != null) {
			//重新赋值放到action中
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
	/*=========================编辑功能======================*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
