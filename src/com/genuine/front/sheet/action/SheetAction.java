package com.genuine.front.sheet.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.genuine.front.login.entity.School;
import com.genuine.front.login.service.SchoolService;
import com.genuine.front.sheet.service.SheetService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SheetAction extends ActionSupport{
	
	//注入service
	@Resource
	private SheetService sheetService;
	@Resource
	private SchoolService schoolService;
	//文件地址
	private String filePath;
	private String fileName;
	
	//文件上传需要的三要素
	private File sheetExcel;
	private String sheetExcelFileName;
	private String sheetExcelContentType;
	
	//用于维护数据
	Map<String,String> dataMap = new HashMap<String,String>();
	//跳转视图
	public String sheetOne() throws Exception {
		fileName="sheetOne.xls";
		return "sheetOne";
	}
	public String sheetTwo() throws Exception {
		fileName="sheetTwo.xls";
		return "sheetTwo";
	}
	public String sheetThree() throws Exception {
		fileName="sheetThree.xls";
		return "sheetThree";
	}
	public String sheetFour() throws Exception {
		fileName="sheetFour.xls";
		return "sheetFour";
	}
	public String sheetFive() throws Exception {
		fileName="sheetFive.xls";
		return "sheetFive";
	}
	//输入流:文件下载关键点！！！
	public InputStream getInputStream() {
		FileInputStream fis;
		//所有表的服务器地址
		filePath = ServletActionContext.getServletContext().getRealPath("upload/");
		try {
			fis = new FileInputStream(new File(filePath+"/"+fileName));
			return fis;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	//文件上传
	public String importOneExcel(){
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//调用业务逻辑
				dataMap = sheetService.importExcelOne(sheetExcel);
			}
		}
		//转发视图
		return "importOneExcel";
	}
	//文件上传
	public String importTwoExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//调用业务逻辑
				dataMap = sheetService.importExcelTwo(sheetExcel);
			}
		}
		//转发视图
		return "importTwoExcel";
	}
	//文件上传表三
	public String importThreeExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//调用业务逻辑
				dataMap = sheetService.importExcelThree(sheetExcel);
			}
		}
		//转发视图
		return "importThreeExcel";
	}
	//文件上传表四
	public String importFourExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//调用业务逻辑
				dataMap = sheetService.importExcelFour(sheetExcel);
			}
		}
		//转发视图
		return "importFourExcel";
	}
	//文件上传表五
	public String importFiveExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//调用业务逻辑
				dataMap = sheetService.importExcelFive(sheetExcel);
			}
		}
		//转发视图
		return "importFiveExcel";
	}
	
	public String doSubmitOne() {
		
		//获取当前用户id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		
		if(dataMap != null) {
			//判断登录账户是否为空
			if(schoolId != null) {
				//对数据Map进行保存到数据库操作
				sheetService.saveSheetOne(dataMap,schoolId);
				
			}
		}
		//对学校签到状态统计
		if((sheetService.findBySchoolIdToTwo(schoolId).size()>0 && sheetService.findBySchoolIdToTwo(schoolId) != null)
				&&(sheetService.findBySchoolIdToThree(schoolId).size()>0 && sheetService.findBySchoolIdToThree(schoolId) != null)
				&&(sheetService.findBySchoolIdToFour(schoolId).size()>0 && sheetService.findBySchoolIdToFour(schoolId) != null)
				&&(sheetService.findBySchoolIdToFive(schoolId).size()>0 && sheetService.findBySchoolIdToFive(schoolId) != null)
				) {
			schoolService.updateSubmitById(schoolId);
		}
		return "doSubmitOne";
	}
	public String doSubmitTwo() {
		
		//获取当前用户id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//判断登录账户是否为空
			if(schoolId != null) {
				//对数据Map进行保存到数据库操作
				sheetService.saveSheetTwo(dataMap,schoolId);
			}
		}
		//对学校签到状态统计
		if((sheetService.findBySchoolIdToOne(schoolId).size()>0 && sheetService.findBySchoolIdToOne(schoolId) != null)
				&&(sheetService.findBySchoolIdToThree(schoolId).size()>0 && sheetService.findBySchoolIdToThree(schoolId) != null)
				&&(sheetService.findBySchoolIdToFour(schoolId).size()>0 && sheetService.findBySchoolIdToFour(schoolId) != null)
				&&(sheetService.findBySchoolIdToFive(schoolId).size()>0 && sheetService.findBySchoolIdToFive(schoolId) != null)
				) {
			schoolService.updateSubmitById(schoolId);
		}
		return "doSubmitTwo";
	}
	public String doSubmitThree() {
		
		//获取当前用户id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//判断登录账户是否为空
			if(schoolId != null) {
				//对数据Map进行保存到数据库操作
				sheetService.saveSheetThree(dataMap, schoolId);
			}
		}
		//对学校签到状态统计
		if((sheetService.findBySchoolIdToOne(schoolId).size()>0 && sheetService.findBySchoolIdToOne(schoolId) != null)
				&&(sheetService.findBySchoolIdToTwo(schoolId).size()>0 && sheetService.findBySchoolIdToTwo(schoolId) != null)
				&&(sheetService.findBySchoolIdToFour(schoolId).size()>0 && sheetService.findBySchoolIdToFour(schoolId) != null)
				&&(sheetService.findBySchoolIdToFive(schoolId).size()>0 && sheetService.findBySchoolIdToFive(schoolId) != null)
				) {
			schoolService.updateSubmitById(schoolId);
		}
		return "doSubmitThree";
	}
	public String doSubmitFour() {
		
		//获取当前用户id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//判断登录账户是否为空
			if(schoolId != null) {
				//对数据Map进行保存到数据库操作
				sheetService.saveSheetFour(dataMap, schoolId);
			}
		}
		//对学校签到状态统计
		if((sheetService.findBySchoolIdToOne(schoolId).size()>0 && sheetService.findBySchoolIdToOne(schoolId) != null)
				&&(sheetService.findBySchoolIdToTwo(schoolId).size()>0 && sheetService.findBySchoolIdToTwo(schoolId) != null)
				&&(sheetService.findBySchoolIdToThree(schoolId).size()>0 && sheetService.findBySchoolIdToThree(schoolId) != null)
				&&(sheetService.findBySchoolIdToFive(schoolId).size()>0 && sheetService.findBySchoolIdToFive(schoolId) != null)
				) {
			schoolService.updateSubmitById(schoolId);
		}
		return "doSubmitFour";
	}
    public String doSubmitFive() {
		
		//获取当前用户id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//判断登录账户是否为空
			if(schoolId != null) {
				//对数据Map进行保存到数据库操作
				sheetService.saveSheetFive(dataMap, schoolId);
			}
		}
		//对学校签到状态统计
		if((sheetService.findBySchoolIdToOne(schoolId).size()>0 && sheetService.findBySchoolIdToOne(schoolId) != null)
				&&(sheetService.findBySchoolIdToTwo(schoolId).size()>0 && sheetService.findBySchoolIdToTwo(schoolId) != null)
				&&(sheetService.findBySchoolIdToThree(schoolId).size()>0 && sheetService.findBySchoolIdToThree(schoolId) != null)
				&&(sheetService.findBySchoolIdToFour(schoolId).size()>0 && sheetService.findBySchoolIdToFour(schoolId) != null)
				) {
			schoolService.updateSubmitById(schoolId);
		}
		return "doSubmitFive";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public File getSheetExcel() {
		return sheetExcel;
	}
	public void setSheetExcel(File sheetExcel) {
		this.sheetExcel = sheetExcel;
	}
	public String getSheetExcelFileName() {
		return sheetExcelFileName;
	}
	public void setSheetExcelFileName(String sheetExcelFileName) {
		this.sheetExcelFileName = sheetExcelFileName;
	}
	public String getSheetExcelContentType() {
		return sheetExcelContentType;
	}
	public void setSheetExcelContentType(String sheetExcelContentType) {
		this.sheetExcelContentType = sheetExcelContentType;
	}
	public Map<String, String> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}
	

}
