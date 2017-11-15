package com.genuine.admin.cleardb.dao;

import java.util.List;

import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;

public interface CleardbDao {

	public void clearOne(List<TSheetone> sheetOneList);
	public void clearTwo(List<TSheettwo> sheetTwoList);
	public void clearThree(List<TSheetthree> sheetThreeList);
	public void clearFour(List<TSheetfour> sheetFourList);
	public void clearFive(List<TSheetfive> sheetFiveList);
}
