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
	
	//ע��service
	@Resource
	private SheetService sheetService;
	@Resource
	private SchoolService schoolService;
	//�ļ���ַ
	private String filePath;
	private String fileName;
	
	//�ļ��ϴ���Ҫ����Ҫ��
	private File sheetExcel;
	private String sheetExcelFileName;
	private String sheetExcelContentType;
	
	//����ά������
	Map<String,String> dataMap = new HashMap<String,String>();
	//��ת��ͼ
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
	//������:�ļ����عؼ��㣡����
	public InputStream getInputStream() {
		FileInputStream fis;
		//���б�ķ�������ַ
		filePath = ServletActionContext.getServletContext().getRealPath("upload/");
		try {
			fis = new FileInputStream(new File(filePath+"/"+fileName));
			return fis;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	//�ļ��ϴ�
	public String importOneExcel(){
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//����ҵ���߼�
				dataMap = sheetService.importExcelOne(sheetExcel);
			}
		}
		//ת����ͼ
		return "importOneExcel";
	}
	//�ļ��ϴ�
	public String importTwoExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//����ҵ���߼�
				dataMap = sheetService.importExcelTwo(sheetExcel);
			}
		}
		//ת����ͼ
		return "importTwoExcel";
	}
	//�ļ��ϴ�����
	public String importThreeExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//����ҵ���߼�
				dataMap = sheetService.importExcelThree(sheetExcel);
			}
		}
		//ת����ͼ
		return "importThreeExcel";
	}
	//�ļ��ϴ�����
	public String importFourExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//����ҵ���߼�
				dataMap = sheetService.importExcelFour(sheetExcel);
			}
		}
		//ת����ͼ
		return "importFourExcel";
	}
	//�ļ��ϴ�����
	public String importFiveExcel(){
		dataMap = new HashMap<String,String>();
		if(sheetExcel != null) {
			if(sheetExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
				//����ҵ���߼�
				dataMap = sheetService.importExcelFive(sheetExcel);
			}
		}
		//ת����ͼ
		return "importFiveExcel";
	}
	
	public String doSubmitOne() {
		
		//��ȡ��ǰ�û�id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		
		if(dataMap != null) {
			//�жϵ�¼�˻��Ƿ�Ϊ��
			if(schoolId != null) {
				//������Map���б��浽���ݿ����
				sheetService.saveSheetOne(dataMap,schoolId);
				
			}
		}
		//��ѧУǩ��״̬ͳ��
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
		
		//��ȡ��ǰ�û�id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//�жϵ�¼�˻��Ƿ�Ϊ��
			if(schoolId != null) {
				//������Map���б��浽���ݿ����
				sheetService.saveSheetTwo(dataMap,schoolId);
			}
		}
		//��ѧУǩ��״̬ͳ��
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
		
		//��ȡ��ǰ�û�id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//�жϵ�¼�˻��Ƿ�Ϊ��
			if(schoolId != null) {
				//������Map���б��浽���ݿ����
				sheetService.saveSheetThree(dataMap, schoolId);
			}
		}
		//��ѧУǩ��״̬ͳ��
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
		
		//��ȡ��ǰ�û�id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//�жϵ�¼�˻��Ƿ�Ϊ��
			if(schoolId != null) {
				//������Map���б��浽���ݿ����
				sheetService.saveSheetFour(dataMap, schoolId);
			}
		}
		//��ѧУǩ��״̬ͳ��
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
		
		//��ȡ��ǰ�û�id
		String schoolId = "";
		School school = (School)ActionContext.getContext().getSession().get("school");
		if(school != null) {
			schoolId = school.getS_Id();
		}
		if(dataMap != null) {
			//�жϵ�¼�˻��Ƿ�Ϊ��
			if(schoolId != null) {
				//������Map���б��浽���ݿ����
				sheetService.saveSheetFive(dataMap, schoolId);
			}
		}
		//��ѧУǩ��״̬ͳ��
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
