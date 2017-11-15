package com.genuine.front.sheet.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.sheet.dao.SheetFourDao;
import com.genuine.front.sheet.entity.TSheetfour;


public class SheetFourDaoImpl extends BaseDaoImpl<TSheetfour> implements SheetFourDao{

	public List<TSheetfour> findBySchoolIdToFour(Serializable id) {
		return getHibernateTemplate().find("FROM TSheetfour WHERE s_Id="+id);
	}

}
