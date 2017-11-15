package com.genuine.core.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.genuine.core.dao.BaseDao;
import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
	
	Class<T> clazz;
	public BaseDaoImpl() {
		//参数化类型。SetOneDaoImpl<sheettwo>
		ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass(); 
		//从这些中获取到当前类sheettwo
		this.clazz = (Class<T>)pt.getActualTypeArguments()[0];
	}
	
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize) {
		/*======================条件查询======================*/
		Query query = getSession().createQuery(queryHelper.getListHql());
		List<Object> params = queryHelper.getParameters();
		if(params != null){
			for(int i=0; i<params.size(); i++){
				query.setParameter(i, params.get(i));
			}
		}
		/*======================条件查询======================*/
		/*====================分页条件查询====================*/
		if(pageNo<1) {  //设置默认页号
			pageNo = 1;
		}
		query.setFirstResult((pageNo-1)*pageSize);  //当前页数起始索引
		query.setMaxResults(pageSize);
		List items = query.list();     //当前也数据已经获取到
		/*总记录数totalCount的获取*/
		Query countQuery = getSession().createQuery(queryHelper.getCountHql());  //创建查询总记录数语句
		if(params != null){
			for(int i=0; i<params.size(); i++){
				countQuery.setParameter(i, params.get(i));
			}
		}
		long totalCount = (Long) countQuery.uniqueResult();
		/*====================分页条件查询====================*/
		return new PageResult(totalCount, pageNo, pageSize, items);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void save(T entity) {
		getHibernateTemplate().save(entity);
	}

	public T findObjectById(Serializable id) {
		return getHibernateTemplate().get(clazz, id);
	}

	public void update(T entity) {
		getHibernateTemplate().merge(entity);
	}

	public void saveOrUpdate(T entity) {
		getHibernateTemplate().saveOrUpdate(entity);
	}

	public List<T> findObjects() {
		return getHibernateTemplate().loadAll(clazz);
	}

	public void deleteObjectById(Serializable id) {
		getHibernateTemplate().delete(findObjectById(id));
	}

	public void updateObject(T entity) {
		getHibernateTemplate().update(entity);
	}

}
