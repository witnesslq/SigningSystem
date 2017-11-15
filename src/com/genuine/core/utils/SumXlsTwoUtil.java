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
		/** ==========================1.创建工作簿============================ */
		HSSFWorkbook workbook = new HSSFWorkbook();
		/** ==========================2.创建工作表============================ */
		HSSFSheet sheet = workbook.createSheet();
		// 合并单元格
		// 院校234
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

		/** ==========================3.创建行================================ */
		/* =========================标头死数据区域============================ */
		// 标题行
		HSSFRow rowHeader = sheet.createRow(0);
		// 2起始行号
		HSSFRow row2 = sheet.createRow(1);

		// 3起始行号
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short) (38 * 51.25));
		// 4起始行号
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short) (31 * 51.25));
		// 5起始行号
		HSSFRow row5 = sheet.createRow(4);
		/* =========================标头死数据区域============================ */

		/** ==========================4.创建单元格============================ */
		/* =========================标头死数据区域============================ */
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader
				.setCellStyle(addStyleAlign(workbook, (short) 20, false, true));
		cellHeader.setCellValue("2017年全国高校教职工党员队伍结构和党组织基本状况统计表（表二）");

		// 类型1-类型2
		HSSFCell cell2 = null;
		int textCol[] = new int[] { 2, 3, 5, 21 };
		String textContent[] = new String[] { "编号", "教职工数", "专任教师党员队伍结构","离退休人员党员总数" };
		for (int i = 0; i < textCol.length; i++) {
			cell2 = row2.createCell(textCol[i]);
			cell2.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell2.setCellValue(textContent[i]);
		}
		// 类型3-类型4
		HSSFCell cell3 = null;
		int textCol34[] = new int[] { 3, 4, 5, 6, 7, 11, 15, 18 };
		String textContent34[] = new String[] { "教职工总数", "其中：党员总数", "专任教师总数",
				"其中：35岁及以下青年教师数", "专任教师党员数", "非党教师申请入党情况", "专任教师党员职称结构",
				"专任教师党员学历结构" };
		for (int i = 0; i < textCol34.length; i++) {
			cell3 = row3.createCell(textCol34[i]);
			cell3.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell3.setCellValue(textContent34[i]);
		}
		// 类型5
		HSSFCell cell5 = null;
		String textContent5[] = new String[] { "党员总数", "35岁及以下党员数", "当年发展党员数",
				"专任教师党员占专任教师比例％", "非党员数", "非党教师申请入党人员数", "入党积极分子数",
				"非党教师中申请入党人员比例％", "正高级", "副高级", "其他", "博士", "硕士", "其他" };
		for (int i = 7; i <= 20; i++) {
			cell5 = row4.createCell(i);
			cell5.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
			cell5.setCellValue(textContent5[i - 7]);
		}
		// 类型6
		HSSFCell cell6 = null;
		HSSFCell cell6AB = null;
		cell6AB = row5.createCell(0);
		cell6AB.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell6AB.setCellValue("甲");
		for (int i = 2; i <= 21; i++) {
			if (i == 2) {
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell6.setCellValue("乙");
			} else {
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short) 12, true,
						false));
				cell6.setCellValue(i - 2);
			}
		}
		/* =========================标头死数据区域============================ */
		/** ==========================迭代数据区域================================ */
		/** ==============死数据区域============= */
		// 总计行
		HSSFRow row6 = sheet.createRow(5);
		HSSFCell cell6BC = row6.createCell(0);
		cell6BC.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell6BC.setCellValue("总计");
		HSSFCell cell6D = row6.createCell(2);
		cell6D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell6D.setCellValue("01");
		// 少数民族行
		HSSFRow row7 = sheet.createRow(6);
		HSSFCell cell7BC = row7.createCell(0);
		cell7BC.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell7BC.setCellValue("其中少数民族数量");
		HSSFCell cell7D = row7.createCell(2);
		cell7D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell7D.setCellValue("02");
		// 女性数量行
		HSSFRow row8 = sheet.createRow(7);
		HSSFCell cell8BC = row8.createCell(0);
		cell8BC.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell8BC.setCellValue("其中女性数量");
		HSSFCell cell8D = row8.createCell(2);
		cell8D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell8D.setCellValue("03");
		// 合计
		HSSFRow row9 = sheet.createRow(8);
		HSSFCell cell91011B = row9.createCell(0);
		cell91011B
				.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell91011B.setCellValue("合计");
		// 普通本科院校
		HSSFCell cell9C = row9.createCell(1);
		cell9C.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell9C.setCellValue("普通本科院校");
		HSSFCell cell9D = row9.createCell(2);
		cell9D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell9D.setCellValue("04");
		// 专科
		HSSFRow row10 = sheet.createRow(9);
		HSSFCell cell10C = row10.createCell(1);
		cell10C.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell10C.setCellValue("专科院校（含职业技术学院）");
		HSSFCell cell10D = row10.createCell(2);
		cell10D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell10D.setCellValue("05");
		// 民办
		HSSFRow row11 = sheet.createRow(10);
		HSSFCell cell11C = row11.createCell(1);
		cell11C.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell11C.setCellValue("民办高校（含独立学院）");
		HSSFCell cell11D = row11.createCell(2);
		cell11D.setCellStyle(addStyleAlign(workbook, (short) 12, true, false));
		cell11D.setCellValue("06");
		/** ==============死数据区域============= */
		/** ==============活数据区域============= */
		System.out.println(sheetTwoList);
		// 块区域数据的封装问题
		// 拿到表二列表
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
				// 关于学校设置

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
				// 关于学校设置

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
		/** ==============活数据区域============= */
		/** ==========================迭代数据区域================================ */
		/** ==========================5.输出============================ */
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
