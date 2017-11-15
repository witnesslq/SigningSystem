package com.genuine.core.dao;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;


public interface BaseDao<T> {

	//����
	public void save(T entity);
	//id����
	public T findObjectById(Serializable id);
	//��������
	public void update(T entity);
	//����
	public void updateObject(T entity);
	//������߸���
	public void saveOrUpdate(T entity);
	//��ѯ��������
	public List<T> findObjects();
	//ɾ�� id
	public void deleteObjectById(Serializable id);
	
	
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize);
}
