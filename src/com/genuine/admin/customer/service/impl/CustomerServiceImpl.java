package com.genuine.admin.customer.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.genuine.admin.customer.dao.CustomerDao;
import com.genuine.admin.customer.service.CustomerService;
import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.front.login.entity.School;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Resource
	private CustomerDao customerDao;
	
	
	public List<School> findObjects() {
		return customerDao.findObjects();
	}


	public void deleteObject(Serializable id) {
		customerDao.deleteObjectById(id);
	}


	public void save(School school) {
		customerDao.save(school);
	}


	public School findObjectById(Serializable id) {
		return customerDao.findObjectById(id);
	}


	public void updateObject(School school) {
		customerDao.updateObject(school);
	}


	public void saveOrUpdate(School school) {
		customerDao.saveOrUpdate(school);
	}


	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,
			int pageSize) {
		return customerDao.getPageResult(queryHelper, pageNo, pageSize);
	}


	public List<School> findObjectByAccount(String account) {
		return customerDao.FindObjectByAccount(account);
	}

}
