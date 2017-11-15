package com.genuine.admin.caculate.group.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.genuine.admin.caculate.group.service.GroupService;
import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.front.login.entity.School;
import com.opensymphony.xwork2.ActionContext;

public class GroupAction {

	private List<School> schoolList;
	private School school;

	// 分页查询
	private PageResult pageResult;
	private int pageNo;
	private int pageSize;
	// 全选数组
	private String[] selectedRow;

	@Resource
	private GroupService groupService;

	// 列表
	public String listUI() throws Exception {
		ActionContext.getContext().getContextMap()
				.put("schoolStateMap", School.SCHOOL_SUBMIT_MAP);
		ActionContext.getContext().getContextMap()
				.put("cityMap", School.cityMap);
		ActionContext.getContext().getContextMap()
				.put("typeMap", School.typeMap);
		ActionContext.getContext().getContextMap()
				.put("adminMap", School.adminMap);
		ActionContext.getContext().getContextMap().put("s75Map", School.s75Map);
		/** ===================加入分页=================== */
		QueryHelper queryHelper = new QueryHelper(School.class, "");
		if (school != null && StringUtils.isNotBlank(school.getS_Submit())) {
			System.out.println(school.getS_Submit());
			queryHelper.addCondition("s_Submit = ?", school.getS_Submit());
		}
		// 所在城市条件查询 "s_name like ?", "%" + school.getS_Name() + "%"
		if (school != null && StringUtils.isNotBlank(school.getS_City())) {
			queryHelper.addCondition("s_City = ?", school.getS_City());
		}
		// 所属类别查询
		if (school != null && StringUtils.isNotBlank(school.getS_Type())) {
			queryHelper.addCondition("s_Type = ?", school.getS_Type());
		}
		// 行政名称查询 BUG
		if (school != null && StringUtils.isNotBlank(school.getS_Admin())) {
			queryHelper.addCondition("s_Admin = ?", school.getS_Admin());
		}
		if (school != null && StringUtils.isNotBlank(school.getS_75())) {
			queryHelper.addCondition("s_75 = ?", school.getS_75());
		}
		// 75省属学校查询
		pageResult = groupService.getPageResult(queryHelper, getPageNo(),
				getPageSize());
		/** ===================加入分页=================== */
		return "listUI";
	}

	public void doEmportXlsOne() {

		// 拿到响应的输出流

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// 导出文件的类型
			response.setContentType("application/x-excel");
			// 设置返回头：参数一代表：内容处理方式 参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String("2017年全国高校基层党组织建设情况统计表（表一）.xls".getBytes(),
							"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// 学校IdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsOne(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doEmportXlsTwo() {

		// 拿到响应的输出流

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// 导出文件的类型
			response.setContentType("application/x-excel");
			// 设置返回头：参数一代表：内容处理方式 参数二代表：附件方式与附件的名称
			response.setHeader(
					"Content-Disposition",
					"attachment;filename="
							+ new String(
									"2017年全国高校教职工党员队伍结构和党组织基本状况统计表（表二）.xls"
											.getBytes(), "ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// 学校IdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsTwo(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doEmportXlsThree() {

		// 拿到响应的输出流

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// 导出文件的类型
			response.setContentType("application/x-excel");
			// 设置返回头：参数一代表：内容处理方式 参数二代表：附件方式与附件的名称
			response.setHeader(
					"Content-Disposition",
					"attachment;filename="
							+ new String(
									"2017年全国高校学生党员队伍结构和党组织基本状况统计 表（表三）.xls"
											.getBytes(), "ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// 学校IdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsThree(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 导出表四
	public void doEmportXlsFour() {

		// 拿到响应的输出流

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// 导出文件的类型
			response.setContentType("application/x-excel");
			// 设置返回头：参数一代表：内容处理方式 参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String("2017年全国高校与党组织失去联系党员情况汇总表（表四）.xls".getBytes(),
							"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// 学校IdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsFour(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 导出表四
	public void doEmportXlsFive() {
		// 拿到响应的输出流
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// 导出文件的类型
			response.setContentType("application/x-excel");
			// 设置返回头：参数一代表：内容处理方式 参数二代表：附件方式与附件的名称
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String("2017年全国高校与党组织失去联系党员规范管理及组织处置情况汇总表（表五）.xls".getBytes(),
							"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			// 学校IdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsFive(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* =========================编辑功能====================== */
	public List<School> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(List<School> schoolList) {
		this.schoolList = schoolList;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public PageResult getPageResult() {
		return pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		if (pageSize < 1)
			pageSize = 120;
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String[] getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(String[] selectedRow) {
		this.selectedRow = selectedRow;
	}

}
