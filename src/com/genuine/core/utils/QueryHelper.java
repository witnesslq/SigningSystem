package com.genuine.core.utils;

import java.util.ArrayList;
import java.util.List;

public class QueryHelper {

	// from�Ӿ�
	private String fromClause = "";
	// where�Ӿ�
	private String whereClause = "";
	// orderBy�Ӿ�
	private String orderByClause = "";
	// �����б�
	private List<Object> parameters;
	
	//������
	public static String ORDET_BY_DESC = "DESC";
	public static String ORDET_BY_ASC = "ASC";
	/**
	 * Ŀ����䣺FROM Info i
	 * 
	 * @param clazz
	 *            :��ѯ��ʵ��������磺Info
	 * @param alias
	 *            :���������� i
	 */
	public QueryHelper(Class clazz, String alias) {
		fromClause = "FROM " + clazz.getSimpleName() + " " + alias;
	}

	/**
	 * Ŀ��:Where i.title like ?
	 * 
	 * @param condition
	 *            :i.title like ?
	 * @param params
	 *            :?��Ӧ�Ĳ���
	 */
	public void addCondition(String condition, Object... params) {

		if (whereClause.length() > 0) {
			whereClause += " AND " + condition;
		} else {
			whereClause = " WHERE " + condition;
		}

		// �������
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
	 * Ŀ�� ORDER BY i.createTime DESC/ASC;
	 * 
	 * @param property
	 *            :i.createTime
	 * @param order
	 *            :DESC
	 */
	public void addOrderByProperty(String property, String order) {

		if (orderByClause.length() > 0) {
			orderByClause += "," + property + " " + order;
		} else { // ��һ����������
			orderByClause = " ORDER BY " + property + " " + order;
		}
	}

	// ���Ԥ����FROM Info i Where i.title like ? ORDER BY i.createTime DESC/ASC
	// ��ѯ���
	public String getListHql() {
		return fromClause + whereClause + orderByClause;
	}
	public String getCountHql() {
		return "SELECT COUNT(*) "+fromClause + whereClause;
	}
	// ��ò�ѯ����Ӧ�����Լ���
	public List<Object> getParameters() {
		return parameters;
	}
}
