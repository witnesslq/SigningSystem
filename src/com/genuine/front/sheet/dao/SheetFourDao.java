package com.genuine.front.sheet.dao;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.sheet.entity.TSheetfour;


public interface SheetFourDao extends BaseDao<TSheetfour>{

	List<TSheetfour> findBySchoolIdToFour(Serializable id);
	
}
