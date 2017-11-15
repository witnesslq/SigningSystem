package com.genuine.core.utils;

import java.io.OutputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class SumXlsTwoUtil extends BaseXlsUtil {

	@Test
	public static void exportXlsTwo(OutputStream outputStream,
			List<List<String>> sheetTwoList) {
		/** ==========================1.����������============================ */
		HSSFWorkbook workbook = new HSSFWorkbook();
		/** ==========================2.����������============================ */
		HSSFSheet sheet = workbook.createSheet();
		// �ϲ���Ԫ��
		// ԺУ234
		addMergeCellToUtil(sheet, 0, 0, 0, 21);
		addMergeCellToUtil(sheet, 1, 3, 0, 1);
		addMergeCellToUtil(sheet, 1, 1, 3, 4);
		addMergeCellToUtil(sheet, 1, 1, 5, 20);
		addMergeCellToUtil(sheet, 2, 2, 7, 10);
		addMergeCellToUtil(sheet, 2, 2, 11, 14);
		addMergeCellToUtil(sheet, 2, 2, 15, 17);
		addMergeCellToUtil(sheet, 2, 2, 18, 20);
		addMergeCellToUtil(sheet, 1, 3, 2, 2);
		addMergeCellToUtil(sheet, 1, 3, 21, 21);
		for (int i = 3; i <= 6; i++) {
			addMergeCellToUtil(sheet, 2, 3, i, i);
		}
		addMergeCellToUtil(sheet, 4, 4, 0, 1);
		addMergeCellToUtil(sheet, 5, 5, 0, 1);
		addMergeCellToUtil(sheet, 6, 6, 0, 1);
		addMergeCellToUtil(sheet, 7, 7, 0, 1);
		addMergeCellToUtil(sheet, 8, 10, 0, 0);

		/** ==========================3.������================================ */
		/* =========================��ͷ����������============================ */
		// ������
		HSSFRow rowHeader = sheet.createRow(0);
		// 2��ʼ�к�
		HSSFRow row2 = sheet.createRow(1);

		// 3��ʼ�к�
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short) (38 * 51.25));
		// 4��ʼ�к�
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short) (31 * 51.25));
		// 5��ʼ�к�
		HSSFRow row5 = sheet.createRow(4);
		/* =========================��ͷ����������============================ */

		/** ==========================4.������Ԫ��============================ */
		/* =========================��ͷ����������============================ */
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader
				.setCellStyle(addStyleAlign(workbook, (short) 20, false, true));
		cellHeader.setCellValue("2017��ȫ����У��ְ����Ա����ṹ�͵���֯����״��ͳ�Ʊ������");

		// ����1-����2
		HSSFCell cell2 = null;
		int textCol[] = new int[] { 2, 3, 5, 21 };
		String textContent[] = new String[] { "���", "��ְ����", "ר�ν�ʦ��Ա����ṹ","��������Ա��Ա����" };
		for (int i = 0; i < textCol.length; i++) {
			cell2 = row2.createCell(textCol[i]);
			cell2.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell2.setCellValue(textContent[i]);
		}
		// ����3-����4
		HSSFCell cell3 = null;
		int textCol34[] = new int[] { 3, 4, 5, 6, 7, 11, 15, 18 };
		String textContent34[] = new String[] { "��ְ������", "���У���Ա����", "ר�ν�ʦ����",
				"���У�35�꼰���������ʦ��", "ר�ν�ʦ��Ա��", "�ǵ���ʦ�����뵳���", "ר�ν�ʦ��Աְ�ƽṹ",
				"ר�ν�ʦ��Աѧ���ṹ" };
		for (int i = 0; i < textCol34.length; i++) {
			cell3 = row3.createCell(textCol34[i]);
			cell3.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell3.setCellValue(textContent34[i]);
		}
		// ����5
		HSSFCell cell5 = null;
		String textContent5[] = new String[] { "��Ա����", "35�꼰���µ�Ա��", "���귢չ��Ա��",
				"ר�ν�ʦ��Առר�ν�ʦ������", "�ǵ�Ա��", "�ǵ���ʦ�����뵳��Ա��", "�뵳����������",
				"�ǵ���ʦ�������뵳��Ա������", "���߼�", "���߼�", "����", "��ʿ", "˶ʿ", "����" };
		for (int i = 7; i <= 20; i++) {
			cell5 = row4.createCell(i);
			cell5.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell5.setCellValue(textContent5[i - 7]);
		}
		// ����6
		HSSFCell cell6 = null;
		HSSFCell cell6AB = null;
		cell6AB = row5.createCell(0);
		cell6AB.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell6AB.setCellValue("��");
		for (int i = 2; i <= 21; i++) {
			if (i == 2) {
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell6.setCellValue("��");
			} else {
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell6.setCellValue(i - 2);
			}
		}
		/* =========================��ͷ����������============================ */
		/** ==========================������������================================ */
		/** ==============����������============= */
		// �ܼ���
		HSSFRow row6 = sheet.createRow(5);
		HSSFCell cell6BC = row6.createCell(0);
		cell6BC.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell6BC.setCellValue("�ܼ�");
		HSSFCell cell6D = row6.createCell(2);
		cell6D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell6D.setCellValue("01");
		// ����������
		HSSFRow row7 = sheet.createRow(6);
		HSSFCell cell7BC = row7.createCell(0);
		cell7BC.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell7BC.setCellValue("����������������");
		HSSFCell cell7D = row7.createCell(2);
		cell7D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell7D.setCellValue("02");
		// Ů��������
		HSSFRow row8 = sheet.createRow(7);
		HSSFCell cell8BC = row8.createCell(0);
		cell8BC.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell8BC.setCellValue("����Ů������");
		HSSFCell cell8D = row8.createCell(2);
		cell8D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell8D.setCellValue("03");
		// �ϼ�
		HSSFRow row9 = sheet.createRow(8);
		HSSFCell cell91011B = row9.createCell(0);
		cell91011B
				.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell91011B.setCellValue("�ϼ�");
		// ��ͨ����ԺУ
		HSSFCell cell9C = row9.createCell(1);
		cell9C.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell9C.setCellValue("��ͨ����ԺУ");
		HSSFCell cell9D = row9.createCell(2);
		cell9D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell9D.setCellValue("04");
		// ר��
		HSSFRow row10 = sheet.createRow(9);
		HSSFCell cell10C = row10.createCell(1);
		cell10C.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell10C.setCellValue("ר��ԺУ����ְҵ����ѧԺ��");
		HSSFCell cell10D = row10.createCell(2);
		cell10D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell10D.setCellValue("05");
		// ���
		HSSFRow row11 = sheet.createRow(10);
		HSSFCell cell11C = row11.createCell(1);
		cell11C.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell11C.setCellValue("����У��������ѧԺ��");
		HSSFCell cell11D = row11.createCell(2);
		cell11D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell11D.setCellValue("06");
		/** ==============����������============= */
		/** ==============����������============= */
		System.out.println(sheetTwoList);
		// ���������ݵķ�װ����
		// �õ�����б�
		for (int i = 0; i < sheetTwoList.size(); i++) {
			List<String> colList = sheetTwoList.get(i);
			if (i == 7 || i == 11) {
				HSSFCell cell6x = row6.createCell(i + 3);
				HSSFCell cell7x = row7.createCell(i + 3);
				HSSFCell cell8x = row8.createCell(i + 3);
				cell6x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (colList.get(0) != null) {
					if (colList.get(0).length() > 5) {
						cell6x.setCellValue(colList.get(0).substring(0, 5));
					}else{
						cell6x.setCellValue(colList.get(0));
					}
				}
				if (colList.get(1) != null) {
					if (colList.get(1).length() > 5) {
						cell7x.setCellValue(colList.get(1).substring(0, 5));
					}else{
						cell7x.setCellValue(colList.get(1));
					}
				}
				if (colList.get(2) != null) {
					if (colList.get(2).length() > 5) {
						cell8x.setCellValue(colList.get(2).substring(0, 5));
					}else{
						cell8x.setCellValue(colList.get(2));
					}
				}
				// ����ѧУ����

				HSSFCell cell9x = row9.createCell(i + 3);
				cell9x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (StringUtils.isNotBlank(colList.get(3))) {
					if(colList.get(3).length()>5) {
						cell9x.setCellValue(colList.get(3).substring(0, 5));
					}else{
						cell9x.setCellValue(colList.get(3));
					}
				}

				HSSFCell cell10x = row10.createCell(i + 3);
				cell10x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (StringUtils.isNotBlank(colList.get(4))) {
					if(colList.get(4).length() >5) {
						cell10x.setCellValue(colList.get(4).substring(0,5));
					}else{
						cell10x.setCellValue(colList.get(4));
					}
				}
				HSSFCell cell11x = row11.createCell(i + 3);
				cell11x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (StringUtils.isNotBlank(colList.get(5))) {
					if(colList.get(5).length()>5) {
						cell11x.setCellValue(colList.get(5).substring(0, 5));
					}else{
						cell11x.setCellValue(colList.get(5));
					}
				}
			} else {
				HSSFCell cell6x = row6.createCell(i + 3);
				HSSFCell cell7x = row7.createCell(i + 3);
				HSSFCell cell8x = row8.createCell(i + 3);
				cell6x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell7x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell8x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (colList.get(0) != null) {
					cell6x.setCellValue(colList.get(0).substring(0,colList.get(0).indexOf(".") ));
				}
				if (colList.get(1) != null) {
					cell7x.setCellValue(colList.get(1).substring(0,colList.get(1).indexOf(".") ));
				}
				if (colList.get(2) != null) {
					cell8x.setCellValue(colList.get(2).substring(0,colList.get(2).indexOf(".") ));
				}
				// ����ѧУ����

				HSSFCell cell9x = row9.createCell(i + 3);
				cell9x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (StringUtils.isNotBlank(colList.get(3))) {
					cell9x.setCellValue(colList.get(3).substring(0,colList.get(3).indexOf(".") ));
				}

				HSSFCell cell10x = row10.createCell(i + 3);
				cell10x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (StringUtils.isNotBlank(colList.get(4))) {
					cell10x.setCellValue(colList.get(4).substring(0,colList.get(4).indexOf(".") ));
				}
				HSSFCell cell11x = row11.createCell(i + 3);
				cell11x.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				if (StringUtils.isNotBlank(colList.get(5))) {
					cell11x.setCellValue(colList.get(5).substring(0,colList.get(5).indexOf(".") ));
				}
			}
		}
		/** ==============����������============= */
		/** ==========================������������================================ */
		/** ==========================5.���============================ */
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
