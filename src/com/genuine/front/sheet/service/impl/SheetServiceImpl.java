package com.genuine.front.sheet.service.impl;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.genuine.core.utils.ExcelUtil;
import com.genuine.front.sheet.dao.SheetFiveDao;
import com.genuine.front.sheet.dao.SheetFourDao;
import com.genuine.front.sheet.dao.SheetOneDao;
import com.genuine.front.sheet.dao.SheetThreeDao;
import com.genuine.front.sheet.dao.SheetTwoDao;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfiveId;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetfourId;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetoneId;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheetthreeId;
import com.genuine.front.sheet.entity.TSheettwo;
import com.genuine.front.sheet.entity.TSheettwoId;
import com.genuine.front.sheet.service.SheetService;

@Service("SheetService")
public class SheetServiceImpl implements SheetService{
	
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
	//上传表一数据
	public Map<String, String> importExcelOne(File sheetExcel) {
		return ExcelUtil.importExcelOneData(sheetExcel);
	}
	//上传表二数据

	public Map<String, String> importExcelTwo(File sheetExcel) {
		return ExcelUtil.importExcelTwoData(sheetExcel);
	}

   //上传表三数据 
	public Map<String, String> importExcelThree(File sheetExcel) {
		return ExcelUtil.importExcelThreeData(sheetExcel);
	}
   //上传表四数据
	public Map<String, String> importExcelFour(File sheetExcel) {
 		return ExcelUtil.importExcelFourData(sheetExcel);
	}
   //上传表五数据
	public Map<String, String> importExcelFive(File sheetExcel) {
 		return ExcelUtil.importExcelFiveData(sheetExcel);
	}
	
	//保存表一数据
	public void saveSheetOne(Map<String,String> dataMap,String schoolId){
		TSheetoneId id = null;
		TSheetone sheetOne = null;
		//解析dataMap数据
		for(int i=1; i<=13; i++) {
			//关于联合主键的设置
			id = new TSheetoneId();
			id.setRowId(i);
			id.setSId(schoolId);
			sheetOne = new TSheetone();
			sheetOne.setId(id);
			
			//Map集合的封装
			if(StringUtils.isNotBlank(dataMap.get("01"+i))) {
				sheetOne.setAmount(Integer.parseInt(dataMap.get("01"+i)));
			}
			if(StringUtils.isNotBlank(dataMap.get("02"+i))) {
				sheetOne.setSBk(Integer.parseInt(dataMap.get("02"+i)));
			}
			if(StringUtils.isNotBlank(dataMap.get("03"+i))) {
				sheetOne.setSZk(Integer.parseInt(dataMap.get("03"+i)));
			}
			if(StringUtils.isNotBlank(dataMap.get("04"+i))) {
				sheetOne.setSMb(Integer.parseInt(dataMap.get("04"+i)));
			}
			//保存到数据库
			if(sheetOneDao.findObjectById(id) != null) {
				sheetOneDao.update(sheetOne);
			}else{
				sheetOneDao.save(sheetOne);
			}
		}
	}

	//保存表二数据
	public void saveSheetTwo(Map<String, String> dataMap, String schoolId) {
		TSheettwoId id = null;
		TSheettwo sheetTwo = null;
		//解析dataMap数据
		for(int i=1; i<=19; i++) {
			//关于联合主键的设置
			id = new TSheettwoId();
			id.setRowId(i);
			id.setSId(schoolId);
			sheetTwo = new TSheettwo();
			sheetTwo.setId(id);
			
			//封装Map集合的数据
//表二提交状态bug****************************************************************
			for(int j=4; j<=6; j++) {
				if(StringUtils.isNotBlank(dataMap.get("0"+j+"1"))){
					sheetTwo.setSchoolState((j-4)+"");
				}
			}
//表二提交状态bug****************************************************************
			//总计
			if(!" ".equals(dataMap.get("01"+i)) && !"".equals(dataMap.get("01"+i))){
				sheetTwo.setAmount(Double.parseDouble(dataMap.get("01"+i)));
			}
			//少数民族
			if(!" ".equals(dataMap.get("02"+i)) && !"".equals(dataMap.get("02"+i))){
				sheetTwo.setFewSum(Double.parseDouble(dataMap.get("02"+i)));
			}
			//少女数量
			if(!" ".equals(dataMap.get("03"+i)) && !"".equals(dataMap.get("03"+i))){
				//错误
				sheetTwo.setGrilSum(Double.parseDouble(dataMap.get("03"+i)));
			}
			
			//保存到数据库
			if(sheetTwoDao.findObjectById(id) != null) {
				sheetTwoDao.update(sheetTwo);
			}else{
				sheetTwoDao.save(sheetTwo);
			}
		}
	}
	//保存表三数据
	public void saveSheetThree(Map<String, String> dataMap, String schoolId) {
		TSheetthreeId id = null;
		TSheetthree sheetThree = null;
		boolean flag = true;
		//解析dataMap数据
		for(int i=1; i<=11; i++) {
			sheetThree = new TSheetthree();
			//先保存id
			id = new TSheetthreeId();
			id.setRowId(i);
			id.setSId(schoolId);
			sheetThree.setId(id);
			//在保存map数据，先排前六条数据
			if(!" ".equals(dataMap.get("001"+i)) && !"".equals(dataMap.get("001"+i))) {
				sheetThree.setAmount(Float.parseFloat(dataMap.get("001"+i)));
			}
			if(!" ".equals(dataMap.get("002"+i)) && !"".equals(dataMap.get("002"+i))) {
				sheetThree.setFewSum(Float.parseFloat(dataMap.get("002"+i)));
			}
			if(!" ".equals(dataMap.get("003"+i)) && !"".equals(dataMap.get("003"+i))) {
				sheetThree.setWomanSum(Float.parseFloat(dataMap.get("003"+i)));
			}
			if(!" ".equals(dataMap.get("004"+i)) && !"".equals(dataMap.get("004"+i))) {
				sheetThree.setXjSum(Float.parseFloat(dataMap.get("004"+i)));
			}
			if(!" ".equals(dataMap.get("005"+i)) && !"".equals(dataMap.get("005"+i))) {
				sheetThree.setBsSum(Float.parseFloat(dataMap.get("005"+i)));
			}
			if(!" ".equals(dataMap.get("006"+i)) && !"".equals(dataMap.get("006"+i))) {
				sheetThree.setSsSum(Float.parseFloat(dataMap.get("006"+i)));
			}
			//判断状态
//表三schoolstate提交bug********************************************************
			if(StringUtils.isNotBlank(dataMap.get("0071"))||
			   StringUtils.isNotBlank(dataMap.get("0081"))||
			   StringUtils.isNotBlank(dataMap.get("0091"))	
					) {
				sheetThree.setSchoolState("0");
			}else{
				flag = false;
				sheetThree.setSchoolState("1");
			}
//表三schoolstate提交bug********************************************************
			//后几条数据的封装问题
			if(flag) {
				if(!" ".equals(dataMap.get("007"+i)) && !"".equals(dataMap.get("007"+i))) {
					sheetThree.setSxjSum(Float.parseFloat(dataMap.get("007"+i)));
				}
				if(!" ".equals(dataMap.get("008"+i)) && !"".equals(dataMap.get("008"+i))) {
					sheetThree.setSbkSum(Float.parseFloat(dataMap.get("008"+i)));
				}
				if(!" ".equals(dataMap.get("009"+i)) && !"".equals(dataMap.get("009"+i))) {
					sheetThree.setSzkSum(Float.parseFloat(dataMap.get("009"+i)));
				}
			}else{
				if(!" ".equals(dataMap.get("010"+i)) && !"".equals(dataMap.get("010"+i))) {
					sheetThree.setSxjSum(Float.parseFloat(dataMap.get("010"+i)));
				}
				if(!" ".equals(dataMap.get("011"+i)) && !"".equals(dataMap.get("011"+i))) {
					sheetThree.setSbkSum(Float.parseFloat(dataMap.get("011"+i)));
				}
				if(!" ".equals(dataMap.get("012"+i)) && !"".equals(dataMap.get("012"+i))) {
					sheetThree.setSzkSum(Float.parseFloat(dataMap.get("012"+i)));
				}
			}
			//保存到数据库
			if(sheetThreeDao.findObjectById(id) != null) {
				sheetThreeDao.update(sheetThree);
			}else{
				sheetThreeDao.save(sheetThree);
			}
		}
	}
	//保存表四数据
	public void saveSheetFour(Map<String, String> dataMap, String schoolId) {
		TSheetfourId id = null;
		TSheetfour sheetFour = null;
		
		for(int i=1; i<=12; i++) {
			//先设置id
			id = new TSheetfourId();
			id.setRowId(i);
			id.setSId(schoolId);
		
			//直接设置map
			sheetFour = new TSheetfour();
			sheetFour.setId(id);
			if(!"".equals(dataMap.get("01"+i)) && !" ".equals(dataMap.get("01"+i))) {
				sheetFour.setAmount(Integer.parseInt(dataMap.get("01"+i)));
			}
			if(!"".equals(dataMap.get("02"+i)) && !" ".equals(dataMap.get("02"+i))) {
				sheetFour.setRelation(Integer.parseInt(dataMap.get("02"+i)));
			}
			if(!"".equals(dataMap.get("03"+i)) && !" ".equals(dataMap.get("03"+i))) {
				sheetFour.setRetire(Integer.parseInt(dataMap.get("03"+i)));
			}
			if(!"".equals(dataMap.get("04"+i)) && !" ".equals(dataMap.get("04"+i))) {
				sheetFour.setGraduate(Integer.parseInt(dataMap.get("04"+i)));
			}
			if(!"".equals(dataMap.get("05"+i)) && !" ".equals(dataMap.get("05"+i))) {
				sheetFour.setOther(Integer.parseInt(dataMap.get("05"+i)));
			}
			//保存到数据库
			if(sheetFourDao.findObjectById(id) != null) {
				sheetFourDao.update(sheetFour);
			}else{
				sheetFourDao.save(sheetFour);
			}
		}
	}
	
	//保存表五数据
		public void saveSheetFive(Map<String, String> dataMap, String schoolId) {
			TSheetfiveId id = null;
			TSheetfive sheetFive = null;
			
			for(int i=1; i<=7; i++) {
				//先设置id
				id = new TSheetfiveId();
				id.setRowId(i);
				id.setSId(schoolId);
			
				//直接设置map
				sheetFive = new TSheetfive();
				sheetFive.setId(id);
				if(!"".equals(dataMap.get("01"+i)) && !" ".equals(dataMap.get("01"+i))) {
					sheetFive.setSum(Integer.parseInt(dataMap.get("01"+i)));
				}
				if(!"".equals(dataMap.get("02"+i)) && !" ".equals(dataMap.get("02"+i))) {
					sheetFive.setEmp(Integer.parseInt(dataMap.get("02"+i)));
				}
				if(!"".equals(dataMap.get("03"+i)) && !" ".equals(dataMap.get("03"+i))) {
					sheetFive.setRetire(Integer.parseInt(dataMap.get("03"+i)));
				}
				if(!"".equals(dataMap.get("04"+i)) && !" ".equals(dataMap.get("04"+i))) {
					sheetFive.setGraduate(Integer.parseInt(dataMap.get("04"+i)));
				}
				if(!"".equals(dataMap.get("05"+i)) && !" ".equals(dataMap.get("05"+i))) {
					sheetFive.setOther(Integer.parseInt(dataMap.get("05"+i)));
				}
				//保存到数据库
				if(sheetFiveDao.findObjectById(id) != null) {
					sheetFiveDao.update(sheetFive);
				}else{
					sheetFiveDao.save(sheetFive);
				}
			}
		}
	public List<TSheetone> listSheetOne() {
		return sheetOneDao.findObjects();
	}
	public List<TSheettwo> listSheetTwo() {
		return sheetTwoDao.findObjects();
	}
	public List<TSheetfour> listSheetFour() {
		return sheetFourDao.findObjects();
	}
	public List<TSheetthree> listSheetThree() {
		return sheetThreeDao.findObjects();
	}
	public List<TSheetfive> listSheetFive() {
		return sheetFiveDao.findObjects();
	}
	public List<TSheetone> findBySchoolIdToOne(Serializable id) {
		return sheetOneDao.findBySchoolIdToOne(id);
	}
	public List<TSheettwo> findBySchoolIdToTwo(Serializable id) {
		return sheetTwoDao.findBySchoolIdToTwo(id);
	}
	public List<TSheetthree> findBySchoolIdToThree(Serializable id) {
		return sheetThreeDao.findBySchoolIdToThree(id);
	}
	public List<TSheetfour> findBySchoolIdToFour(Serializable id) {
		return sheetFourDao.findBySchoolIdToFour(id);
	}
	public List<TSheetfive> findBySchoolIdToFive(Serializable id) {
		return sheetFiveDao.findBySchoolIdToFive(id);
	}



	

	
}
