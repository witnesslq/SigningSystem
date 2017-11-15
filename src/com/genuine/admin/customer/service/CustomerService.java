package com.genuine.admin.customer.service;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.front.login.entity.School;

public interface CustomerService{

	//��ѯ
	public List<School> findObjects();
	//����id��ѯ����
	public School findObjectById(Serializable id);
	//�����û�����ѯ����
	public List<School> findObjectByAccount(String account);
	//ɾ��
	public void deleteObject(Serializable id);
	//����
	public void save(School school);
	//����
	public void updateObject(School school);
	//������߸���
	public void saveOrUpdate(School school);
	
	//��ҳ��ѯ����
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize);
}
