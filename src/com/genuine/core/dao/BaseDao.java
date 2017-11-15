package com.genuine.core.dao;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;


public interface BaseDao<T> {

	//保存
	public void save(T entity);
	//id查找
	public T findObjectById(Serializable id);
	//批量更新
	public void update(T entity);
	//更新
	public void updateObject(T entity);
	//保存或者更新
	public void saveOrUpdate(T entity);
	//查询所有数据
	public List<T> findObjects();
	//删除 id
	public void deleteObjectById(Serializable id);
	
	
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize);
}
