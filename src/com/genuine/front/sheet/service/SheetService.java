package com.genuine.front.sheet.service;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;

public interface SheetService {
	
//	//导入表格
//	public String[][] importExcelOne(File sheetExcel);
	
//	public boolean saveSheetOne(Map<String,String> dataMap,String id);
	
	//导入表一
	public Map<String,String> importExcelOne(File sheetExcel);
	//导入表二
	public Map<String,String> importExcelTwo(File sheetExcel);
	//导入表三
	public Map<String,String> importExcelThree(File sheetExcel);
	//导入表四
	public Map<String,String> importExcelFour(File sheetExcel);
	//导入表五
	public Map<String,String> importExcelFive(File sheetExcel);
	//提交表一
	public void saveSheetOne(Map<String, String> dataMap, String schoolId);
    //提交表二
	public void saveSheetTwo(Map<String, String> dataMap, String schoolId);
	//提交表三
	public void saveSheetThree(Map<String, String> dataMap, String schoolId);
	//提交表四
	public void saveSheetFour(Map<String, String> dataMap, String schoolId);
	//提交表五
	public void saveSheetFive(Map<String, String> dataMap, String schoolId);
	//表一数据集合
	public List<TSheetone> listSheetOne();
	public List<TSheettwo> listSheetTwo();
	public List<TSheetfour> listSheetFour();
	public List<TSheetthree> listSheetThree();
	public List<TSheetfive> listSheetFive();
	
	//关于id的获取
	public List<TSheetone> findBySchoolIdToOne(Serializable id);
	public List<TSheettwo> findBySchoolIdToTwo(Serializable id);
	public List<TSheetthree> findBySchoolIdToThree(Serializable id);
	public List<TSheetfour> findBySchoolIdToFour(Serializable id);
	public List<TSheetfive> findBySchoolIdToFive(Serializable id);
}