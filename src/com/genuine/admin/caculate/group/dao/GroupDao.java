package com.genuine.admin.caculate.group.dao;

import java.util.List;

import com.genuine.core.dao.BaseDao;
import com.genuine.front.login.entity.School;

public interface GroupDao extends BaseDao<School> {

	List<List<String>> FindOneCountbyId(List<String> schoolIdList);

	List<List<String>> FindTwoCountbyId(List<String> schoolIdList);

	List<List<String>> FindThreeCountbyId(List<String> schoolIdList);
	
	List<List<String>> FindFourCountbyId(List<String> schoolIdList);
	List<List<String>> FindFiveCountbyId(List<String> schoolIdList);
}
