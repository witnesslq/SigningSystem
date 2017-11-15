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
	
//	//������
//	public String[][] importExcelOne(File sheetExcel);
	
//	public boolean saveSheetOne(Map<String,String> dataMap,String id);
	
	//�����һ
	public Map<String,String> importExcelOne(File sheetExcel);
	//������
	public Map<String,String> importExcelTwo(File sheetExcel);
	//�������
	public Map<String,String> importExcelThree(File sheetExcel);
	//�������
	public Map<String,String> importExcelFour(File sheetExcel);
	//�������
	public Map<String,String> importExcelFive(File sheetExcel);
	//�ύ��һ
	public void saveSheetOne(Map<String, String> dataMap, String schoolId);
    //�ύ���
	public void saveSheetTwo(Map<String, String> dataMap, String schoolId);
	//�ύ����
	public void saveSheetThree(Map<String, String> dataMap, String schoolId);
	//�ύ����
	public void saveSheetFour(Map<String, String> dataMap, String schoolId);
	//�ύ����
	public void saveSheetFive(Map<String, String> dataMap, String schoolId);
	//��һ���ݼ���
	public List<TSheetone> listSheetOne();
	public List<TSheettwo> listSheetTwo();
	public List<TSheetfour> listSheetFour();
	public List<TSheetthree> listSheetThree();
	public List<TSheetfive> listSheetFive();
	
	//����id�Ļ�ȡ
	public List<TSheetone> findBySchoolIdToOne(Serializable id);
	public List<TSheettwo> findBySchoolIdToTwo(Serializable id);
	public List<TSheetthree> findBySchoolIdToThree(Serializable id);
	public List<TSheetfour> findBySchoolIdToFour(Serializable id);
	public List<TSheetfive> findBySchoolIdToFive(Serializable id);
}