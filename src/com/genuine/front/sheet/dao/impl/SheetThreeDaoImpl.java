package com.genuine.front.sheet.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.sheet.dao.SheetThreeDao;
import com.genuine.front.sheet.dao.SheetTwoDao;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;


public class SheetThreeDaoImpl extends BaseDaoImpl<TSheetthree> implements SheetThreeDao{

	public List<TSheetthree> findBySchoolIdToThree(Serializable id) {
		return getHibernateTemplate().find("FROM TSheetthree WHERE s_Id="+id);
	}

}
