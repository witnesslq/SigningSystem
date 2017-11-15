package com.genuine.core.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetthree;

public class SumXlsThreeUtil extends BaseXlsUtil{
	
	@Test
	public static void exportXlsThree(ServletOutputStream outputStream,List<List<String>> sheetThreeList) {
		/**==========================1.创建工作簿============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.创建工作表============================*/
		HSSFSheet sheet = workbook.createSheet();
		//合并单元格
		//type1：
		addMergeCellToUtil(sheet, 0, 0, 0, 15);
		//type2
		addMergeCellToUtil(sheet, 1, 3, 0, 2);
		//type3
		addMergeCellToUtil(sheet, 1, 3, 3, 3);
		//type4
		addMergeCellToUtil(sheet, 1, 1, 4, 14);
		//type5
		addMergeCellToUtil(sheet, 2, 2, 5, 9);
		addMergeCellToUtil(sheet, 2, 2, 10, 13);
		//type6
		addMergeCellToUtil(sheet, 2, 3, 4, 4);
		addMergeCellToUtil(sheet, 2, 3, 14, 14);
		
		/**==========================3.创建行================================*/
		/*=========================标头死数据区域============================*/
		HSSFRow row1 = sheet.createRow(0);
		HSSFRow row2 = sheet.createRow(1);
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short)(8.75*51.25));
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short)(24.75*51.25));
		HSSFRow row5 = sheet.createRow(4);
		/*=========================标头死数据区域============================*/
		
		/**==========================4.创建单元格============================*/
		/*=========================标头死数据区域============================*/
		HSSFCell cell016 = row1.createCell(0);
		cell016.setCellStyle(addStyleAlign(workbook, (short)20, false, true));
		cell016.setCellValue("2017年全国高校学生党员队伍结构和党组织基本状况统计表（表三）");  //type1
		HSSFCell cell135 = row2.createCell(3);
		cell135.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type3
		cell135.setCellValue("编号");
		HSSFCell cell1616 = row2.createCell(4);
		cell1616.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type4
		cell1616.setCellValue("在校生党员队伍结构");
		HSSFCell cell2711 = row3.createCell(5);
		cell2711.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type5
		cell2711.setCellValue("学生党员情况");
		HSSFCell cell21215 = row3.createCell(10);
		cell21215.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type5
		cell21215.setCellValue("申请入党情况");
		HSSFCell cell236 = row3.createCell(4);
		cell236.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
		cell236.setCellValue("在校生总数");
		HSSFCell cell2316 = row3.createCell(14);
		cell2316.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
		cell2316.setCellValue("学生党支部数	");
		//type7
		String strContent[] = new String[]{"党员总数","预备党员","正式党员","当年发展党员数","党员占学生总数的比例","非党员学生数","申请入党学生数","入党积极分子数","非党员学生申请入党比例"};
		for(int i=5; i<=13; i++) {
			HSSFCell cell37 = row4.createCell(i);
			cell37.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
			cell37.setCellValue(strContent[i-5]);
		}
		//rowId行
		addMergeCellToUtil(sheet, 4, 4, 0, 2);
		HSSFCell cell5BE = row5.createCell(0);
		cell5BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
		cell5BE.setCellValue("甲");
		HSSFCell cell5F = row5.createCell(3);
		cell5F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
		cell5F.setCellValue("乙");
		for(int i=1;i<=11; i++) {
			HSSFCell cell5 = row5.createCell(i+3);
			cell5.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell5.setCellValue(i);	
		}
		/*=========================标头死数据区域============================*/
	
		/**==========================迭代数据区域================================*/
			//合并单元格
			addMergeCellToUtil(sheet, 8, 16, 0, 0);
			addMergeCellToUtil(sheet, 5, 5, 0, 2);
			addMergeCellToUtil(sheet, 6, 6, 0, 2);
			addMergeCellToUtil(sheet, 7, 7, 0, 2);
			addMergeCellToUtil(sheet, 8, 10, 1, 1);
			addMergeCellToUtil(sheet, 11, 13, 1, 1);
			addMergeCellToUtil(sheet, 14, 16, 1, 1);
		
			HSSFRow row6 = sheet.createRow(5);
			HSSFRow row7 = sheet.createRow(6);
			HSSFRow row8 = sheet.createRow(7);
			HSSFRow row9 = sheet.createRow(8);
			HSSFRow row10 = sheet.createRow(9);
			HSSFRow row11 = sheet.createRow(10);
			HSSFRow row12 = sheet.createRow(11);
			HSSFRow row13 = sheet.createRow(12);
			HSSFRow row14 = sheet.createRow(13);
			HSSFRow row15 = sheet.createRow(14);
					/**==============死数据区域=============*/
			HSSFCell cell6BE = row6.createCell(0);
			HSSFCell cell6F = row6.createCell(3);
			cell6BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6BE.setCellValue("总计");
			cell6F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6F.setCellValue("001");
			HSSFCell cell7BE = row7.createCell(0);
			HSSFCell cell7F = row7.createCell(3);
			cell7BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell7BE.setCellValue("其中少数民族数量");
			cell7F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell7F.setCellValue("002");
			HSSFCell cell8BE = row8.createCell(0);
			HSSFCell cell8F = row8.createCell(3);
			cell8BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell8BE.setCellValue("其中女生数量");
			cell8F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell8F.setCellValue("003");
			HSSFCell cell9A = row9.createCell(0);
			cell9A.setCellValue("合计");
			cell9A.setCellStyle(addStyleAlign(workbook, (short)15, true, false));
			HSSFCell cell911C = row9.createCell(1);
			cell911C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell911C.setCellValue("研究生");
			HSSFCell cell12C = row12.createCell(1);
			cell12C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12C.setCellValue("普通高校本专科");
			HSSFCell cell15C = row15.createCell(1);
			cell15C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15C.setCellValue("民办高校（含独立学院）本专科");
			//可循环区域
			HSSFCell cell9DE = row9.createCell(2);
			HSSFCell cell9F = row9.createCell(3);
			cell9DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell9DE.setCellValue("小计");
			cell9F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell9F.setCellValue("004");
			HSSFCell cell10DE = row10.createCell(2);
			HSSFCell cell10F = row10.createCell(3);
			cell10DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell10DE.setCellValue("博士");
			cell10F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell10F.setCellValue("005");
			HSSFCell cell11DE = row11.createCell(2);
			HSSFCell cell11F = row11.createCell(3);
			cell11DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell11DE.setCellValue("硕士");
			cell11F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell11F.setCellValue("006");
			
			HSSFCell cell12DE = row12.createCell(2);
			HSSFCell cell12F = row12.createCell(3);
			cell12DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12DE.setCellValue("小计");
			cell12F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12F.setCellValue("007");
			HSSFCell cell13DE = row13.createCell(2);
			HSSFCell cell13F = row13.createCell(3);
			cell13DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell13DE.setCellValue("本科");
			cell13F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell13F.setCellValue("008");
			HSSFCell cell14DE = row14.createCell(2);
			HSSFCell cell14F = row14.createCell(3);
			cell14DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell14DE.setCellValue("专科");
			cell14F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell14F.setCellValue("009");
			HSSFRow row16 = sheet.createRow(15);
			HSSFRow row17 = sheet.createRow(16);
			HSSFCell cell15DE = row15.createCell(2);
			HSSFCell cell15F = row15.createCell(3);
			cell15DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15DE.setCellValue("小计");
			cell15F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15F.setCellValue("010");
			HSSFCell cell16DE = row16.createCell(2);
			HSSFCell cell16F = row16.createCell(3);
			cell16DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell16DE.setCellValue("本科");
			cell16F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell16F.setCellValue("011");
			HSSFCell cell17DE = row17.createCell(2);
			HSSFCell cell17F = row17.createCell(3);
			cell17DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell17DE.setCellValue("专科");
			cell17F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell17F.setCellValue("012");
					/**==============死数据区域=============*/
					/**==============活数据区域=============*/
			//拿到表三数据
			for(int i=0;i<sheetThreeList.size();i++){
			List<String> sheetList = sheetThreeList.get(i);
			if (i == 5 || i == 9) {
				HSSFCell cell6x = row6.createCell(i+4);
				HSSFCell cell7x = row7.createCell(i+4);
				HSSFCell cell8x = row8.createCell(i+4);
				HSSFCell cell9x = row9.createCell(i+4);
				HSSFCell cell10x = row10.createCell(i+4);
				HSSFCell cell11x = row11.createCell(i+4);
				cell6x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell9x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell10x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell11x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				if (sheetList.get(0) != null) {
					if (sheetList.get(0).length() > 5) {
						cell6x.setCellValue(sheetList.get(0).substring(0, 5));
					}else{
						cell6x.setCellValue(sheetList.get(0));
					}
				}
				if (sheetList.get(1) != null) {
					if (sheetList.get(1).length() > 5) {
						cell7x.setCellValue(sheetList.get(1).substring(0, 5));
					}else{
						cell7x.setCellValue(sheetList.get(1));
					}
				}
				if (sheetList.get(2) != null) {
					if (sheetList.get(2).length() > 5) {
						cell8x.setCellValue(sheetList.get(2).substring(0, 5));
					}else{
						cell8x.setCellValue(sheetList.get(2));
					}
				}
				if(sheetList.get(3) != null) {
					if (sheetList.get(3).length() > 5) {
						cell9x.setCellValue(sheetList.get(3).substring(0, 5));
					}else{
						cell9x.setCellValue(sheetList.get(3));
					}
				}
				if(sheetList.get(4) != null) {
					if (sheetList.get(4).length() > 5) {
						cell10x.setCellValue(sheetList.get(4).substring(0, 5));
					}else{
						cell10x.setCellValue(sheetList.get(4));
					}
				}
				if(sheetList.get(5) != null) {
					if (sheetList.get(5).length() > 5) {
						cell11x.setCellValue(sheetList.get(5).substring(0, 5));
					}else{
						cell11x.setCellValue(sheetList.get(5));
					}
				}
				
					HSSFCell cell12x = row12.createCell(i+4);
					HSSFCell cell13x = row13.createCell(i+4);
					HSSFCell cell14x = row14.createCell(i+4);
					cell12x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell13x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell14x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					if(StringUtils.isNotBlank(sheetList.get(6))) {
						if (sheetList.get(6).length() > 5) {
							cell12x.setCellValue(sheetList.get(6).substring(0, 5));
						}else{
							cell12x.setCellValue(sheetList.get(6));
						}
					}
					if(StringUtils.isNotBlank(sheetList.get(7))) {
						if (sheetList.get(7).length() > 5) {
							cell13x.setCellValue(sheetList.get(7).substring(0, 5));
						}else{
							cell13x.setCellValue(sheetList.get(7));
						}
					}
					if(StringUtils.isNotBlank(sheetList.get(8))) {
						if (sheetList.get(8).length() > 5) {
							cell14x.setCellValue(sheetList.get(8).substring(0, 5));
						}else{
							cell14x.setCellValue(sheetList.get(8));
						}
					}
				
					HSSFCell cell15x = row15.createCell(i+4);
					HSSFCell cell16x = row16.createCell(i+4);
					HSSFCell cell17x = row17.createCell(i+4);
					cell15x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell16x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell17x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					if(StringUtils.isNotBlank(sheetList.get(9))) {
						if (sheetList.get(9).length() > 5) {
							cell15x.setCellValue(sheetList.get(9).substring(0, 5));
						}else{
							cell15x.setCellValue(sheetList.get(9));
						}
					}
					if(StringUtils.isNotBlank(sheetList.get(10))) {
						if (sheetList.get(10).length() > 5) {
							cell16x.setCellValue(sheetList.get(10).substring(0, 5));
						}else{
							cell16x.setCellValue(sheetList.get(10));
						}
					}
					if(StringUtils.isNotBlank(sheetList.get(11))) {
						if (sheetList.get(11).length() > 5) {
							cell17x.setCellValue(sheetList.get(11).substring(0, 5));
						}else{
							cell17x.setCellValue(sheetList.get(11));
						}
					}
			}else{
				HSSFCell cell6x = row6.createCell(i+4);
				HSSFCell cell7x = row7.createCell(i+4);
				HSSFCell cell8x = row8.createCell(i+4);
				HSSFCell cell9x = row9.createCell(i+4);
				HSSFCell cell10x = row10.createCell(i+4);
				HSSFCell cell11x = row11.createCell(i+4);
				cell6x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell9x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell10x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell11x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				if (sheetList.get(0) != null) {
						cell6x.setCellValue(sheetList.get(0).substring(0,sheetList.get(0).indexOf(".") ));
				}
				if (sheetList.get(1) != null) {
						cell7x.setCellValue(sheetList.get(1).substring(0,sheetList.get(1).indexOf(".") ));
				}
				if (sheetList.get(2) != null) {
						cell8x.setCellValue(sheetList.get(2).substring(0,sheetList.get(2).indexOf(".") ));
				}
				if(sheetList.get(3) != null) {
						cell9x.setCellValue(sheetList.get(3).substring(0,sheetList.get(3).indexOf(".") ));
				}
				if(sheetList.get(4) != null) {
						cell10x.setCellValue(sheetList.get(4).substring(0,sheetList.get(4).indexOf(".") ));
				}
				if(sheetList.get(5) != null) {
						cell11x.setCellValue(sheetList.get(5).substring(0,sheetList.get(5).indexOf(".") ));
				}
					HSSFCell cell12x = row12.createCell(i+4);
					HSSFCell cell13x = row13.createCell(i+4);
					HSSFCell cell14x = row14.createCell(i+4);
					cell12x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell13x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell14x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					if(StringUtils.isNotBlank(sheetList.get(6))) {
							cell12x.setCellValue(sheetList.get(6).substring(0,sheetList.get(6).indexOf(".") ));
					}
					if(StringUtils.isNotBlank(sheetList.get(7))) {
							cell13x.setCellValue(sheetList.get(7).substring(0,sheetList.get(7).indexOf(".") ));
					}
					if(StringUtils.isNotBlank(sheetList.get(8))) {
							cell14x.setCellValue(sheetList.get(8).substring(0,sheetList.get(8).indexOf(".") ));
					}
				
					HSSFCell cell15x = row15.createCell(i+4);
					HSSFCell cell16x = row16.createCell(i+4);
					HSSFCell cell17x = row17.createCell(i+4);
					cell15x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell16x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell17x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					if(StringUtils.isNotBlank(sheetList.get(9))) {
							cell15x.setCellValue(sheetList.get(9).substring(0,sheetList.get(9).indexOf(".") ));
					}
					if(StringUtils.isNotBlank(sheetList.get(10))) {
							cell16x.setCellValue(sheetList.get(10).substring(0,sheetList.get(10).indexOf(".") ));
					}
					if(StringUtils.isNotBlank(sheetList.get(11))) {
							cell17x.setCellValue(sheetList.get(11).substring(0,sheetList.get(11).indexOf(".") ));
					}
				
			}
		}
			
					/**==============活数据区域=============*/
		/**==========================迭代数据区域================================*/
		

		/**==========================5.输出============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
