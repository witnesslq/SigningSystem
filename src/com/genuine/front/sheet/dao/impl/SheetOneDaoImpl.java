package com.genuine.front.sheet.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.sheet.dao.SheetOneDao;
import com.genuine.front.sheet.entity.TSheetone;


public class SheetOneDaoImpl extends BaseDaoImpl<TSheetone> implements SheetOneDao{

	public List<TSheetone> findBySchoolIdToOne(Serializable id) {
		return getHibernateTemplate().find("FROM TSheetone WHERE s_Id="+id);
	}

}
