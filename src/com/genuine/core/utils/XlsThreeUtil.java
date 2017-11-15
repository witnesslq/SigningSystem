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
		/**==========================1.����������============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.����������============================*/
		HSSFSheet sheet = workbook.createSheet();
		//�ϲ���Ԫ��
		//type1��
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
		
		/**==========================3.������================================*/
		/*=========================��ͷ����������============================*/
		HSSFRow row1 = sheet.createRow(0);
		HSSFRow row2 = sheet.createRow(1);
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short)(8.75*51.25));
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short)(24.75*51.25));
		HSSFRow row5 = sheet.createRow(4);
		/*=========================��ͷ����������============================*/
		
		/**==========================4.������Ԫ��============================*/
		/*=========================��ͷ����������============================*/
		HSSFCell cell016 = row1.createCell(1);
		cell016.setCellStyle(addStyleAlign(workbook, (short)20, false, true));
		cell016.setCellValue("2017��ȫ����Уѧ����Ա����ṹ�͵���֯����״��ͳ�Ʊ�������");  //type1
		HSSFCell cell135 = row2.createCell(5);
		cell135.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type3
		cell135.setCellValue("���");
		HSSFCell cell1616 = row2.createCell(6);
		cell1616.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type4
		cell1616.setCellValue("��У����Ա����ṹ");
		HSSFCell cell2711 = row3.createCell(7);
		cell2711.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type5
		cell2711.setCellValue("ѧ����Ա���");
		HSSFCell cell21215 = row3.createCell(12);
		cell21215.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type5
		cell21215.setCellValue("�����뵳���");
		HSSFCell cell236 = row3.createCell(6);
		cell236.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
		cell236.setCellValue("��У������");
		HSSFCell cell2316 = row3.createCell(16);
		cell2316.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
		cell2316.setCellValue("ѧ����֧����	");
		//type7
		String strContent[] = new String[]{"��Ա����","Ԥ����Ա","��ʽ��Ա","���귢չ��Ա��","��Առѧ�������ı���","�ǵ�Աѧ����","�����뵳ѧ����","�뵳����������","�ǵ�Աѧ�������뵳����"};
		for(int i=7; i<=15; i++) {
			HSSFCell cell37 = row4.createCell(i);
			cell37.setCellStyle(addStyleAlign(workbook, (short)12, true, false));//type6
			cell37.setCellValue(strContent[i-7]);
		}
		//rowId��
		addMergeCellToUtil(sheet, 4, 4, 1, 4);
		HSSFCell cell5BE = row5.createCell(1);
		cell5BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
		cell5BE.setCellValue("��");
		HSSFCell cell5F = row5.createCell(5);
		cell5F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
		cell5F.setCellValue("��");
		for(int i=1;i<=11; i++) {
			HSSFCell cell5 = row5.createCell(i+5);
			cell5.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell5.setCellValue(i);	
		}
		/*=========================��ͷ����������============================*/
		int line = 5;
		int count = 1;
		for(int i=0; i<sheetThreeList.size(); i++) {
		/**==========================������������================================*/
			//�ϲ���Ԫ��
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
					/**==============����������=============*/
			HSSFCell cell6BE = row6.createCell(1);
			HSSFCell cell6F = row6.createCell(5);
			cell6BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6BE.setCellValue("�ܼ�");
			cell6F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6F.setCellValue("001");
			HSSFCell cell7BE = row7.createCell(1);
			HSSFCell cell7F = row7.createCell(5);
			cell7BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell7BE.setCellValue("����������������");
			cell7F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell7F.setCellValue("002");
			HSSFCell cell8BE = row8.createCell(1);
			HSSFCell cell8F = row8.createCell(5);
			cell8BE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell8BE.setCellValue("����Ů������");
			cell8F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell8F.setCellValue("003");
			HSSFCell cell917B = row9.createCell(1);
			cell917B.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell917B.setCellValue("�ϼ�");
			
			HSSFCell cell911C = row9.createCell(2);
			cell911C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell911C.setCellValue("�о���");
			HSSFCell cell12C = row12.createCell(2);
			cell12C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12C.setCellValue("��ͨ��У��ר��");
			HSSFCell cell15C = row15.createCell(2);
			cell15C.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15C.setCellValue("����У��������ѧԺ����ר��");
			//��ѭ������
			HSSFRow row10 = sheet.createRow(line+4);
			HSSFRow row11 = sheet.createRow(line+5);
			HSSFCell cell9DE = row9.createCell(3);
			HSSFCell cell9F = row9.createCell(5);
			cell9DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell9DE.setCellValue("С��");
			cell9F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell9F.setCellValue("004");
			HSSFCell cell10DE = row10.createCell(3);
			HSSFCell cell10F = row10.createCell(5);
			cell10DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell10DE.setCellValue("��ʿ");
			cell10F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell10F.setCellValue("005");
			HSSFCell cell11DE = row11.createCell(3);
			HSSFCell cell11F = row11.createCell(5);
			cell11DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell11DE.setCellValue("˶ʿ");
			cell11F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell11F.setCellValue("006");
			
			HSSFRow row13 = sheet.createRow(line+7);
			HSSFRow row14 = sheet.createRow(line+8);
			HSSFCell cell12DE = row12.createCell(3);
			HSSFCell cell12F = row12.createCell(5);
			cell12DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12DE.setCellValue("С��");
			cell12F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell12F.setCellValue("007");
			HSSFCell cell13DE = row13.createCell(3);
			HSSFCell cell13F = row13.createCell(5);
			cell13DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell13DE.setCellValue("����");
			cell13F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell13F.setCellValue("008");
			HSSFCell cell14DE = row14.createCell(3);
			HSSFCell cell14F = row14.createCell(5);
			cell14DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell14DE.setCellValue("ר��");
			cell14F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell14F.setCellValue("009");
			HSSFRow row16 = sheet.createRow(line+10);
			HSSFRow row17 = sheet.createRow(line+11);
			HSSFCell cell15DE = row15.createCell(3);
			HSSFCell cell15F = row15.createCell(5);
			cell15DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15DE.setCellValue("С��");
			cell15F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell15F.setCellValue("010");
			HSSFCell cell16DE = row16.createCell(3);
			HSSFCell cell16F = row16.createCell(5);
			cell16DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell16DE.setCellValue("����");
			cell16F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell16F.setCellValue("011");
			HSSFCell cell17DE = row17.createCell(3);
			HSSFCell cell17F = row17.createCell(5);
			cell17DE.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell17DE.setCellValue("ר��");
			cell17F.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell17F.setCellValue("012");
					/**==============����������=============*/
					/**==============����������=============*/
			//ѧУ������д
			String schoolName = count+"."+schoolList.get(i).getS_Name();
			HSSFCell cell6xHeader = row6.createCell(0);
			cell6xHeader.setCellStyle(addStyleAlign(workbook, (short)12, true, false));
			cell6xHeader.setCellValue(schoolName);
			//�õ��������
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
					/**==============����������=============*/
		/**==========================������������================================*/
			line = line + 12;
			count++;
		}
		/**==========================5.���============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
