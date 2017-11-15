package com.genuine.front.sheet.dao;

import java.io.Serializable;
import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.sheet.entity.TSheetthree;


public interface SheetThreeDao extends BaseDao<TSheetthree>{

	List<TSheetthree> findBySchoolIdToThree(Serializable id);
	
}
