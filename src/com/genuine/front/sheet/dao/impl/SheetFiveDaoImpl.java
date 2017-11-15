package com.genuine.front.sheet.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.sheet.dao.SheetFiveDao;
import com.genuine.front.sheet.entity.TSheetfive;


public class SheetFiveDaoImpl extends BaseDaoImpl<TSheetfive> implements SheetFiveDao{

	public List<TSheetfive> findBySchoolIdToFive(Serializable id) {
		return getHibernateTemplate().find("FROM TSheetfive WHERE s_Id="+id);
	}

}
