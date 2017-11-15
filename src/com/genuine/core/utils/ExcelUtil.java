package com.genuine.core.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

public class ExcelUtil {
	
   //�����������map����
	private static Map<String,String> dataMap;
	
	static {
		dataMap = new HashMap<String,String>();
	}

	//��ȡ��һ����
	public static Map<String,String> importExcelOneData(File sheetOneExcel) {
		
		try {
			//�����ļ�������
			FileInputStream fis = new FileInputStream(sheetOneExcel);
			//��ȡ������
			Workbook workbook = WorkbookFactory.create(sheetOneExcel);
			//��ȡ������
			Sheet sheet = workbook.getSheetAt(0);
			/*===================��ȡ���ݴ���====================*/
			for(int i=6; i<=9; i++) {
				//�õ������к�
				Row row = sheet.getRow(i);
				//�õ���Ԫ������ 
				for(int j=3; j<=15; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-5)+(j-2), row.getCell(j).getStringCellValue());
				}
			}
			/*===================��ȡ���ݴ���====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
	
	//��ȡ�������
	public static Map<String,String> importExcelTwoData(File sheetTwoExcel) {
		
		try {
			//�����ļ�������
			FileInputStream fis = new FileInputStream(sheetTwoExcel);
			//��ȡ������
			Workbook workbook = WorkbookFactory.create(sheetTwoExcel);
			//��ȡ������
			Sheet sheet = workbook.getSheetAt(0);
			/*===================��ȡ���ݴ���====================*/
			for(int i=7; i<=12; i++) {
				//�õ������к�
				Row row = sheet.getRow(i);
				//�õ���Ԫ������ 
				for(int j=3; j<=21; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-6)+(j-2), row.getCell(j).getStringCellValue());
				}
			}
			/*===================��ȡ���ݴ���====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
	//��ȡ��������
    public static Map<String,String> importExcelThreeData(File sheetThreeExcel) {
		
		try {
			//�����ļ�������
			FileInputStream fis = new FileInputStream(sheetThreeExcel);
			//��ȡ������
			Workbook workbook = WorkbookFactory.create(sheetThreeExcel);
			//��ȡ������
			Sheet sheet = workbook.getSheetAt(0);
			/*===================��ȡ���ݴ���====================*/
			for(int i=7; i<=18; i++) {
				//�õ������к�
				Row row = sheet.getRow(i);
				//�õ���Ԫ������ 
				for(int j=5; j<=15; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					if(i<16){
						dataMap.put("00"+(i-6)+(j-4), row.getCell(j).getStringCellValue());

					}else{
					dataMap.put("0"+(i-6)+(j-4), row.getCell(j).getStringCellValue());
					}
				}
			}
			/*===================��ȡ���ݴ���====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
	//��ȡ��������
     public static Map<String,String> importExcelFourData(File sheetFourExcel) {
		
		try {
			//�����ļ�������
			FileInputStream fis = new FileInputStream(sheetFourExcel);
			//��ȡ������
			Workbook workbook = WorkbookFactory.create(sheetFourExcel);
			//��ȡ������
			Sheet sheet = workbook.getSheetAt(0);
			/*===================��ȡ���ݴ���====================*/
			for(int i=6; i<=10; i++) {
				//�õ������к�
				Row row = sheet.getRow(i);
				//�õ���Ԫ������ 
				for(int j=2; j<=13; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-5)+(j-1), row.getCell(j).getStringCellValue());
				}
			}
			/*===================��ȡ���ݴ���====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
   //��ȡ��������
     public static Map<String,String> importExcelFiveData(File sheetFiveExcel) {
		
		try {
			//�����ļ�������
			FileInputStream fis = new FileInputStream(sheetFiveExcel);
			//��ȡ������
			Workbook workbook = WorkbookFactory.create(sheetFiveExcel);
			//��ȡ������
			Sheet sheet = workbook.getSheetAt(0);
			/*===================��ȡ���ݴ���====================*/
			for(int i=6; i<=10; i++) {
				//�õ������к�
				Row row = sheet.getRow(i);
				//�õ���Ԫ������ 
				for(int j=2; j<=8; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-5)+(j-1), row.getCell(j).getStringCellValue());
				}
			}
			/*===================��ȡ���ݴ���====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
/**
 * ���Ա�Ķ�ȡ���ݵ����
 * @throws Exception
 */
//	@Test
//	public void testApp() throws Exception {
//		Map<String, String> dataMap = ExcelUtil.importExcelThreeData(new File("f:/sheetThree.xls"));
//		System.out.println("=============="+dataMap.get("00111"));
//		System.out.println("=============="+dataMap.get("0011"));
//
//	}
}
