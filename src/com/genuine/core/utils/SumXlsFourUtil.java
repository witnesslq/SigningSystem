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
		/**==========================1.����������============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.����������============================*/
		HSSFSheet sheet = workbook.createSheet();
		//�ϲ���Ԫ��
		
		
		//����
			addMergeCellToUtil(sheet, 0, 0, 0, 13);
			addMergeCellToUtil(sheet, 1, 2, 0, 0);
			addMergeCellToUtil(sheet, 1, 2, 1, 1);
			addMergeCellToUtil(sheet, 1, 2, 2, 2);
			addMergeCellToUtil(sheet, 1, 1, 3, 6);
			addMergeCellToUtil(sheet, 1, 1, 7, 12);
			addMergeCellToUtil(sheet, 1, 2, 13, 13);
			
		/**==========================3.������================================*/
		/*=========================��ͷ����������============================*/
		//������
		HSSFRow rowHeader = sheet.createRow(0);
		// 2��ʼ�к�
		HSSFRow row2 = sheet.createRow(1);

		// 3��ʼ�к�
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short)(50*51.25));
		// 4��ʼ�к�
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short)(10*51.25));
	
		/*=========================��ͷ����������============================*/
		
		/**==========================4.������Ԫ��============================*/
		/*=========================��ͷ����������============================*/
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader.setCellStyle(addStyleAlign(workbook, (short)20,false,true));
		cellHeader.setCellValue("2017��ȫ����У�뵳��֯ʧȥ��ϵ��Ա������ܱ����ģ�");

		//����1
		HSSFCell cell1 = null;
		int textCol[] = new int[]{1,2,3,7,13};
		String textContent[] = new String[]{"���","��ֹ2017��6��30��δȡ����ϵ��Ա����","ʧȥ��ϵʱ��","ʧȥ��ϵ����","һ������ȡ����ϵ��Ա����"};
		for(int i=0; i<textCol.length; i++) {
			cell1 = row2.createCell(textCol[i]);
			cell1.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell1.setCellValue(textContent[i]);
		}
		//����2
		HSSFCell cell2 = null;
		int textCol34[] = new int[]{3,4,5,6,7,8,9,10,11,12};
		String textContent34[] = new String[]{"6�������ϲ���1��","1����5��","6����10��","11�꼰����","��ְ","��ҵ��ȥ����","������λ�ı�","����������","��ס�ظı�","����"};
		for(int i=0; i<textCol34.length; i++) {
			cell2 = row3.createCell(textCol34[i]);
			cell2.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell2.setCellValue(textContent34[i]);	
		}
		//����3
		HSSFCell cell3 = null;
		HSSFCell cell3AB = null;
		cell3AB = row4.createCell(0);
		cell3AB.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
		cell3AB.setCellValue("��");
		for(int i=1; i<=13; i++) {
			if(i == 1) {
				cell3 = row4.createCell(i);
				cell3.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell3.setCellValue("��");
			}else{
				cell3 = row4.createCell(i);
				cell3.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell3.setCellValue(i-1);
			}
		}
		/*=========================��ͷ����������============================*/
		/**==========================������������================================*/
		
					/**==============����������=============*/
			//�ܼ���  		
			HSSFRow row5 = sheet.createRow(4);
			HSSFCell cell5B = row5.createCell(0);
			cell5B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell5B.setCellValue("�ܼ�");
			HSSFCell cell5C = row5.createCell(1);
			cell5C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell5C.setCellValue("01");
			
			//����Ͷ���
			HSSFRow row6 = sheet.createRow(5);
			HSSFCell cell6B = row6.createCell(0);
			cell6B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6B.setCellValue("��ְ����������Ͷ���ϵ�ģ�");
			HSSFCell cell6C = row6.createCell(1);
			cell6C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6C.setCellValue("02");
					
			//��������Ա��			
			HSSFRow row7 = sheet.createRow(6);
			HSSFCell cell7B = row7.createCell(0);
			cell7B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7B.setCellValue("��������Ա");
			HSSFCell cell7C = row7.createCell(1);
			cell7C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7C.setCellValue("03");	
			
			//��У��ҵ����
			HSSFRow row8 = sheet.createRow(7);
			HSSFCell cell8B = row8.createCell(0);
			cell8B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8B.setCellValue("��У��ҵ��");
			HSSFCell cell8C = row8.createCell(1);
			cell8C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8C.setCellValue("04"); 
			
			//������
			HSSFRow row9 = sheet.createRow(8);
			HSSFCell cell9B = row9.createCell(0);
			cell9B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9B.setCellValue("����");
			HSSFCell cell9C = row9.createCell(1);
			cell9C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9C.setCellValue("05"); 
			
					/**==============����������=============*/
					/**==============����������=============*/
		
			//���������ݵķ�װ����
			//�õ������б�
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
			
					/**==============����������=============*/

		/**==========================5.���============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}


