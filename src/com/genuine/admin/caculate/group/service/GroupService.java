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
	
	//查询
	public List<School> findObjects();
	//根据id查询对象
	public School findObjectById(Serializable id);
	//删除
	public void deleteObject(Serializable id);
	//保存
	public void save(School school);
	//更新
	public void updateObject(School school);
	//保存或者更新
	public void saveOrUpdate(School school);
	
	//分页查询助手
	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,int pageSize);

	//导出总表

	public void exportXlsOne(ServletOutputStream outputStream, List<String> schoolIdList);

	public void exportXlsTwo(ServletOutputStream outputStream,List<String> schoolIdList);
	
	public void exportXlsThree(ServletOutputStream outputStream,List<String> sheetThreeList);
	//表四
	public void exportXlsFour(ServletOutputStream outputStream,List<String> schoolIdList);
	//表五
	public void exportXlsFive(ServletOutputStream outputStream,List<String> schoolIdList);

}
