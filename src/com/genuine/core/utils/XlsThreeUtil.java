package com.genuine.core.utils;

import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetthree;

public class XlsThreeUtil extends BaseXlsUtil{
	
	@Test
	public static void exportXlsThree(ServletOutputStream outputStream,List<List<TSheetthree>> sheetThreeList, List<School> schoolList) {
		/**==========================1.创建工作簿============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.创建工作表============================*/
		HSSFSheet sheet = workbook.createSheet();
		//合并单元格
		//type1：
		addMergeCellToUtil(sheet, 0, 0, 1, 16);
		//type2
		addMergeCellToUtil(sheet, 1, 3, 1, 4);
		//type3
		addMergeCellToUtil(sheet, 1, 3, 5, 5);
		//type4
		addMergeCellToUtil(sheet, 1, 1, 6, 16);
		//type5
		addMergeCellToUtil(sheet, 2, 2, 7, 11);
		addMergeCellToUtil(sheet, 2, 2, 12, 15);
		//type6
		addMergeCellToUtil(sheet, 2, 3, 6, 6);
		addMergeCellToUtil(sheet, 2, 3, 16, 16);
		//type7
		for(int i=7; i<=15; i++) {
			addMergeCellToUtil(sheet, 3, 3, i, i);
		}
		
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
		HSSFCell cell016 = row1.createCell(1);
		cell016.setCellStyle(addStyleAlign(workbook, (short)20, false, true));
		cell016.setCellValue("2017年全国高校学生党员队伍结构和党组织基本状况统计表（表三）");  //type1
		HSSFCell cell135 = row2.createCell(5);
		cell135.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type3
		cell135.setCellValue("编号");
		HSSFCell cell1616 = row2.createCell(6);
		cell1616.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type4
		cell1616.setCellValue("在校生党员队伍结构");
		HSSFCell cell2711 = row3.createCell(7);
		cell2711.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type5
		cell2711.setCellValue("学生党员情况");
		HSSFCell cell21215 = row3.createCell(12);
		cell21215.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type5
		cell21215.setCellValue("申请入党情况");
		HSSFCell cell236 = row3.createCell(6);
		cell236.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
		cell236.setCellValue("在校生总数");
		HSSFCell cell2316 = row3.createCell(16);
		cell2316.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
		cell2316.setCellValue("学生党支部数	");
		//type7
		String strContent[] = new String[]{"党员总数","预备党员","正式党员","当年发展党员数","党员占学生总数的比例","非党员学生数","申请入党学生数","入党积极分子数","非党员学生申请入党比例"};
		for(int i=7; i<=15; i++) {
			HSSFCell cell37 = row4.createCell(i);
			cell37.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
			cell37.setCellValue(strContent[i-7]);
		}
		//rowId行
		addMergeCellToUtil(sheet, 4, 4, 1, 4);
		HSSFCell cell5BE = row5.createCell(1);
		cell5BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
		cell5BE.setCellValue("甲");
		HSSFCell cell5F = row5.createCell(5);
		cell5F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
		cell5F.setCellValue("乙");
		for(int i=1;i<=11; i++) {
			HSSFCell cell5 = row5.createCell(i+5);
			cell5.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell5.setCellValue(i);	
		}
		/*=========================标头死数据区域============================*/
		int line = 5;
		int count = 1;
		for(int i=0; i<sheetThreeList.size(); i++) {
		/**==========================迭代数据区域================================*/
			//合并单元格
			addMergeCellToUtil(sheet, line, line+11, 0, 0);
			addMergeCellToUtil(sheet, line, line, 1, 4);
			addMergeCellToUtil(sheet, line+1, line+1, 1, 4);
			addMergeCellToUtil(sheet, line+2, line+2, 1, 4);
			addMergeCellToUtil(sheet, line+3, line+11, 1, 1);
			addMergeCellToUtil(sheet, line+3, line+5, 2, 2);
			addMergeCellToUtil(sheet, line+6, line+8, 2, 2);
			addMergeCellToUtil(sheet, line+9, line+11, 2, 2);
			for(int j = line+3; j <= line+11; j++) {
				addMergeCellToUtil(sheet, j, j, 3, 4);
			}
			HSSFRow row6 = sheet.createRow(line);
			HSSFRow row7 = sheet.createRow(line+1);
			HSSFRow row8 = sheet.createRow(line+2);
			HSSFRow row9 = sheet.createRow(line+3);
			HSSFRow row12 = sheet.createRow(line+6);
			HSSFRow row15 = sheet.createRow(line+9);
					/**==============死数据区域=============*/
			HSSFCell cell6BE = row6.createCell(1);
			HSSFCell cell6F = row6.createCell(5);
			cell6BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6BE.setCellValue("总计");
			cell6F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6F.setCellValue("001");
			HSSFCell cell7BE = row7.createCell(1);
			HSSFCell cell7F = row7.createCell(5);
			cell7BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell7BE.setCellValue("其中少数民族数量");
			cell7F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell7F.setCellValue("002");
			HSSFCell cell8BE = row8.createCell(1);
			HSSFCell cell8F = row8.createCell(5);
			cell8BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell8BE.setCellValue("其中女生数量");
			cell8F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell8F.setCellValue("003");
			HSSFCell cell917B = row9.createCell(1);
			cell917B.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell917B.setCellValue("合计");
			
			HSSFCell cell911C = row9.createCell(2);
			cell911C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell911C.setCellValue("研究生");
			HSSFCell cell12C = row12.createCell(2);
			cell12C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12C.setCellValue("普通高校本专科");
			HSSFCell cell15C = row15.createCell(2);
			cell15C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15C.setCellValue("民办高校（含独立学院）本专科");
			//可循环区域
			HSSFRow row10 = sheet.createRow(line+4);
			HSSFRow row11 = sheet.createRow(line+5);
			HSSFCell cell9DE = row9.createCell(3);
			HSSFCell cell9F = row9.createCell(5);
			cell9DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell9DE.setCellValue("小计");
			cell9F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell9F.setCellValue("004");
			HSSFCell cell10DE = row10.createCell(3);
			HSSFCell cell10F = row10.createCell(5);
			cell10DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell10DE.setCellValue("博士");
			cell10F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell10F.setCellValue("005");
			HSSFCell cell11DE = row11.createCell(3);
			HSSFCell cell11F = row11.createCell(5);
			cell11DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell11DE.setCellValue("硕士");
			cell11F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell11F.setCellValue("006");
			
			HSSFRow row13 = sheet.createRow(line+7);
			HSSFRow row14 = sheet.createRow(line+8);
			HSSFCell cell12DE = row12.createCell(3);
			HSSFCell cell12F = row12.createCell(5);
			cell12DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12DE.setCellValue("小计");
			cell12F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12F.setCellValue("007");
			HSSFCell cell13DE = row13.createCell(3);
			HSSFCell cell13F = row13.createCell(5);
			cell13DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell13DE.setCellValue("本科");
			cell13F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell13F.setCellValue("008");
			HSSFCell cell14DE = row14.createCell(3);
			HSSFCell cell14F = row14.createCell(5);
			cell14DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell14DE.setCellValue("专科");
			cell14F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell14F.setCellValue("009");
			HSSFRow row16 = sheet.createRow(line+10);
			HSSFRow row17 = sheet.createRow(line+11);
			HSSFCell cell15DE = row15.createCell(3);
			HSSFCell cell15F = row15.createCell(5);
			cell15DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15DE.setCellValue("小计");
			cell15F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15F.setCellValue("010");
			HSSFCell cell16DE = row16.createCell(3);
			HSSFCell cell16F = row16.createCell(5);
			cell16DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell16DE.setCellValue("本科");
			cell16F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell16F.setCellValue("011");
			HSSFCell cell17DE = row17.createCell(3);
			HSSFCell cell17F = row17.createCell(5);
			cell17DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell17DE.setCellValue("专科");
			cell17F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell17F.setCellValue("012");
					/**==============死数据区域=============*/
					/**==============活数据区域=============*/
			//学校名称填写
			String schoolName = count+"."+schoolList.get(i).getS_Name();
			HSSFCell cell6xHeader = row6.createCell(0);
			cell6xHeader.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6xHeader.setCellValue(schoolName);
			//拿到表二数据
			List<TSheetthree> sheetList = sheetThreeList.get(i);
			for(int j=6; j<17; j++ ) {
				HSSFCell cell6x = row6.createCell(j);
				HSSFCell cell7x = row7.createCell(j);
				HSSFCell cell8x = row8.createCell(j);
				HSSFCell cell9x = row9.createCell(j);
				HSSFCell cell10x = row10.createCell(j);
				HSSFCell cell11x = row11.createCell(j);
				cell6x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell9x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell10x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				cell11x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
				if(sheetList.get(j-6).getAmount() != null) {
					cell6x.setCellValue(sheetList.get(j-6).getAmount());
				}
				if(sheetList.get(j-6).getFewSum() != null) {
					cell7x.setCellValue(sheetList.get(j-6).getFewSum());
				}
				if(sheetList.get(j-6).getWomanSum() != null) {
					cell8x.setCellValue(sheetList.get(j-6).getWomanSum());
				}
				if(sheetList.get(j-6).getXjSum() != null) {
					cell9x.setCellValue(sheetList.get(j-6).getXjSum());
				}
				if(sheetList.get(j-6).getBsSum() != null) {
					cell10x.setCellValue(sheetList.get(j-6).getBsSum());
				}
				if(sheetList.get(j-6).getSsSum() != null) {
					cell11x.setCellValue(sheetList.get(j-6).getSsSum());
				}
				if("0".equals(sheetList.get(j-6).getSchoolState())) {
					HSSFCell cell12x = row12.createCell(j);
					HSSFCell cell13x = row13.createCell(j);
					HSSFCell cell14x = row14.createCell(j);
					cell12x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell13x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell14x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					if(sheetList.get(j-6).getSxjSum() != null) {
						cell12x.setCellValue(sheetList.get(j-6).getSxjSum());
					}
					if(sheetList.get(j-6).getSbkSum() != null) {
						cell13x.setCellValue(sheetList.get(j-6).getSbkSum());
					}
					if(sheetList.get(j-6).getSzkSum() != null) {
						cell14x.setCellValue(sheetList.get(j-6).getSzkSum());
					}
				}else{
					HSSFCell cell15x = row15.createCell(j);
					HSSFCell cell16x = row16.createCell(j);
					HSSFCell cell17x = row17.createCell(j);
					cell15x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell16x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					cell17x.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
					if(sheetList.get(j-6).getSxjSum() != null) {
						cell15x.setCellValue(sheetList.get(j-6).getSxjSum());
					}
					if(sheetList.get(j-6).getSbkSum() != null) {
						cell16x.setCellValue(sheetList.get(j-6).getSbkSum());
					}
					if(sheetList.get(j-6).getSzkSum() != null) {
						cell17x.setCellValue(sheetList.get(j-6).getSzkSum());
					}
				}
				
			}
					/**==============活数据区域=============*/
		/**==========================迭代数据区域================================*/
			line = line + 12;
			count++;
		}
		/**==========================5.输出============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
