package com.genuine.admin.caculate.all.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.genuine.admin.caculate.all.service.AllService;
import com.genuine.front.login.entity.School;
import com.genuine.front.login.service.SchoolService;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;
import com.genuine.front.sheet.service.SheetService;
import com.opensymphony.xwork2.ActionSupport;

public class AllAction extends ActionSupport {
	
	@Resource
	private AllService allService;
	@Resource
	private SheetService sheetService;
	@Resource
	private SchoolService schoolService;
	
	
	public String xlsOne() {
		return "xlsOne";
	}
	public String xlsTwo() {
		return "xlsTwo";
	}
	public String xlsThree() {
		return "xlsThree";
	}
	public String xlsFour() {
		return "xlsFour";
	}
	public String xlsFive() {
		return "xlsFive";
	}
	
	//导出计算过程excel
	public void doEmportXlsOne() {
		
		try {
			//拿到响应的输出流
			HttpServletResponse response = ServletActionContext.getResponse();
			//导出文件的类型
			response.setContentType("application/x-excel"); 
			//设置返回头：参数一代表：内容处理方式  参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition","attachment;filename="+new String("2017年全国高校基层党组织建设情况统计表（表一）.xls".getBytes(),"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			//数据处理
			List<TSheetone> sheetOneRow = new ArrayList<TSheetone>();
			sheetOneRow = sheetService.listSheetOne();
			//学校列表
			List<School> schoolList = new ArrayList<School>();
			School school = null;
			//所有的行对象
			List<List<TSheetone>> sheetOneList = new ArrayList<List<TSheetone>>();
			List<TSheetone> sheetOneNow = null;
			sheetOneNow = new ArrayList<TSheetone>();
			for(int i=0; i<sheetOneRow.size(); i++) {
				TSheetone tst = new TSheetone();
				//bug：sheetOneNow.get(i)
				tst.setId(sheetOneRow.get(i).getId());
				tst.setAmount(sheetOneRow.get(i).getAmount());
				tst.setSBk(sheetOneRow.get(i).getSBk());
				tst.setSZk(sheetOneRow.get(i).getSZk());
				tst.setSMb(sheetOneRow.get(i).getSMb());
				sheetOneNow.add(tst);
				if((i+1)%13 == 0) {
					//处理学校的问题
					//bug:学校数据为空'
					school = schoolService.findObjectById(sheetOneRow.get(i).getId().getSId());
					
					schoolList.add(school);
					sheetOneList.add(sheetOneNow);
					sheetOneNow = new ArrayList<TSheetone>();
				}
			}
			
			
			//调用业务逻辑
			allService.exportXlsOne(outputStream, sheetOneList, schoolList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//导出计算过程excel
	public void doEmportXlsTwo() {
		
		try {
			//拿到响应的输出流
			HttpServletResponse response = ServletActionContext.getResponse();
			//导出文件的类型
			response.setContentType("application/x-excel"); 
			//设置返回头：参数一代表：内容处理方式  参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition","attachment;filename="+new String("2017年全国高校教职工党员队伍结构和党组织基本状况统计表（表二）.xls".getBytes(),"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			//数据域问题
			List<TSheettwo> sheetTwoRow = new ArrayList<TSheettwo>();
			/** 问题出现在这!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
			sheetTwoRow = sheetService.listSheetTwo();
			//学校列表
			List<School> schoolList = new ArrayList<School>();
			School school = null;
			//所有的行对象
			List<List<TSheettwo>> sheetTwoList = new ArrayList<List<TSheettwo>>();
			List<TSheettwo> sheetTwoNow = null;
			sheetTwoNow = new ArrayList<TSheettwo>();
			for(int i=0; i<sheetTwoRow.size(); i++) {
				TSheettwo tst = new TSheettwo();
				//bug：sheetTwoNow.get(i)
				tst.setId(sheetTwoRow.get(i).getId());
				tst.setSchoolState(sheetTwoRow.get(i).getSchoolState());
				tst.setAmount(sheetTwoRow.get(i).getAmount());
				tst.setFewSum(sheetTwoRow.get(i).getFewSum());
				tst.setGrilSum(sheetTwoRow.get(i).getGrilSum());
				sheetTwoNow.add(tst);
				if((i+1)%19 == 0) {
					//处理学校的问题
					//bug:学校数据为空'
					school = schoolService.findObjectById(sheetTwoRow.get(i).getId().getSId());
					
					schoolList.add(school);
					sheetTwoList.add(sheetTwoNow);
					sheetTwoNow = new ArrayList<TSheettwo>();
				}
			}
			System.out.println(sheetTwoList);
			//调用业务逻辑
			allService.exportXlsTwo(outputStream, sheetTwoList,schoolList );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//导出计算过程excel
	public void doEmportXlsThree() {
		
		try {
			//拿到响应的输出流
			HttpServletResponse response = ServletActionContext.getResponse();
			//导出文件的类型
			response.setContentType("application/x-excel"); 
			//设置返回头：参数一代表：内容处理方式  参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition","attachment;filename="+new String("2017年全国高校学生党员队伍结构和党组织基本状况统计表（表三）.xls".getBytes(),"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			//数据域问题
			List<TSheetthree> sheetThreeRow = new ArrayList<TSheetthree>();
			sheetThreeRow = sheetService.listSheetThree();
			//学校列表
			List<School> schoolList = new ArrayList<School>();
			School school = null;
			//所有的行对象
			List<List<TSheetthree>> sheetThreeList = new ArrayList<List<TSheetthree>>();
			List<TSheetthree> sheetThreeNow = null;
			sheetThreeNow = new ArrayList<TSheetthree>();
			for(int i=0; i<sheetThreeRow.size(); i++) {
				TSheetthree tst = new TSheetthree();
				tst.setId(sheetThreeRow.get(i).getId());
				tst.setAmount(sheetThreeRow.get(i).getAmount());
				tst.setBsSum(sheetThreeRow.get(i).getBsSum());
				tst.setFewSum(sheetThreeRow.get(i).getFewSum());
				tst.setWomanSum(sheetThreeRow.get(i).getWomanSum());
				tst.setXjSum(sheetThreeRow.get(i).getXjSum());
				tst.setSsSum(sheetThreeRow.get(i).getSsSum());
				tst.setSxjSum(sheetThreeRow.get(i).getSxjSum());
				tst.setSbkSum(sheetThreeRow.get(i).getSbkSum());
				tst.setSzkSum(sheetThreeRow.get(i).getSzkSum());
				tst.setSchoolState(sheetThreeRow.get(i).getSchoolState());
				sheetThreeNow.add(tst);
				if((i+1) % 11 ==0) {
					school = schoolService.findObjectById(sheetThreeRow.get(i).getId().getSId());
					schoolList.add(school);
					sheetThreeList.add(sheetThreeNow);
					sheetThreeNow = new ArrayList<TSheetthree>();
				}
			}
			//调用业务逻辑
			allService.exportXlsThree(outputStream, sheetThreeList, schoolList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//导出计算过程excel
	public void doEmportXlsFour() {
		
		try {
			//拿到响应的输出流
			HttpServletResponse response = ServletActionContext.getResponse();
			//导出文件的类型
			response.setContentType("application/x-excel"); 
			//设置返回头：参数一代表：内容处理方式  参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition","attachment;filename="+new String("2017年全国高校与党组织失去联系党员情况汇总表（表四）.xls".getBytes(),"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			//数据域问题
			List<TSheetfour> sheetFourRow = new ArrayList<TSheetfour>();
			sheetFourRow = sheetService.listSheetFour();
			//根据表格id获得学校列表
			List<School> schoolList = new ArrayList<School>();
			School school = null;
			//所有的行对象
			List<List<TSheetfour>> sheetFourList = new ArrayList<List<TSheetfour>>();
			List<TSheetfour> sheetFourNow = null;
			sheetFourNow = new ArrayList<TSheetfour>();
			for(int i=0; i<sheetFourRow.size(); i++) {
				TSheetfour tsf = new TSheetfour();
				tsf.setId(sheetFourRow.get(i).getId());
				tsf.setAmount(sheetFourRow.get(i).getAmount());
				tsf.setRelation(sheetFourRow.get(i).getRelation());
				tsf.setRetire(sheetFourRow.get(i).getRetire());
				tsf.setGraduate(sheetFourRow.get(i).getGraduate());
				tsf.setOther(sheetFourRow.get(i).getOther());
				sheetFourNow.add(tsf);
				//没达到十二条数据才封装
				if((i+1)%12 == 0) {
					//处理学校的问题
					//bug:学校数据为空
					school = schoolService.findObjectById(sheetFourRow.get(i).getId().getSId());
					
					schoolList.add(school);
					sheetFourList.add(sheetFourNow);
					sheetFourNow = new ArrayList<TSheetfour>();
				}
			}
			//调用业务逻辑
			allService.exportXlsFour(outputStream, sheetFourList, schoolList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//导出计算过程excel
	public void doEmportXlsFive() {
		try {
			//拿到响应的输出流
			HttpServletResponse response = ServletActionContext.getResponse();
			//导出文件的类型
			response.setContentType("application/x-excel"); 
			//设置返回头：参数一代表：内容处理方式  参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition","attachment;filename="+new String("2017年全国高校与党组织失去联系党员规范管理及组织处置情况汇总表（表五）.xls".getBytes(),"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			//数据域问题
			List<TSheetfive> sheetFiveRow = new ArrayList<TSheetfive>();
			sheetFiveRow = sheetService.listSheetFive();
			//根据表格id获得学校列表
			List<School> schoolList = new ArrayList<School>();
			School school = null;
			//所有的行对象
			List<List<TSheetfive>> sheetFiveList = new ArrayList<List<TSheetfive>>();
			List<TSheetfive> sheetFiveNow = null;
			sheetFiveNow = new ArrayList<TSheetfive>();
			for(int i=0; i<sheetFiveRow.size(); i++) {
				TSheetfive tsf = new TSheetfive();
				tsf.setId(sheetFiveRow.get(i).getId());
				tsf.setSum(sheetFiveRow.get(i).getSum());
				tsf.setEmp(sheetFiveRow.get(i).getEmp());
				tsf.setRetire(sheetFiveRow.get(i).getRetire());
				tsf.setGraduate(sheetFiveRow.get(i).getGraduate());
				tsf.setOther(sheetFiveRow.get(i).getOther());
				sheetFiveNow.add(tsf);
				//没达到十二条数据才封装
				if((i+1)%7 == 0) {
					//处理学校的问题
					school = schoolService.findObjectById(sheetFiveRow.get(i).getId().getSId());
					schoolList.add(school);
					sheetFiveList.add(sheetFiveNow);
					sheetFiveNow = new ArrayList<TSheetfive>();
				}
			}
			//调用业务逻辑
			allService.exportXlsFive(outputStream, sheetFiveList, schoolList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
