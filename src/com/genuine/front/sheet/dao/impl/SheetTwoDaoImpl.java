package com.genuine.front.sheet.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.sheet.dao.SheetTwoDao;
import com.genuine.front.sheet.entity.TSheettwo;


public class SheetTwoDaoImpl extends BaseDaoImpl<TSheettwo> implements SheetTwoDao{

	public List<TSheettwo> findBySchoolIdToTwo(Serializable id) {
		return getHibernateTemplate().find("FROM TSheettwo WHERE s_Id="+id);
	}
	
	
}
