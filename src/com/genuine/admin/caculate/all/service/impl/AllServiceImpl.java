package com.genuine.admin.caculate.all.service.impl;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.springframework.stereotype.Service;

import com.genuine.admin.caculate.all.service.AllService;
import com.genuine.core.utils.XlsFiveUtil;
import com.genuine.core.utils.XlsFourUtil;
import com.genuine.core.utils.XlsOneUtil;
import com.genuine.core.utils.XlsThreeUtil;
import com.genuine.core.utils.XlsTwoUtil;
import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;


@Service("allService")
public class AllServiceImpl implements AllService {

	public void exportXlsOne(OutputStream outputStream,
			List<List<TSheetone>> sheetOneList, List<School> schoolList) {
		XlsOneUtil.exportXlsOne(outputStream, sheetOneList, schoolList);
	}

	public void exportXlsTwo(ServletOutputStream outputStream,
			List<List<TSheettwo>> sheetTwoList, List<School> schoolList) {
		XlsTwoUtil.exportXlsTwo(outputStream,sheetTwoList,schoolList);
	}

	public void exportXlsFour(ServletOutputStream outputStream,
			List<List<TSheetfour>> sheetFourList, List<School> schoolList) {
		XlsFourUtil.exportXlsFour(outputStream,sheetFourList,schoolList);
	}
	
	public void exportXlsThree(ServletOutputStream outputStream,
			List<List<TSheetthree>> sheetThreeList, List<School> schoolList) {
		XlsThreeUtil.exportXlsThree(outputStream,sheetThreeList,schoolList);
	}

	public void exportXlsFive(ServletOutputStream outputStream,
			List<List<TSheetfive>> sheetFiveList, List<School> schoolList) {
		XlsFiveUtil.exportXlsFive(outputStream,sheetFiveList,schoolList);
	}

}
