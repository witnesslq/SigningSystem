package com.genuine.admin.caculate.group.service;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

import javax.servlet.ServletOutputStream;

import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheettwo;

public interface GroupService {
	
	//��ѯ
	public List<School> findObjects();
	//����id��ѯ����
	public School findObjectById(Serializable id);
	//ɾ��
	public void deleteObject(Serializable id);
	//����
	public void save(School school);
	//����
	public void updateObject(School school);
	//������߸���
	public void saveOrUpdate(School school);
	
	//��ҳ��ѯ����
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize);

	//�����ܱ�

	public void exportXlsOne(ServletOutputStream outputStream, List<String> schoolIdList);

	public void exportXlsTwo(ServletOutputStream outputStream,List<String> schoolIdList);
	
	public void exportXlsThree(ServletOutputStream outputStream,List<String> sheetThreeList);
	//����
	public void exportXlsFour(ServletOutputStream outputStream,List<String> schoolIdList);
	//����
	public void exportXlsFive(ServletOutputStream outputStream,List<String> schoolIdList);

}
