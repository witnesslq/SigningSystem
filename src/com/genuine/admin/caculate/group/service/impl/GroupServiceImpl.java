package com.genuine.admin.caculate.group.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;

import org.springframework.stereotype.Service;

import com.genuine.admin.caculate.group.dao.GroupDao;
import com.genuine.admin.caculate.group.service.GroupService;
import com.genuine.core.utils.PageResult;
import com.genuine.core.utils.QueryHelper;
import com.genuine.core.utils.SumXlsFiveUtil;
import com.genuine.core.utils.SumXlsFourUtil;
import com.genuine.core.utils.SumXlsOneUtil;
import com.genuine.core.utils.SumXlsThreeUtil;
import com.genuine.core.utils.SumXlsTwoUtil;
import com.genuine.front.login.entity.School;

@Service("GroupService")
public class GroupServiceImpl implements GroupService {
	
	@Resource
	private GroupDao groupDao;

	public List<School> findObjects() {
		return groupDao.findObjects();
	}

	public School findObjectById(Serializable id) {
		return groupDao.findObjectById(id);
	}


	public void deleteObject(Serializable id) {
		groupDao.deleteObjectById(id);
	}

	public void save(School school) {
		groupDao.save(school);
	}

	public void updateObject(School school) {
		groupDao.update(school);
	}

	public void saveOrUpdate(School school) {
		groupDao.saveOrUpdate(school);
	}

	public PageResult getPageResult(QueryHelper queryHelper, int pageNo,
			int pageSize) {
		return groupDao.getPageResult(queryHelper, pageNo, pageSize);
	}
	
	//导出总表
	public void exportXlsOne(ServletOutputStream outputStream , List<String> schoolIdList) {
		List<List<String>> sheetOneList;
		
		//封装sheetOneList
		sheetOneList = groupDao.FindOneCountbyId(schoolIdList);
		
		SumXlsOneUtil.exportXlsOne(outputStream, sheetOneList);
	}

	public void exportXlsTwo(ServletOutputStream outputStream, List<String> schoolIdList) {
		List<List<String>> sheetTwoList;
		
		//封装sheetOneList
		sheetTwoList = groupDao.FindTwoCountbyId(schoolIdList);
		SumXlsTwoUtil.exportXlsTwo(outputStream,sheetTwoList);
	}

	public void exportXlsThree(ServletOutputStream outputStream,List<String> schoolIdList) {
		List<List<String>> sheetThreeList;
		sheetThreeList = groupDao.FindThreeCountbyId(schoolIdList);
		SumXlsThreeUtil.exportXlsThree(outputStream,sheetThreeList);
	}
	
	
	//表四逻辑
	public void exportXlsFour(ServletOutputStream outputStream , List<String> schoolIdList) {
		
		//bug没调到findfourcountbuid方法（当选择一个提交的学校，和没提交的学校时候报异常，或者只选择一个提交的学校）--------------------------------
		List<List<String>> sheetFourList = groupDao.FindFourCountbyId(schoolIdList);
		//bug没调到findfourcountbuid方法--------------------------------
		SumXlsFourUtil.exportXlsFour(outputStream, sheetFourList);
	}

	public void exportXlsFive(ServletOutputStream outputStream,
			List<String> schoolIdList) {
		List<List<String>> sheetFiveList = groupDao.FindFiveCountbyId(schoolIdList);
		//bug没调到findfourcountbuid方法--------------------------------
		SumXlsFiveUtil.exportXlsFive(outputStream, sheetFiveList);
	}


}
