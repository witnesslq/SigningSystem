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

	// ��ҳ��ѯ
	private PageResult pageResult;
	private int pageNo;
	private int pageSize;
	// ȫѡ����
	private String[] selectedRow;

	@Resource
	private GroupService groupService;

	// �б�
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
		/** ===================�����ҳ=================== */
		QueryHelper queryHelper = new QueryHelper(School.class, "");
		if (school != null && StringUtils.isNotBlank(school.getS_Submit())) {
			System.out.println(school.getS_Submit());
			queryHelper.addCondition("s_Submit = ?", school.getS_Submit());
		}
		// ���ڳ���������ѯ "s_name like ?", "%" + school.getS_Name() + "%"
		if (school != null && StringUtils.isNotBlank(school.getS_City())) {
			queryHelper.addCondition("s_City = ?", school.getS_City());
		}
		// ��������ѯ
		if (school != null && StringUtils.isNotBlank(school.getS_Type())) {
			queryHelper.addCondition("s_Type = ?", school.getS_Type());
		}
		// �������Ʋ�ѯ BUG
		if (school != null && StringUtils.isNotBlank(school.getS_Admin())) {
			queryHelper.addCondition("s_Admin = ?", school.getS_Admin());
		}
		if (school != null && StringUtils.isNotBlank(school.getS_75())) {
			queryHelper.addCondition("s_75 = ?", school.getS_75());
		}
		// 75ʡ��ѧУ��ѯ
		pageResult = groupService.getPageResult(queryHelper, getPageNo(),
				getPageSize());
		/** ===================�����ҳ=================== */
		return "listUI";
	}

	public void doEmportXlsOne() {

		// �õ���Ӧ�������

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// �����ļ�������
			response.setContentType("application/x-excel");
			// ���÷���ͷ������һ�������ݴ���ʽ ����������������ʽ�븽��������
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String("2017��ȫ����У���㵳��֯�������ͳ�Ʊ���һ��.xls".getBytes(),
							"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// ѧУIdList
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

		// �õ���Ӧ�������

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// �����ļ�������
			response.setContentType("application/x-excel");
			// ���÷���ͷ������һ�������ݴ���ʽ ����������������ʽ�븽��������
			response.setHeader(
					"Content-Disposition",
					"attachment;filename="
							+ new String(
									"2017��ȫ����У��ְ����Ա����ṹ�͵���֯����״��ͳ�Ʊ������.xls"
											.getBytes(), "ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// ѧУIdList
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

		// �õ���Ӧ�������

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// �����ļ�������
			response.setContentType("application/x-excel");
			// ���÷���ͷ������һ�������ݴ���ʽ ����������������ʽ�븽��������
			response.setHeader(
					"Content-Disposition",
					"attachment;filename="
							+ new String(
									"2017��ȫ����Уѧ����Ա����ṹ�͵���֯����״��ͳ�� ��������.xls"
											.getBytes(), "ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// ѧУIdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsThree(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��������
	public void doEmportXlsFour() {

		// �õ���Ӧ�������

		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// �����ļ�������
			response.setContentType("application/x-excel");
			// ���÷���ͷ������һ�������ݴ���ʽ ����������������ʽ�븽��������
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String("2017��ȫ����У�뵳��֯ʧȥ��ϵ��Ա������ܱ����ģ�.xls".getBytes(),
							"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			// ѧУIdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsFour(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��������
	public void doEmportXlsFive() {
		// �õ���Ӧ�������
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			// �����ļ�������
			response.setContentType("application/x-excel");
			// ���÷���ͷ������һ�������ݴ���ʽ ����������������ʽ�븽��������
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String("2017��ȫ����У�뵳��֯ʧȥ��ϵ��Ա�淶������֯����������ܱ����壩.xls".getBytes(),
							"ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			// ѧУIdList
			List<String> SchoolIdList = new ArrayList<String>();
			for (String id : selectedRow) {
				SchoolIdList.add(id);
			}
			groupService.exportXlsFive(outputStream, SchoolIdList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* =========================�༭����====================== */
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
