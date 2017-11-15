package com.genuine.core.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class BaseXlsUtil {
	
	//合并单元格方法
	public static void addMergeCellToUtil(HSSFSheet sheet,int rowBegin,int rowEnd,int colBegin,int colEnd) {
		CellRangeAddress cellRangeAddress = new CellRangeAddress(rowBegin,rowEnd,colBegin,colEnd);
		sheet.addMergedRegion(cellRangeAddress);
	}
	//添加通用样式
	public static HSSFCellStyle addStyleAlign(HSSFWorkbook workbook,short fontSize,boolean isWrapText,boolean isBold) {
		//垂直水平居中样式
		HSSFCellStyle styleAlign = workbook.createCellStyle();
		/**================================ 通用字符格式===========================**/
		//居中
		styleAlign.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		styleAlign.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		//字体设置
		HSSFFont fontGenneral = workbook.createFont();
		fontGenneral.setFontHeightInPoints(fontSize);
		fontGenneral.setFontName("Times New Roman");
		if(isBold) {
			fontGenneral.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//加粗字体 
		}
		//添加
		styleAlign.setFont(fontGenneral);
		styleAlign.setWrapText(isWrapText);
		/**================================ 通用字符格式===========================**/
		return styleAlign;
	}

}
