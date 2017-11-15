package com.genuine.core.utils;

import java.io.OutputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;




public class SumXlsOneUtil extends BaseXlsUtil {
	
	
	@Test
	public static void exportXlsOne(OutputStream outputStream,List<List<String>> sheetOneList ) {
		
		/**==========================1.创建工作簿============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		//创建合并单元格对象 
			//参数 起始行号，结束行号，起始列号，结束列号
		CellRangeAddress cellRangeAddressHeader = new CellRangeAddress(0,0,0,15);
		CellRangeAddress cellRangeAddress23AB = new CellRangeAddress(1,2,0,1);
		CellRangeAddress cellRangeAddress23C = new CellRangeAddress(1,2,2,2);
		CellRangeAddress cellRangeAddress23B = new CellRangeAddress(1,2,3,3);
		CellRangeAddress cellRangeAddress2IH = new CellRangeAddress(1,1,8,15);
		
	
		//创建头标题行样式并创建字体
		HSSFCellStyle style = workbook.createCellStyle();
		//垂直水平居中样式
		HSSFCellStyle styleAlign = workbook.createCellStyle();
		HSSFCellStyle styleAlign2 = workbook.createCellStyle();
		//居中
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		/**================================ 通用字符格式===========================**/
		styleAlign.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		styleAlign.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		HSSFFont fontGenneral = workbook.createFont();
		fontGenneral.setFontHeightInPoints((short)12);
		fontGenneral.setFontName("宋体");
		styleAlign.setFont(fontGenneral);
		styleAlign.setWrapText(true);
		
		styleAlign2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		styleAlign2.setFont(fontGenneral);
		styleAlign2.setWrapText(true);
		/**================================ 通用字符格式===========================**/

		//创建字体
		HSSFFont font = workbook.createFont();
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//加粗字体 
		font.setFontName("宋体");
		font.setFontHeightInPoints((short)20); //设置字体大小
		style.setFont(font); //头标题加载字体格式
		/**==================================================================*/
		/**==========================2.创建工作表============================*/
		HSSFSheet sheet = workbook.createSheet();
		
		addMergeCellToUtil(sheet, 3, 3, 0, 1);
		//设置宽度 
		double[] colWidth = new double[]{17.25,26.13,6.50,9.25,8.88,9.38,9.88,13.88,8.00,7.63,25.50,11.50,11.50};
		for(int i=0; i<13; i++) {
			sheet.setColumnWidth(i, (short)(colWidth[i]*250));
		}
		
		
		//加载合并单元格对象
		sheet.addMergedRegion(cellRangeAddressHeader);
		sheet.addMergedRegion(cellRangeAddress23AB);
		sheet.addMergedRegion(cellRangeAddress23C);
		sheet.addMergedRegion(cellRangeAddress23B);
		sheet.addMergedRegion(cellRangeAddress2IH);
		
		/**==================================================================*/
		/**==========================3.创建行================================*/
		HSSFRow rowHeader = sheet.createRow(0);
		
		
		/**==================================================================*/
		/**==========================4.创建单元格============================*/
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader.setCellStyle(style);
		cellHeader.setCellValue("2017年全国高校基层党组织建设情况统计表（表一）");
		
		//死数据区
		HSSFRow row2 = sheet.createRow(1);
		//设置行高
		
		HSSFCell cell23C = row2.createCell(2);
		cell23C.setCellStyle(styleAlign);
		HSSFCell cell23D = row2.createCell(3);
		cell23D.setCellStyle(styleAlign);
		cell23C.setCellValue("编号");
		cell23D.setCellValue("高校总数");
		
		HSSFCell cell2IH = row2.createCell(8);
		cell2IH.setCellStyle(styleAlign);
		cell2IH.setCellValue("高校基层党组织总数");
		String buildState[] = new String[]{"建立党委的高校","建立总支部的高校","建立支部的高校","未建立党组织的高校"};
		HSSFCell cell2 = null;
		for(int i=4; i<=7; i++) {
			cell2 = row2.createCell(i);
			cell2.setCellStyle(styleAlign);
			cell2.setCellValue(buildState[i-4]);
		}
		HSSFRow row3 = sheet.createRow(2);
		//设置行高-
//		row3.setHeight((short)(39*15.225));
		
		
		HSSFCell cell3 = null;
		String[] strHeader = new String[]{"高校党委数","院系党委数","院系党总支数","直属党支部数","教职工党总支","教职工党总支（党支部）数（含离退休人员党支部数）","离退休人员党支部数","学生党支部数"};
		for(int i=4; i<=15; i++) {
			cell3 = row3.createCell(i);
			cell3.setCellStyle(styleAlign);
			cell3.setCellValue("小计");
			if(i>7) {
				cell3 = row3.createCell(i);
				cell3.setCellStyle(styleAlign);
				cell3.setCellValue(strHeader[i-8]);
			}
		}
		
		//关于第四行
		HSSFRow row4 = sheet.createRow(3);
		String[] strRow4 = new String[]{"乙","1","2","3","4","5","6","7","8","9","10","11","12","13"};
		HSSFCell cell4 = null;
		HSSFCell cellTemp = row4.createCell(0);
		cellTemp.setCellStyle(styleAlign);
		cellTemp.setCellValue("甲");
		for(int i=2; i< strRow4.length+2; i++) {
			cell4 = row4.createCell(i);
			cell4.setCellStyle(styleAlign);
			cell4.setCellValue(strRow4[i-2]);
		}
		/**==============================表头处理完毕====================================*/
		/**================================处理数据库中的================================*/
		//合并单元格
		addMergeCellToUtil(sheet, 4, 4, 0, 1);
		addMergeCellToUtil(sheet, 5, 7, 0, 0);
		//死数据区域：
		//1、总计标头
		
		HSSFRow row5 = sheet.createRow(4);
		HSSFCell cell5AB = row5.createCell(0);
		HSSFCell cell5C = row5.createCell(2);
		cell5AB.setCellStyle(styleAlign);
		cell5C.setCellStyle(styleAlign);
		cell5AB.setCellValue("总计");
		cell5C.setCellValue("01");
		//合计
		HSSFRow row6 = sheet.createRow(5);
		HSSFCell cell678A = row6.createCell(0);		
		cell678A.setCellStyle(styleAlign);
		cell678A.setCellValue("合计");
		
		//2、院校类型
		String typeSchool[] = new String[]{"本科院校","专科院校（含职业技术学院）","民办高校 （含独立学院）"};
		HSSFCell cell6B = row6.createCell(1);
		HSSFCell cell6C = row6.createCell(2);
		cell6B.setCellStyle(styleAlign2);
		cell6B.setCellValue(typeSchool[0]);
		cell6C.setCellStyle(styleAlign);
		cell6C.setCellValue("02");
		
		HSSFRow row7 = sheet.createRow(6);
		HSSFCell cell7B = row7.createCell(1);
		HSSFCell cell7C = row7.createCell(2);
		cell7B.setCellStyle(styleAlign2);
		cell7B.setCellValue(typeSchool[1]);
		cell7C.setCellStyle(styleAlign);
		cell7C.setCellValue("03");
		
		HSSFRow row8 = sheet.createRow(7);
		HSSFCell cell8B = row8.createCell(1);
		HSSFCell cell8C = row8.createCell(2);
		cell8B.setCellStyle(styleAlign2);
		cell8B.setCellValue(typeSchool[2]);
		cell8C.setCellStyle(styleAlign);
		cell8C.setCellValue("04");
		// 01 行数据放
		/**================================处理数据库中的=================================*/
		//把处理完的数据放置
		List<String> colList = null;
		for(int i=0; i<sheetOneList.size(); i++) {
			colList = sheetOneList.get(i);
			HSSFCell cell5x = row5.createCell(i+3);
			HSSFCell cell6x = row6.createCell(i+3);
			HSSFCell cell7x = row7.createCell(i+3);
			HSSFCell cell8x = row8.createCell(i+3);
			cell5x.setCellStyle(styleAlign);
			if(colList.size() > 0) {
				if(StringUtils.isNotBlank(colList.get(0))) {
					cell5x.setCellValue(colList.get(0));
				}
			}
			cell6x.setCellStyle(styleAlign);
			if(colList.size() > 1) {
				if(StringUtils.isNotBlank(colList.get(1))) {
					cell6x.setCellValue(colList.get(1));
				}
			}
			cell7x.setCellStyle(styleAlign);
			if(colList.size() > 2) {
				if(StringUtils.isNotBlank(colList.get(2))) {
					cell7x.setCellValue(colList.get(2));
				}
			}
			cell8x.setCellStyle(styleAlign);
			if(colList.size() > 3) {
				if(StringUtils.isNotBlank(colList.get(3))) {
					cell8x.setCellValue(colList.get(3));
				}
			}
		}
		/**==========================5.输出============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/**==================================================================*/
	}
	public static void addMergeCellToUtil(HSSFSheet sheet,int rowBegin,int rowEnd,int colBegin,int colEnd) {
		CellRangeAddress cellRangeAddress = new CellRangeAddress(rowBegin,rowEnd,colBegin,colEnd);
		sheet.addMergedRegion(cellRangeAddress);
	}
}
