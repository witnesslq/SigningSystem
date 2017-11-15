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
		/**==========================1.创建工作簿============================*/
		HSSFWorkbook workbook = new HSSFWorkbook();
		/**==========================2.创建工作表============================*/
		HSSFSheet sheet = workbook.createSheet();
		//合并单元格
		//院校234
		addMergeCellToUtil(sheet, 1, 3, 0, 0);
			addMergeCellToUtil(sheet, 0, 0, 0, 22);
			//类型1：24AB 24C 24V 24W
			addMergeCellToUtil(sheet, 1, 3, 1, 2);
			addMergeCellToUtil(sheet, 1, 3, 3, 3);
			addMergeCellToUtil(sheet, 1, 3, 22, 22);
			//类型2：2DE 2FU
			addMergeCellToUtil(sheet, 1, 1, 4, 5);
			addMergeCellToUtil(sheet, 1, 1, 6, 21);
			//类型3：34D 34E 34F 34G---for
			for(int i=4; i<=7; i++) {
				addMergeCellToUtil(sheet, 2, 3, i, i);
			}
			//类型4：3HK 3LO 3PR 3SU
			addMergeCellToUtil(sheet, 2, 2, 8, 11);
			addMergeCellToUtil(sheet, 2, 2, 12, 15);
			addMergeCellToUtil(sheet, 2, 2, 16, 18);
			addMergeCellToUtil(sheet, 2, 2, 19, 21);
			//类型5：4H 4I 4J 4K 4L 4M 4N 4O 4P 4Q 4R 4S 4T 4U---for
			for(int i=8; i<=21; i++) {
				addMergeCellToUtil(sheet, 3, 3, i, i);
			}
			//类型6：5AB ， 5C------------------W
			addMergeCellToUtil(sheet, 4, 4, 1, 2);
			for(int i=3; i<=23; i++) {
				addMergeCellToUtil(sheet, 4, 4, i, i);
			}
		/**==========================3.创建行================================*/
		/*=========================标头死数据区域============================*/
		//标题行
		HSSFRow rowHeader = sheet.createRow(0);
		// 2起始行号
		HSSFRow row2 = sheet.createRow(1);

		// 3起始行号
		HSSFRow row3 = sheet.createRow(2);
		row3.setHeight((short)(38*51.25));
		// 4起始行号
		HSSFRow row4 = sheet.createRow(3);
		row4.setHeight((short)(31*51.25));
		// 5起始行号
		HSSFRow row5 = sheet.createRow(4);
		/*=========================标头死数据区域============================*/
		
		/**==========================4.创建单元格============================*/
		/*=========================标头死数据区域============================*/
		HSSFCell cellHeader = rowHeader.createCell(0);
		cellHeader.setCellStyle(addStyleAlign(workbook, (short)20,false,true));
		cellHeader.setCellValue("2017年全国高校教职工党员队伍结构和党组织基本状况统计表（表二）");
		//234A
		HSSFCell cellType = row2.createCell(0);
		cellType.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
		cellType.setCellValue("院校");
		//类型1-类型2
		HSSFCell cell2 = null;
		int textCol[] = new int[]{3,4,6,22};
		String textContent[] = new String[]{"编号","教职工数","专任教师党员队伍结构","离退休人员党员总数"};
		for(int i=0; i<textCol.length; i++) {
			cell2 = row2.createCell(textCol[i]);
			cell2.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell2.setCellValue(textContent[i]);
		}
		//类型3-类型4
		HSSFCell cell3 = null;
		int textCol34[] = new int[]{4,5,6,7,8,12,16,19};
		String textContent34[] = new String[]{"教职工总数","其中：党员总数","专任教师总数","其中：35岁及以下青年教师数","专任教师党员数","非党教师申请入党情况","专任教师党员职称结构","专任教师党员学历结构"};
		for(int i=0; i<textCol34.length; i++) {
			cell3 = row3.createCell(textCol34[i]);
			cell3.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell3.setCellValue(textContent34[i]);
		}
		//类型5
		HSSFCell cell5 = null;
		String textContent5[] = new String[]{"党员总数","35岁及以下党员数","当年发展党员数","专任教师党员占专任教师比例％","非党员数","非党教师申请入党人员数","入党积极分子数","非党教师中申请入党人员比例％","正高级","副高级","其他","博士","硕士","其他"};
		for(int i=8; i<=21; i++) {
			cell5 = row4.createCell(i);
			cell5.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell5.setCellValue(textContent5[i-8]);
		}
		//类型6
		HSSFCell cell6 = null;
		HSSFCell cell6AB = null;
		cell6AB = row5.createCell(1);
		cell6AB.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
		cell6AB.setCellValue("甲");
		for(int i=3; i<=22; i++) {
			if(i == 3) {
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell6.setCellValue("乙");
			}else{
				cell6 = row5.createCell(i);
				cell6.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
				cell6.setCellValue(i-3);
			}
		}
		/*=========================标头死数据区域============================*/
		/**==========================迭代数据区域================================*/
		int line = 5;
		int count = 1;
		for(int i=0; i<sheetTwoList.size(); i++) {
					/**==============死数据区域=============*/
			//总计行  
			addMergeCellToUtil(sheet, line, line, 1, 2);
			HSSFRow row6 = sheet.createRow(line);
			HSSFCell cell6BC = row6.createCell(1);
			cell6BC.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6BC.setCellValue("总计");
			HSSFCell cell6D = row6.createCell(3);
			cell6D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell6D.setCellValue("01");
			//少数民族行
			addMergeCellToUtil(sheet, line+1, line+1, 1, 2);
			HSSFRow row7 = sheet.createRow(line+1);
			HSSFCell cell7BC = row7.createCell(1);
			cell7BC.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7BC.setCellValue("其中少数民族数量");
			HSSFCell cell7D = row7.createCell(3);
			cell7D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell7D.setCellValue("02");
			//女性数量行
			addMergeCellToUtil(sheet, line+2, line+2, 1, 2);
			HSSFRow row8 = sheet.createRow(line+2);
			HSSFCell cell8BC = row8.createCell(1);
			cell8BC.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8BC.setCellValue("其中女性数量");
			HSSFCell cell8D = row8.createCell(3);
			cell8D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell8D.setCellValue("03");	
			//合计
			addMergeCellToUtil(sheet, line+3, line+5, 1, 1);
			HSSFRow row9 = sheet.createRow(line+3);
			HSSFCell cell91011B = row9.createCell(1);
			cell91011B.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell91011B.setCellValue("合计");
			//普通本科院校
			addMergeCellToUtil(sheet, line+3, line+3, 2, 2);
			HSSFCell cell9C = row9.createCell(2);
			cell9C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9C.setCellValue("普通本科院校");
			addMergeCellToUtil(sheet, line+4, line+4, 2, 2);
			HSSFCell cell9D = row9.createCell(3);
			cell9D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell9D.setCellValue("04");	
			//	专科
			HSSFRow row10 = sheet.createRow(line+4);
			HSSFCell cell10C = row10.createCell(2);
			cell10C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell10C.setCellValue("专科院校（含职业技术学院）");
			HSSFCell cell10D = row10.createCell(3);
			cell10D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell10D.setCellValue("05");
			// 民办
			addMergeCellToUtil(sheet, line+5, line+5, 2, 2);
			HSSFRow row11 = sheet.createRow(line+5);
			HSSFCell cell11C = row11.createCell(2);
			cell11C.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell11C.setCellValue("民办高校（含独立学院）");
			HSSFCell cell11D = row11.createCell(3);
			cell11D.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell11D.setCellValue("06");
					/**==============死数据区域=============*/
					/**==============活数据区域=============*/
			//学校名称 ：
			addMergeCellToUtil(sheet, line, line+5, 0, 0);   
			//拿到学校列表的学校名称
			String schoolName = count + "." +schoolList.get(i).getS_Name();//bug1
			HSSFCell cell611A = row6.createCell(0);
			cell611A.setCellStyle(addStyleAlign(workbook, (short)12,true,false));
			cell611A.setCellValue(schoolName);
			System.out.println("--------------------"+schoolName);
			//块区域数据的封装问题
			//拿到表二列表
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
				//关于学校设置
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
					/**==============活数据区域=============*/
			line = line + 6;
			count++;
		}
		/**==========================迭代数据区域================================*/
		/**==========================5.输出============================*/
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
