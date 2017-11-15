package com.genuine.admin.cleardb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.genuine.admin.cleardb.dao.CleardbDao;
import com.genuine.admin.cleardb.service.CleardbService;
import com.genuine.front.sheet.dao.SheetFiveDao;
import com.genuine.front.sheet.dao.SheetFourDao;
import com.genuine.front.sheet.dao.SheetOneDao;
import com.genuine.front.sheet.dao.SheetThreeDao;
import com.genuine.front.sheet.dao.SheetTwoDao;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;

@Service("cleardbService")
public class CleardbServiceImpl implements CleardbService {

	@Resource
	private SheetOneDao sheetOneDao;
	@Resource
	private SheetTwoDao sheetTwoDao;
	@Resource
	private SheetThreeDao sheetThreeDao;
	@Resource
	private SheetFourDao sheetFourDao;
	@Resource
	private SheetFiveDao sheetFiveDao;
	@Resource
	private CleardbDao cleardbDao;
	
	public void clearOne() {
		List<TSheetone> sheetOneList = sheetOneDao.findObjects();
		cleardbDao.clearOne(sheetOneList);
	}

	public void clearTwo() {
		List<TSheettwo> sheetTwoList = sheetTwoDao.findObjects();
		cleardbDao.clearTwo(sheetTwoList);
	}

	public void clearThree() {
		List<TSheetthree> sheetThreeList = sheetThreeDao.findObjects();
		cleardbDao.clearThree(sheetThreeList);
	}

	public void clearFour() {
		List<TSheetfour> sheetFourList = sheetFourDao.findObjects();
		cleardbDao.clearFour(sheetFourList);
	}
    public void clearFive() {
		List<TSheetfive> sheetFiveList = sheetFiveDao.findObjects();
		cleardbDao.clearFive(sheetFiveList);
	}

}
