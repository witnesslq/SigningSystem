package com.genuine.core.utils;

import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetfive;

public class XlsFiveUtil extends BaseXlsUtil {

	@Test
	public static void exportXlsFive(OutputStream outputStream,
			List<List<TSheetfive>> sheetFiveList, List<School> schoolList) {
		/** ==========================1.创建工作簿============================ */
		HSSFWorkbook workbook = new HSSFWorkbook();
		/** ==========================2.创建工作表============================ */
		HSSFSheet sheet = workbook.createSheet();
		// 合并单元格
		addMergeCellToUtil(sheet, 0, 0, 0, 9);
		addMergeCellToUtil(sheet, 1, 3, 0, 0);
		addMergeCellToUtil(sheet, 1, 3, 1, 1);
		addMergeCellToUtil(sheet, 1, 3, 2, 2);
		addMergeCellToUtil(sheet, 1, 2, 3, 6);
		addMergeCellToUtil(sheet, 1, 2, 7, 9);
		/** ==========================3.创建行================================ */
		// 所有不变数据区
		HSSFRow row1 = sheet.createRow(0);
		HSSFCell cell1AJ = row1.createCell(0);
		cell1AJ.setCellStyle(addStyleAlign(workbook, (short) 12, false, true));
		cell1AJ.setCellValue("2017年全国高校与党组织失去联系党员规范管理及组织处置情况汇总表（表五）	");
		HSSFRow row2 = sheet.createRow(1);
		HSSFCell cell24C = row2.createCell(2);
		cell24C.setCellStyle(addStyleAlign(workbook, (short) 12, false, false));
		cell24C.setCellValue("编号");
		HSSFCell cell23DG = row2.createCell(3);
		cell23DG.setCellStyle(addStyleAlign(workbook, (short) 12, false, false));
		cell23DG.setCellValue("规范管理情况");
		HSSFCell cell23HJ = row2.createCell(7);
		cell23HJ.setCellStyle(addStyleAlign(workbook, (short) 12, false, false));
		cell23HJ.setCellValue("组织处理情况");
		String contentStr[] = new String[] { "纳入组织管理", "取消预备党员资格", "保留组织关系",
				"停止党籍", "限期改正", "退党除名", "自行脱党除名" };
		HSSFRow row4 = sheet.createRow(3);
		for (int i = 3; i <= 9; i++) {
			HSSFCell cell4X = row4.createCell(i);
			cell4X.setCellStyle(addStyleAlign(workbook, (short) 12, true,
					false));
			cell4X.setCellValue(contentStr[i - 3]);
		}
		HSSFRow row5 = sheet.createRow(4);
		String header[] = new String[] { "甲", "乙", "1", "2", "3", "4", "5",
				"6", "7" };
		for (int i = 1; i <= 9; i++) {
			HSSFCell cell5X = row5.createCell(i);
			cell5X.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell5X.setCellValue(header[i - 1]);
		}
		/* =========================标头死数据区域============================ */
		/* =========================标头死数据区域============================ */
		/** ==================4.创建单元格。迭代数据区域================================ */
		int line = 5;
		for (int i = 0; i < sheetFiveList.size(); i++) {
			 	addMergeCellToUtil(sheet, line, line+4, 0, 0);
			HSSFRow row6x = sheet.createRow(line);
			HSSFRow row7x = sheet.createRow(line + 1);
			HSSFRow row8x = sheet.createRow(line + 2);
			HSSFRow row9x = sheet.createRow(line + 3);
			HSSFRow row10x = sheet.createRow(line + 4);
			/** ==============死数据区域============= */
			HSSFCell cell6B = row6x.createCell(1);
			HSSFCell cell6C = row6x.createCell(2);
			cell6B.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell6B.setCellValue("总计");
			cell6C.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell6C.setCellValue("01");
			HSSFCell cell7B = row7x.createCell(1);
			HSSFCell cell7C = row7x.createCell(2);
			cell7B.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell7B.setCellValue("教职工（含解除劳动关系的）");
			cell7C.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell7C.setCellValue("02");
			HSSFCell cell8B = row8x.createCell(1);
			HSSFCell cell8C = row8x.createCell(2);
			cell8B.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell8B.setCellValue("离退休人员");
			cell8C.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell8C.setCellValue("03");
			HSSFCell cell9B = row9x.createCell(1);
			HSSFCell cell9C = row9x.createCell(2);
			cell9B.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell9B.setCellValue("高校毕业生");
			cell9C.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell9C.setCellValue("04");
			HSSFCell cell10B = row10x.createCell(1);
			HSSFCell cell10C = row10x.createCell(2);
			cell10B.setCellStyle(addStyleAlign(workbook, (short) 12, true,
					false));
			cell10B.setCellValue("其他");
			cell10C.setCellStyle(addStyleAlign(workbook, (short) 12, false,
					false));
			cell10C.setCellValue("05");
			/** ==============死数据区域============= */
			/** ==============活数据区域============= */
			// 大学名称区域
			HSSFCell cell6A = row6x.createCell(0);
			cell6A.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			String schoolName = (i+1) + "." + schoolList.get(i).getS_Name();
			cell6A.setCellValue(schoolName);
			// 数据区
			List<TSheetfive> sheetList = sheetFiveList.get(i);
			for (int j = 3; j <= 9; j++) {
				TSheetfive tsf = sheetList.get(j - 3);
				if (tsf.getSum() != null) {
					HSSFCell cell6x = row6x.createCell(j);
					cell6x.setCellStyle(addStyleAlign(workbook, (short) 12,
							true, false));
					cell6x.setCellValue(tsf.getSum() + "");
				}
				if (tsf.getEmp() != null) {
					HSSFCell cell7x = row7x.createCell(j);
					cell7x.setCellStyle(addStyleAlign(workbook, (short) 12,
							true, false));
					cell7x.setCellValue(tsf.getEmp() + "");
				}
				if (tsf.getRetire() != null) {
					HSSFCell cell8x = row8x.createCell(j);
					cell8x.setCellStyle(addStyleAlign(workbook, (short) 12,
							true, false));
					cell8x.setCellValue(tsf.getRetire() + "");
				}
				if (tsf.getGraduate() != null) {
					HSSFCell cell9x = row9x.createCell(j);
					cell9x.setCellStyle(addStyleAlign(workbook, (short) 12,
							true, false));
					cell9x.setCellValue(tsf.getGraduate());
				}
				if (tsf.getOther() != null) {
					HSSFCell cell10x = row10x.createCell(j);
					cell10x.setCellStyle(addStyleAlign(workbook, (short) 12,
							true, false));
					cell10x.setCellValue(tsf.getOther() + "");
				}
			}
			/** ==============活数据区域============= */
			line = line + 5;
		}
		/** ==========================5.输出============================ */
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
