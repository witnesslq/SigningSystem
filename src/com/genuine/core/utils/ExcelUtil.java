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
	
   //定义接收数据map集合
	private static Map<String,String> dataMap;
	
	static {
		dataMap = new HashMap<String,String>();
	}

	//获取表一数据
	public static Map<String,String> importExcelOneData(File sheetOneExcel) {
		
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream(sheetOneExcel);
			//读取工作簿
			Workbook workbook = WorkbookFactory.create(sheetOneExcel);
			//读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			/*===================获取数据代码====================*/
			for(int i=6; i<=9; i++) {
				//拿到数据行号
				Row row = sheet.getRow(i);
				//拿到单元格数据 
				for(int j=3; j<=15; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-5)+(j-2), row.getCell(j).getStringCellValue());
				}
			}
			/*===================获取数据代码====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
	
	//获取表二数据
	public static Map<String,String> importExcelTwoData(File sheetTwoExcel) {
		
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream(sheetTwoExcel);
			//读取工作簿
			Workbook workbook = WorkbookFactory.create(sheetTwoExcel);
			//读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			/*===================获取数据代码====================*/
			for(int i=7; i<=12; i++) {
				//拿到数据行号
				Row row = sheet.getRow(i);
				//拿到单元格数据 
				for(int j=3; j<=21; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-6)+(j-2), row.getCell(j).getStringCellValue());
				}
			}
			/*===================获取数据代码====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
	//获取表三数据
    public static Map<String,String> importExcelThreeData(File sheetThreeExcel) {
		
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream(sheetThreeExcel);
			//读取工作簿
			Workbook workbook = WorkbookFactory.create(sheetThreeExcel);
			//读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			/*===================获取数据代码====================*/
			for(int i=7; i<=18; i++) {
				//拿到数据行号
				Row row = sheet.getRow(i);
				//拿到单元格数据 
				for(int j=5; j<=15; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					if(i<16){
						dataMap.put("00"+(i-6)+(j-4), row.getCell(j).getStringCellValue());

					}else{
					dataMap.put("0"+(i-6)+(j-4), row.getCell(j).getStringCellValue());
					}
				}
			}
			/*===================获取数据代码====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
	//获取表四数据
     public static Map<String,String> importExcelFourData(File sheetFourExcel) {
		
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream(sheetFourExcel);
			//读取工作簿
			Workbook workbook = WorkbookFactory.create(sheetFourExcel);
			//读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			/*===================获取数据代码====================*/
			for(int i=6; i<=10; i++) {
				//拿到数据行号
				Row row = sheet.getRow(i);
				//拿到单元格数据 
				for(int j=2; j<=13; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-5)+(j-1), row.getCell(j).getStringCellValue());
				}
			}
			/*===================获取数据代码====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
   //获取表五数据
     public static Map<String,String> importExcelFiveData(File sheetFiveExcel) {
		
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream(sheetFiveExcel);
			//读取工作簿
			Workbook workbook = WorkbookFactory.create(sheetFiveExcel);
			//读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			/*===================获取数据代码====================*/
			for(int i=6; i<=10; i++) {
				//拿到数据行号
				Row row = sheet.getRow(i);
				//拿到单元格数据 
				for(int j=2; j<=8; j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					dataMap.put("0"+(i-5)+(j-1), row.getCell(j).getStringCellValue());
				}
			}
			/*===================获取数据代码====================*/
			workbook.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}
/**
 * 测试表的读取数据的情况
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
