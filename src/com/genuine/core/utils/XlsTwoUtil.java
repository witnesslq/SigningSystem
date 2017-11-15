package com.genuine.core.utils;

import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheettwo;

public class XlsTwoUtil extends BaseXlsUtil{
	
	@Test
	public static void exportXlsTwo(OutputStream outputStream,List<List<TSheettwo>>sheetTwoList, List<School> schoolList) {
		/**==========================1.����������============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.����������============================*/
		HSSFSheet sheet = workbook.createSheet();
		//�ϲ���Ԫ��
		//ԺУ234
		addMergeCellToUtil(sheet, 1, 3, 0, 0);
			addMergeCellToUtil(sheet, 0, 0, 0, 22);
			//����1��24AB 24C 24V 24W
			addMergeCellToUtil(sheet, 1, 3, 1, 2);
			addMergeCellToUtil(sheet, 1, 3, 3, 3);
			addMergeCellToUtil(sheet, 1, 3, 22, 22);
			//����2��2DE 2FU
			addMergeCellToUtil(sheet, 1, 1, 4, 5);
			addMergeCellToUtil(sheet, 1, 1, 6, 21);
			//����3��34D 34E 34F 34G---for
			for(int i=4; i<=7; i++) {
				addMergeCellToUtil(sheet, 2, 3, i, i);
			}
			//����4��3HK 3LO 3PR 3SU
			addMergeCellToUtil(sheet, 2, 2, 8, 11);
			addMergeCellToUtil(sheet, 2, 2, 12, 15);
			addMergeCellToUtil(sheet, 2, 2, 16, 18);
			addMergeCellToUtil(sheet, 2, 2, 19, 21);
			//����5��4H 4I 4J 4K 4L 4M 4N 4O 4P 4Q 4R 4S 4T 4U---for
			for(int i=8; i<=21; i++) {
				addMergeCellToUtil(sheet, 3, 3, i, i);
			}
			//����6��5AB �� 5C------------------W
			addMergeCellToUtil(sheet, 4, 4, 1, 2);
			for(int i=3; i<=23; i++) {
				addMergeCellToUtil(sheet, 4, 4, i, i);
			}
		/**==========================3.������================================*/
		/*=========================��ͷ����������============================*/
		//������
		HSSFRow rowHeader = sheet.createRow(0);
		// 2��ʼ�к�
		HSSFRow row2 = sheet.createRow(1);

		// 3��ʼ�к�
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short)(38*51.25));
		// 4��ʼ�к�
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short)(31*51.25));
		// 5��ʼ�к�
		HSSFRow row5 = sheet.createRow(4);
		/*=========================��ͷ����������============================*/
		
		/**==========================4.������Ԫ��============================*/
		/*=========================��ͷ����������============================*/
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader.setCellStyle(addStyleAlign(workbook, (short)20,false,true));
		cellHeader.setCellValue("2017��ȫ����У��ְ����Ա����ṹ�͵���֯����״��ͳ�Ʊ������");
		//234A
		HSSFCell cellType = row2.createCell(0);
		cellType.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
		cellType.setCellValue("ԺУ");
		//����1-����2
		HSSFCell cell2 = null;
		int textCol[] = new int[]{3,4,6,22};
		String textContent[] = new String[]{"���","��ְ����","ר�ν�ʦ��Ա����ṹ","��������Ա��Ա����"};
		for(int i=0; i<textCol.length; i++) {
			cell2 = row2.createCell(textCol[i]);
			cell2.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell2.setCellValue(textContent[i]);
		}
		//����3-����4
		HSSFCell cell3 = null;
		int textCol34[] = new int[]{4,5,6,7,8,12,16,19};
		String textContent34[] = new String[]{"��ְ������","���У���Ա����","ר�ν�ʦ����","���У�35�꼰���������ʦ��","ר�ν�ʦ��Ա��","�ǵ���ʦ�����뵳���","ר�ν�ʦ��Աְ�ƽṹ","ר�ν�ʦ��Աѧ���ṹ"};
		for(int i=0; i<textCol34.length; i++) {
			cell3 = row3.createCell(textCol34[i]);
			cell3.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell3.setCellValue(textContent34[i]);
		}
		//����5
		HSSFCell cell5 = null;
		String textContent5[] = new String[]{"��Ա����","35�꼰���µ�Ա��","���귢չ��Ա��","ר�ν�ʦ��Առר�ν�ʦ������","�ǵ�Ա��","�ǵ���ʦ�����뵳��Ա��","�뵳����������","�ǵ���ʦ�������뵳��Ա������","���߼�","���߼�","����","��ʿ","˶ʿ","����"};
		for(int i=8; i<=21; i++) {
			cell5 = row4.createCell(i);
			cell5.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell5.setCellValue(textContent5[i-8]);
		}
		//����6
		HSSFCell cell6 = null;
		HSSFCell cell6AB = null;
		cell6AB = row5.createCell(1);
		cell6AB.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
		cell6AB.setCellValue("��");
		for(int i=3; i<=22; i++) {
			if(i == 3) {
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell6.setCellValue("��");
			}else{
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell6.setCellValue(i-3);
			}
		}
		/*=========================��ͷ����������============================*/
		/**==========================������������================================*/
		int line = 5;
		int count = 1;
		for(int i=0; i<sheetTwoList.size(); i++) {
					/**==============����������=============*/
			//�ܼ���  
			addMergeCellToUtil(sheet, line, line, 1, 2);
			HSSFRow row6 = sheet.createRow(line);
			HSSFCell cell6BC = row6.createCell(1);
			cell6BC.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6BC.setCellValue("�ܼ�");
			HSSFCell cell6D = row6.createCell(3);
			cell6D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6D.setCellValue("01");
			//����������
			addMergeCellToUtil(sheet, line+1, line+1, 1, 2);
			HSSFRow row7 = sheet.createRow(line+1);
			HSSFCell cell7BC = row7.createCell(1);
			cell7BC.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7BC.setCellValue("����������������");
			HSSFCell cell7D = row7.createCell(3);
			cell7D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7D.setCellValue("02");
			//Ů��������
			addMergeCellToUtil(sheet, line+2, line+2, 1, 2);
			HSSFRow row8 = sheet.createRow(line+2);
			HSSFCell cell8BC = row8.createCell(1);
			cell8BC.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8BC.setCellValue("����Ů������");
			HSSFCell cell8D = row8.createCell(3);
			cell8D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8D.setCellValue("03");	
			//�ϼ�
			addMergeCellToUtil(sheet, line+3, line+5, 1, 1);
			HSSFRow row9 = sheet.createRow(line+3);
			HSSFCell cell91011B = row9.createCell(1);
			cell91011B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell91011B.setCellValue("�ϼ�");
			//��ͨ����ԺУ
			addMergeCellToUtil(sheet, line+3, line+3, 2, 2);
			HSSFCell cell9C = row9.createCell(2);
			cell9C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9C.setCellValue("��ͨ����ԺУ");
			addMergeCellToUtil(sheet, line+4, line+4, 2, 2);
			HSSFCell cell9D = row9.createCell(3);
			cell9D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9D.setCellValue("04");	
			//	ר��
			HSSFRow row10 = sheet.createRow(line+4);
			HSSFCell cell10C = row10.createCell(2);
			cell10C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell10C.setCellValue("ר��ԺУ����ְҵ����ѧԺ��");
			HSSFCell cell10D = row10.createCell(3);
			cell10D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell10D.setCellValue("05");
			// ���
			addMergeCellToUtil(sheet, line+5, line+5, 2, 2);
			HSSFRow row11 = sheet.createRow(line+5);
			HSSFCell cell11C = row11.createCell(2);
			cell11C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell11C.setCellValue("����У��������ѧԺ��");
			HSSFCell cell11D = row11.createCell(3);
			cell11D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell11D.setCellValue("06");
					/**==============����������=============*/
					/**==============����������=============*/
			//ѧУ���� ��
			addMergeCellToUtil(sheet, line, line+5, 0, 0);   
			//�õ�ѧУ�б��ѧУ����
			String schoolName = count + "." +schoolList.get(i).getS_Name();//bug1
			HSSFCell cell611A = row6.createCell(0);
			cell611A.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell611A.setCellValue(schoolName);
			System.out.println("--------------------"+schoolName);
			//���������ݵķ�װ����
			//�õ�����б�
			List<TSheettwo> sheetList = sheetTwoList.get(i);
			for(int j=4; j<23; j++) {
				HSSFCell cell6x = row6.createCell(j);
				HSSFCell cell7x = row7.createCell(j);
				HSSFCell cell8x = row8.createCell(j);
				cell6x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				if(sheetList.get(j-4).getAmount() != null) {
					cell6x.setCellValue(sheetList.get(j-4).getAmount());
				}
				if(sheetList.get(j-4).getFewSum() != null) {
					cell7x.setCellValue(sheetList.get(j-4).getFewSum());
				}
				if(sheetList.get(j-4).getGrilSum() != null) {
					cell8x.setCellValue(sheetList.get(j-4).getGrilSum());
				}
				//����ѧУ����
				if("0".equals(sheetList.get(j-4).getSchoolState())) {
					HSSFCell cell9x = row9.createCell(j);
					cell9x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
					if(sheetList.get(j-4).getAmount() != null) {
						cell9x.setCellValue(sheetList.get(j-4).getAmount());
					}
				}else if("1".equals(sheetList.get(j-4).getSchoolState())) {
					HSSFCell cell10x = row10.createCell(j);
					cell10x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
					if(sheetList.get(j-4).getAmount() != null) {
						cell10x.setCellValue(sheetList.get(j-4).getAmount());
					}
				}else if("2".equals(sheetList.get(j-4).getSchoolState())){
					HSSFCell cell11x = row11.createCell(j);
					cell11x.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
					if(sheetList.get(j-4).getAmount() != null) {
						cell11x.setCellValue(sheetList.get(j-4).getAmount());
					}
				}
			}
					/**==============����������=============*/
			line = line + 6;
			count++;
		}
		/**==========================������������================================*/
		/**==========================5.���============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
