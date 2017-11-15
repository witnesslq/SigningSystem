package com.genuine.front.sheet.dao;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.sheet.entity.TSheetone;


public interface SheetOneDao extends BaseDao<TSheetone>{

	List<TSheetone> findBySchoolIdToOne(Serializable id);
	
}
