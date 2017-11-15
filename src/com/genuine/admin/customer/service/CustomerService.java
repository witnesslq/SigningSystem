package com.genuine.admin.customer.service;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.front.login.entity.School;

public interface CustomerService{

	//查询
	public List<School> findObjects();
	//根据id查询对象
	public School findObjectById(Serializable id);
	//根据用户名查询对象
	public List<School> findObjectByAccount(String account);
	//删除
	public void deleteObject(Serializable id);
	//保存
	public void save(School school);
	//更新
	public void updateObject(School school);
	//保存或者更新
	public void saveOrUpdate(School school);
	
	//分页查询助手
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize);
}
