package com.genuine.core.utils;

import java.util.ArrayList;
import java.util.List;

public class QueryHelper {

	// from子句
	private String fromClause = "";
	// where子句
	private String whereClause = "";
	// orderBy子句
	private String orderByClause = "";
	// 参数列表
	private List<Object> parameters;
	
	//排序常量
	public static String ORDET_BY_DESC = "DESC";
	public static String ORDET_BY_ASC = "ASC";
	/**
	 * 目标语句：FROM Info i
	 * 
	 * @param clazz
	 *            :查询的实体对象。例如：Info
	 * @param alias
	 *            :重命名：如 i
	 */
	public QueryHelper(Class clazz, String alias) {
		fromClause = "FROM " + clazz.getSimpleName() + " " + alias;
	}

	/**
	 * 目标:Where i.title like ?
	 * 
	 * @param condition
	 *            :i.title like ?
	 * @param params
	 *            :?对应的参数
	 */
	public void addCondition(String condition, Object... params) {

		if (whereClause.length() > 0) {
			whereClause += " AND " + condition;
		} else {
			whereClause = " WHERE " + condition;
		}

		// 处理参数
		if (params != null) {
			if (parameters == null) {
				parameters = new ArrayList<Object>();
			}
			for (Object obj : params) {
				parameters.add(obj);
			}
		}
	}

	/**
	 * 目标 ORDER BY i.createTime DESC/ASC;
	 * 
	 * @param property
	 *            :i.createTime
	 * @param order
	 *            :DESC
	 */
	public void addOrderByProperty(String property, String order) {

		if (orderByClause.length() > 0) {
			orderByClause += "," + property + " " + order;
		} else { // 第一个排序条件
			orderByClause = " ORDER BY " + property + " " + order;
		}
	}

	// 组合预览：FROM Info i Where i.title like ? ORDER BY i.createTime DESC/ASC
	// 查询语句
	public String getListHql() {
		return fromClause + whereClause + orderByClause;
	}
	public String getCountHql() {
		return "SELECT COUNT(*) "+fromClause + whereClause;
	}
	// 获得查询语句对应的属性集合
	public List<Object> getParameters() {
		return parameters;
	}
}
