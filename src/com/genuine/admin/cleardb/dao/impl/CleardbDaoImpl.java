package com.genuine.admin.cleardb.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.genuine.admin.cleardb.dao.CleardbDao;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;

public class CleardbDaoImpl extends HibernateDaoSupport implements CleardbDao{

	public void clearOne(List<TSheetone> sheetOneList) {
		 for(int i=0; i<sheetOneList.size(); i++) {
		    	getSession().delete(sheetOneList.get(i));
		    }
	}

	public void clearTwo(List<TSheettwo> sheetTwoList) {
		 for(int i=0; i<sheetTwoList.size(); i++) {
		    	getSession().delete(sheetTwoList.get(i));
		    }
	}

	public void clearThree(List<TSheetthree> sheetThreeList) {
		 for(int i=0; i<sheetThreeList.size(); i++) {
		    	getSession().delete(sheetThreeList.get(i));
		    }
	}

	public void clearFour(List<TSheetfour> sheetFourList) {
		 for(int i=0; i<sheetFourList.size(); i++) {
		    	getSession().delete(sheetFourList.get(i));
		    }
	}

	public void clearFive(List<TSheetfive> sheetFiveList) {
		//É¾³ýÒ»¸ö
	    for(int i=0; i<sheetFiveList.size(); i++) {
	    	getSession().delete(sheetFiveList.get(i));
	    }
    }
}
