package com.genuine.core.utils;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import com.genuine.front.sheet.entity.TSheetfour;

public class SumXlsFourUtil extends BaseXlsUtil {

	@Test
	public static void exportXlsFour(OutputStream outputStream,List<List<String>> sheetFourList) {
		/**==========================1.创建工作簿============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.创建工作表============================*/
		HSSFSheet sheet = workbook.createSheet();
		//合并单元格
		
		
		//标题
			addMergeCellToUtil(sheet, 0, 0, 0, 13);
			addMergeCellToUtil(sheet, 1, 2, 0, 0);
			addMergeCellToUtil(sheet, 1, 2, 1, 1);
			addMergeCellToUtil(sheet, 1, 2, 2, 2);
			addMergeCellToUtil(sheet, 1, 1, 3, 6);
			addMergeCellToUtil(sheet, 1, 1, 7, 12);
			addMergeCellToUtil(sheet, 1, 2, 13, 13);
			
		/**==========================3.创建行================================*/
		/*=========================标头死数据区域============================*/
		//标题行
		HSSFRow rowHeader = sheet.createRow(0);
		// 2起始行号
		HSSFRow row2 = sheet.createRow(1);

		// 3起始行号
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short)(50*51.25));
		// 4起始行号
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short)(10*51.25));
	
		/*=========================标头死数据区域============================*/
		
		/**==========================4.创建单元格============================*/
		/*=========================标头死数据区域============================*/
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader.setCellStyle(addStyleAlign(workbook, (short)20,false,true));
		cellHeader.setCellValue("2017年全国高校与党组织失去联系党员情况汇总表（表四）");

		//类型1
		HSSFCell cell1 = null;
		int textCol[] = new int[]{1,2,3,7,13};
		String textContent[] = new String[]{"编号","截止2017年6月30日未取得联系党员数量","失去联系时间","失去联系情形","一年内已取得联系党员数量"};
		for(int i=0; i<textCol.length; i++) {
			cell1 = row2.createCell(textCol[i]);
			cell1.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell1.setCellValue(textContent[i]);
		}
		//类型2
		HSSFCell cell2 = null;
		int textCol34[] = new int[]{3,4,5,6,7,8,9,10,11,12};
		String textContent34[] = new String[]{"6个月以上不满1年","1年至5年","6年至10年","11年及以上","离职","毕业后去向不明","工作单位改变","出国（境）","居住地改变","其他"};
		for(int i=0; i<textCol34.length; i++) {
			cell2 = row3.createCell(textCol34[i]);
			cell2.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell2.setCellValue(textContent34[i]);	
		}
		//类型3
		HSSFCell cell3 = null;
		HSSFCell cell3AB = null;
		cell3AB = row4.createCell(0);
		cell3AB.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
		cell3AB.setCellValue("甲");
		for(int i=1; i<=13; i++) {
			if(i == 1) {
				cell3 = row4.createCell(i);
				cell3.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell3.setCellValue("乙");
			}else{
				cell3 = row4.createCell(i);
				cell3.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell3.setCellValue(i-1);
			}
		}
		/*=========================标头死数据区域============================*/
		/**==========================迭代数据区域================================*/
		
					/**==============死数据区域=============*/
			//总计行  		
			HSSFRow row5 = sheet.createRow(4);
			HSSFCell cell5B = row5.createCell(0);
			cell5B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell5B.setCellValue("总计");
			HSSFCell cell5C = row5.createCell(1);
			cell5C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell5C.setCellValue("01");
			
			//解除劳动行
			HSSFRow row6 = sheet.createRow(5);
			HSSFCell cell6B = row6.createCell(0);
			cell6B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6B.setCellValue("教职工（含解除劳动关系的）");
			HSSFCell cell6C = row6.createCell(1);
			cell6C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6C.setCellValue("02");
					
			//离退休人员行			
			HSSFRow row7 = sheet.createRow(6);
			HSSFCell cell7B = row7.createCell(0);
			cell7B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7B.setCellValue("离退休人员");
			HSSFCell cell7C = row7.createCell(1);
			cell7C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7C.setCellValue("03");	
			
			//高校毕业生行
			HSSFRow row8 = sheet.createRow(7);
			HSSFCell cell8B = row8.createCell(0);
			cell8B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8B.setCellValue("高校毕业生");
			HSSFCell cell8C = row8.createCell(1);
			cell8C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8C.setCellValue("04"); 
			
			//其他行
			HSSFRow row9 = sheet.createRow(8);
			HSSFCell cell9B = row9.createCell(0);
			cell9B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9B.setCellValue("其他");
			HSSFCell cell9C = row9.createCell(1);
			cell9C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9C.setCellValue("05"); 
			
					/**==============死数据区域=============*/
					/**==============活数据区域=============*/
		
			//块区域数据的封装问题
			//拿到表四列表
			for(int i=0;i<sheetFourList.size();i++){
			List<String> sheetList = sheetFourList.get(i);
				HSSFCell cell5x = row5.createCell(i+2);
				HSSFCell cell6x = row6.createCell(i+2);
				HSSFCell cell7x = row7.createCell(i+2);
				HSSFCell cell8x = row8.createCell(i+2);
				HSSFCell cell9x = row9.createCell(i+2);
				cell5x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell6x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell9x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));			
				if(sheetList.get(0) != null) {
					cell5x.setCellValue(sheetList.get(0));
				}
				if(sheetList.get(1) != null) {
					cell6x.setCellValue(sheetList.get(1));
				}
				if(sheetList.get(2) != null) {
					cell7x.setCellValue(sheetList.get(2));
				}
				if(sheetList.get(3) != null) {
					cell8x.setCellValue(sheetList.get(3));
				}
				if(sheetList.get(4) != null) {
					cell9x.setCellValue(sheetList.get(4));
				}
			}
			
					/**==============活数据区域=============*/

		/**==========================5.输出============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}


