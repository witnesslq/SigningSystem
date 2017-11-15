package com.genuine.admin.caculate.all.service;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;

import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;

public interface AllService {
	
	//表一的导出
	public void exportXlsOne(OutputStream outputStream,List<List<TSheetone>> sheetTwoList,List<School> schoolList);

	public void exportXlsTwo(ServletOutputStream outputStream,
			List<List<TSheettwo>> sheetTwoList, List<School> schoolList);
	public void exportXlsThree(ServletOutputStream outputStream,
			List<List<TSheetthree>> sheetThreeList, List<School> schoolList);
	//表四导出
	public void exportXlsFour(ServletOutputStream outputStream,
			List<List<TSheetfour>> sheetFourList, List<School> schoolList);
	//表五导出
	public void exportXlsFive(ServletOutputStream outputStream,
			List<List<TSheetfive>> sheetFiveList, List<School> schoolList);
}
