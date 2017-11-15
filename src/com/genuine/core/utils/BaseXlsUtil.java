package com.genuine.core.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class BaseXlsUtil {
	
	//�ϲ���Ԫ�񷽷�
	public static void addMergeCellToUtil(HSSFSheet sheet,int rowBegin,int rowEnd,int colBegin,int colEnd) {
		CellRangeAddress cellRangeAddress = new CellRangeAddress(rowBegin,rowEnd,colBegin,colEnd);
		sheet.addMergedRegion(cellRangeAddress);
	}
	//���ͨ����ʽ
	public static HSSFCellStyle addStyleAlign(HSSFWorkbook workbook,short fontSize,boolean isWrapText,boolean isBold) {
		//��ֱˮƽ������ʽ
		HSSFCellStyle styleAlign = workbook.createCellStyle();
		/**================================ ͨ���ַ���ʽ===========================**/
		//����
		styleAlign.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		styleAlign.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		//��������
		HSSFFont fontGenneral = workbook.createFont();
		fontGenneral.setFontHeightInPoints(fontSize);
		fontGenneral.setFontName("Times New Roman");
		if(isBold) {
			fontGenneral.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//�Ӵ����� 
		}
		//���
		styleAlign.setFont(fontGenneral);
		styleAlign.setWrapText(isWrapText);
		/**================================ ͨ���ַ���ʽ===========================**/
		return styleAlign;
	}

}
