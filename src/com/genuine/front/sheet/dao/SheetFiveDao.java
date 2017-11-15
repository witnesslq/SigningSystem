package com.genuine.front.sheet.dao;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.sheet.entity.TSheetfive;


public interface SheetFiveDao extends BaseDao<TSheetfive>{

	List<TSheetfive> findBySchoolIdToFive(Serializable id);
	
}
