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
		//���������͡�SetOneDaoImpl<sheettwo>
		ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass(); 
		//����Щ�л�ȡ����ǰ��sheettwo
		this.clazz = (Class<T>)pt.getActualTypeArguments()[0];
	}
	
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize) {
		/*======================������ѯ======================*/
		Query query = getSession().createQuery(queryHelper.getListHql());
		List<Object> params = queryHelper.getParameters();
		if(params != null){
			for(int i=0; i<params.size(); i++){
				query.setParameter(i, params.get(i));
			}
		}
		/*======================������ѯ======================*/
		/*====================��ҳ������ѯ====================*/
		if(pageNo<1) {  //����Ĭ��ҳ��
			pageNo = 1;
		}
		query.setFirstResult((pageNo-1)*pageSize);  //��ǰҳ����ʼ����
		query.setMaxResults(pageSize);
		List items = query.list();     //��ǰҲ�����Ѿ���ȡ��
		/*�ܼ�¼��totalCount�Ļ�ȡ*/
		Query countQuery = getSession().createQuery(queryHelper.getCountHql());  //������ѯ�ܼ�¼�����
		if(params != null){
			for(int i=0; i<params.size(); i++){
				countQuery.setParameter(i, params.get(i));
			}
		}
		long totalCount = (Long) countQuery.uniqueResult();
		/*====================��ҳ������ѯ====================*/
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
