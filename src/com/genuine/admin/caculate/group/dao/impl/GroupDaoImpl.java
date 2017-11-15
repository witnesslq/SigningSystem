package com.genuine.admin.caculate.group.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;

import com.genuine.admin.caculate.group.dao.GroupDao;
import com.genuine.core.dao.impl.BaseDaoImpl;
import com.genuine.front.login.entity.School;
import com.genuine.front.sheet.entity.TSheetfive;
import com.genuine.front.sheet.entity.TSheetfiveId;
import com.genuine.front.sheet.entity.TSheetfour;
import com.genuine.front.sheet.entity.TSheetfourId;
import com.genuine.front.sheet.entity.TSheetone;
import com.genuine.front.sheet.entity.TSheetoneId;
import com.genuine.front.sheet.entity.TSheetthree;
import com.genuine.front.sheet.entity.TSheetthreeId;
import com.genuine.front.sheet.entity.TSheettwo;
import com.genuine.front.sheet.entity.TSheettwoId;

public class GroupDaoImpl extends BaseDaoImpl<School> implements GroupDao {

	public boolean findOneRowId(TSheetoneId id) {
		// 放进来个联合主键
		TSheetone t = getHibernateTemplate().get(TSheetone.class, id);
		if (t != null) {
			return true;
		}
		return false;
	}

	public boolean findTwoRowId(TSheettwoId id) {
		// 放进来个联合主键
		TSheettwo t = getHibernateTemplate().get(TSheettwo.class, id);
		if (t != null) {
			return true;
		}
		return false;
	}

	public boolean findThreeRowId(TSheetthreeId id) {
		// 放进来个联合主键
		TSheetthree t = getHibernateTemplate().get(TSheetthree.class, id);
		if (t != null) {
			return true;
		}
		return false;
	}

	public boolean findFourRowId(TSheetfourId id) {
		// 放进来个联合主键
		TSheetfour t = getHibernateTemplate().get(TSheetfour.class, id);
		if (t != null) {
			return true;
		}
		return false;
	}
	public boolean findFiveRowId(TSheetfiveId id) {
		// 放进来个联合主键
		TSheetfive t = getHibernateTemplate().get(TSheetfive.class, id);
		if (t != null) {
			return true;
		}
		return false;
	}
	public String findState(TSheettwoId id) {
		TSheettwo tSheettwo = getHibernateTemplate().get(TSheettwo.class, id);
		return tSheettwo.getSchoolState();
	}

	public List<List<String>> FindOneCountbyId(List<String> schoolIdList) {

		// 定义基本sql字符串
		String baseSql = "SELECT SUM(amount) FROM t_sheetone";
		int baseLength = baseSql.length();

		List<List<String>> sheetOneList = new ArrayList<List<String>>();
		// 根据学校id去查询数据库的总数
		// 遍历rowId
		List<String> colList = null;
		for (int i = 1; i <= 13; i++) {
			colList = new ArrayList<String>();
			// 添加总计
			String sql_sum = "SELECT SUM(amount) FROM t_sheetone";
			int k_one = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_one = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetoneId tsoi = new TSheetoneId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findOneRowId(tsoi)) {
					k_one++;
					if (k_one != 1) {
						if (!sql_sum.contains("WHERE")) {
							sql_sum += " WHERE row_id=? (";
						}
						sql_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sql_sum += " WHERE row_id=?";
						sql_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = sql_sum.substring(baseLength);
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_one = baseSql + laterSql + ")";
					System.out.println("str_one：" + str_one);
					Query query_sum = getSession().createSQLQuery(str_one);
					query_sum.setParameter(0, i);
					List<BigDecimal> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(0, amountList.get(0).toString());
					} else {
						colList.add(0, null);
					}
				}
			}
			// 本科
			String bk_sum = "SELECT SUM(s_bk) FROM t_sheetone";
			String bkSql = bk_sum;
			int k_two = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_two = "";
				// 拼接联合主键
				TSheetoneId tsoi = new TSheetoneId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findOneRowId(tsoi)) {
					k_two++;
					if (k_two != 1) {
						if (!bk_sum.contains("WHERE")) {
							bk_sum += " WHERE row_id=? (";
						}
						bk_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						bk_sum += " WHERE row_id=?";
						bk_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = bk_sum.substring(bkSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_two = bkSql + laterSql + ")";
					System.out.println("str_two：" + str_two);
					Query query_bk = getSession().createSQLQuery(str_two);
					query_bk.setParameter(0, i);
					List<BigDecimal> bkList = query_bk.list();
					if (bkList.get(0) != null) {
						colList.add(1, bkList.get(0).toString());
					} else {
						colList.add(1, null);
					}
				}
			}

			// 专科
			String zk_sum = "SELECT SUM(s_zk) FROM t_sheetone";
			String zkSql = zk_sum;
			int k_three = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_three = "";
				// 拼接联合主键
				TSheetoneId tsoi = new TSheetoneId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findOneRowId(tsoi)) {
					k_three++;
					if (k_three != 1) {
						if (!zk_sum.contains("WHERE")) {
							zk_sum += " WHERE row_id=? (";
						}
						zk_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						zk_sum += " WHERE row_id=?";
						zk_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = zk_sum.substring(zkSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_three = zkSql + laterSql + ")";
					System.out.println("str_three：" + str_three);
					Query query_zk = getSession().createSQLQuery(str_three);
					query_zk.setParameter(0, i);
					List<BigDecimal> zkList = query_zk.list();
					if (zkList.get(0) != null) {
						colList.add(2, zkList.get(0).toString());
					} else {
						colList.add(2, null);
					}
				}
			}
			// 民办
			String mb_sum = "SELECT SUM(s_mb) FROM t_sheetone";
			String mbSql = mb_sum;
			int k_four = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_four = "";
				// 拼接联合主键
				TSheetoneId tsoi = new TSheetoneId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findOneRowId(tsoi)) {
					k_four++;
					if (k_four != 1) {
						if (!mb_sum.contains("WHERE")) {
							mb_sum += " WHERE row_id=? (";
						}
						mb_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						mb_sum += " WHERE row_id=?";
						mb_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = mb_sum.substring(mbSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_four = mbSql + laterSql + ")";
					System.out.println("str_four：" + str_four);
					Query query_mb = getSession().createSQLQuery(str_four);
					query_mb.setParameter(0, i);
					List<BigDecimal> mbList = query_mb.list();
					if (mbList.get(0) != null) {
						colList.add(3, mbList.get(0).toString());
					} else {
						colList.add(3, null);
					}
				}
			}
			// 数据列表
			sheetOneList.add(colList);
			System.out.println(colList);
		}
		return sheetOneList;
	}

	public List<List<String>> FindTwoCountbyId(List<String> schoolIdList) {
		// 定义基本sql字符串
		String baseSql = "SELECT SUM(amount) FROM t_sheettwo";
		int baseLength = baseSql.length();

		List<List<String>> sheetTwoList = new ArrayList<List<String>>();
		// 根据学校id去查询数据库的总数
		// 遍历rowId
		List<String> colList = null;
		for (int i = 1; i <= 19; i++) {
			colList = new ArrayList<String>();
			// 添加总计
			String sql_sum = "SELECT SUM(amount) FROM t_sheettwo";
			int k_one = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_one = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				// SELECT SUM(amount) FROM t_sheettwo WHERE row_id='1' AND
				// (s_id='1') OR s_id='2')
				TSheettwoId tsoi = new TSheettwoId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findTwoRowId(tsoi)) {
					k_one++;
					if (k_one != 1) {
						if (!sql_sum.contains("WHERE")) {
							sql_sum += " WHERE row_id=? (";
						}
						sql_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sql_sum += " WHERE row_id=?";
						sql_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = sql_sum.substring(baseLength);
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_one = baseSql + laterSql + ")";
					System.out.println("str_one：" + str_one);
					Query query_sum = getSession().createSQLQuery(str_one);
					query_sum.setParameter(0, i);
					List<Double> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(0, amountList.get(0).toString());
					} else {
						colList.add(0, null);
					}
				}
			}
			System.out.println(colList + "1");
			String few_sum = "SELECT SUM(few_sum) FROM t_sheettwo";
			String fewSql = few_sum;
			int k_two = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_two = "";
				// 拼接联合主键
				TSheettwoId tsoi = new TSheettwoId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findTwoRowId(tsoi)) {
					k_two++;
					if (k_two != 1) {
						if (!few_sum.contains("WHERE")) {
							few_sum += " WHERE row_id=? (";
						}
						few_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						few_sum += " WHERE row_id=?";
						few_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = few_sum.substring(fewSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_two = fewSql + laterSql + ")";
					System.out.println("str_two：" + str_two);
					Query query_bk = getSession().createSQLQuery(str_two);
					query_bk.setParameter(0, i);
					List<Double> bkList = query_bk.list();
					if (bkList.get(0) != null) {
						colList.add(1, bkList.get(0).toString());
					} else {
						colList.add(1, null);
					}
				}
			}
			System.out.println(colList + "2");
			// 女性
			String gril_sum = "SELECT SUM(gril_sum) FROM t_sheettwo";
			String girlSql = gril_sum;
			int k_three = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_three = "";
				// 拼接联合主键
				TSheettwoId tsoi = new TSheettwoId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findTwoRowId(tsoi)) {
					k_three++;
					if (k_three != 1) {
						if (!gril_sum.contains("WHERE")) {
							gril_sum += " WHERE row_id=? (";
						}
						gril_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						gril_sum += " WHERE row_id=?";
						gril_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = gril_sum.substring(girlSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_three = girlSql + laterSql + ")";
					System.out.println("str_three：" + str_three);
					Query query_zk = getSession().createSQLQuery(str_three);
					query_zk.setParameter(0, i);
					List<Double> zkList = query_zk.list();
					if (zkList.get(0) != null) {
						colList.add(2, zkList.get(0).toString());
					} else {
						colList.add(2, null);
					}
				}
			}
			System.out.println(colList + "3");
			/* 表二核心：处理状态集合问题 */
			// 第四行
			int state_one = 0;
			String stateOne_sum = "SELECT SUM(amount) FROM t_sheettwo";
			String oneSql = stateOne_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_four = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheettwoId tsoi = new TSheettwoId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findTwoRowId(tsoi)) {
					state_one++;
					if (state_one != 1) {
						if (!stateOne_sum.contains("WHERE")) {
							stateOne_sum += " WHERE row_id=? AND school_state='0'(";
						}
						stateOne_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						stateOne_sum += " WHERE row_id=? AND school_state='0'";
						stateOne_sum += " AND( s_id='" + schoolIdList.get(j)
								+ "'";
					}
					String cutSql = stateOne_sum.substring(oneSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_four = oneSql + laterSql + ")";
					System.out.println("str_four：" + str_four);
					Query query_sum = getSession().createSQLQuery(str_four);
					query_sum.setParameter(0, i);
					List<Double> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(3, amountList.get(0).toString());
					} else {
						colList.add(3, null);
					}
				}
			}
			// 第五行
			int state_two = 0;
			String stateTwo_sum = "SELECT SUM(amount) FROM t_sheettwo";
			String twoSql = stateTwo_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_five = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheettwoId tsoi = new TSheettwoId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findTwoRowId(tsoi)) {
					state_two++;
					if (state_two != 1) {
						if (!stateTwo_sum.contains("WHERE")) {
							stateTwo_sum += " WHERE row_id=? AND school_state='1'(";
						}
						stateTwo_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						stateTwo_sum += " WHERE row_id=? AND school_state='1'";
						stateTwo_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					String cutSql = stateTwo_sum.substring(twoSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_five = twoSql + laterSql + ")";
					System.out.println("str_five：" + str_five);
					Query query_sum = getSession().createSQLQuery(str_five);
					query_sum.setParameter(0, i);
					List<Double> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(4, amountList.get(0).toString());
					} else {
						colList.add(4, null);
					}
				}
			}
			// 第六行
			int state_three = 0;
			String stateThree_sum = "SELECT SUM(amount) FROM t_sheettwo";
			String threeSql = stateThree_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_six = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheettwoId tsoi = new TSheettwoId();
				tsoi.setRowId(i);
				tsoi.setSId(schoolIdList.get(j));
				if (findTwoRowId(tsoi)) {
					state_three++;
					if (state_three != 1) {
						if (!stateThree_sum.contains("WHERE")) {
							stateThree_sum += " WHERE row_id=? AND school_state='2'(";
						}
						stateThree_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						stateThree_sum += " WHERE row_id=? AND school_state='2'";
						stateThree_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					String cutSql = stateThree_sum.substring(threeSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_six = threeSql + laterSql + ")";
					System.out.println("str_six：" + str_six);
					Query query_sum = getSession().createSQLQuery(str_six);
					query_sum.setParameter(0, i);
					List<Double> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(5, amountList.get(0).toString());
					} else {
						colList.add(5, null);
					}
				}
			}
			System.out.println(colList);
			// 数据列表
			sheetTwoList.add(colList);
			System.out.println("Go  Bug GUNGUN!! ");
		}
		return sheetTwoList;
	}

	// *********************************************************************************************************
	public List<List<String>> FindThreeCountbyId(List<String> schoolIdList) {
		// 定义基本sql字符串
		String baseSql = "SELECT SUM(amount) FROM t_sheetthree";
		int baseLength = baseSql.length();

		List<List<String>> sheetThreeList = new ArrayList<List<String>>();
		// 根据学校id去查询数据库的总数
		// 遍历rowId
		List<String> colList = null;
		for (int i = 1; i <= 11; i++) {
			colList = new ArrayList<String>();
			// 添加总计
			String sql_sum = "SELECT SUM(amount) FROM t_sheetthree";
			int k_one = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_one = "";
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					k_one++;
					if (k_one != 1) {
						if (!sql_sum.contains("WHERE")) {
							sql_sum += " WHERE row_id=? (";
						}
						sql_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sql_sum += " WHERE row_id=?";
						sql_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = sql_sum.substring(baseLength);
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_one = baseSql + laterSql + ")";
					System.out.println("str_one：" + str_one);
					Query query_sum = getSession().createSQLQuery(str_one);
					query_sum.setParameter(0, i);
					List<Double> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(0, amountList.get(0).toString());
					} else {
						colList.add(0, null);
					}
				}
			}
			String few_sum = "SELECT SUM(few_sum) FROM t_sheetthree";
			String fewSql = few_sum;
			int k_two = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_two = "";
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					k_two++;
					if (k_two != 1) {
						if (!few_sum.contains("WHERE")) {
							few_sum += " WHERE row_id=? (";
						}
						few_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						few_sum += " WHERE row_id=?";
						few_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = few_sum.substring(fewSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_two = fewSql + laterSql + ")";
					System.out.println("str_two：" + str_two);
					Query query_few = getSession().createSQLQuery(str_two);
					query_few.setParameter(0, i);
					List<Double> fewList = query_few.list();
					if (fewList.get(0) != null) {
						colList.add(1, fewList.get(0).toString());
					} else {
						colList.add(1, null);
					}
				}
			}
			// 女性
			String woman_sum = "SELECT SUM(woman_sum) FROM t_sheetthree";
			String womanSql = woman_sum;
			int k_three = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_three = "";
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					k_three++;
					if (k_three != 1) {
						if (!woman_sum.contains("WHERE")) {
							woman_sum += " WHERE row_id=? (";
						}
						woman_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						woman_sum += " WHERE row_id=?";
						woman_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = woman_sum.substring(womanSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_three = womanSql + laterSql + ")";
					System.out.println("str_three：" + str_three);
					Query query_woman = getSession().createSQLQuery(str_three);
					query_woman.setParameter(0, i);
					List<Double> womanList = query_woman.list();
					if (womanList.get(0) != null) {
						colList.add(2, womanList.get(0).toString());
					} else {
						colList.add(2, null);
					}
				}
			}
			// 研究生(小计)
			String xj_sum = "SELECT SUM(xj_sum) FROM t_sheetthree";
			String xjSql = xj_sum;
			int k_four = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_four = "";
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					k_four++;
					if (k_four != 1) {
						if (!xj_sum.contains("WHERE")) {
							xj_sum += " WHERE row_id=? (";
						}
						xj_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						xj_sum += " WHERE row_id=?";
						xj_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = xj_sum.substring(xjSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_four = xjSql + laterSql + ")";
					System.out.println("str_four：" + str_four);
					Query query_xj = getSession().createSQLQuery(str_four);
					query_xj.setParameter(0, i);
					List<Double> xjList = query_xj.list();
					if (xjList.get(0) != null) {
						colList.add(3, xjList.get(0).toString());
					} else {
						colList.add(3, null);
					}
				}
			}
			// 研究生(博士)
			String bs_sum = "SELECT SUM(bs_sum) FROM t_sheetthree";
			String bsSql = bs_sum;
			int k_five = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_five = "";
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					k_five++;
					if (k_five != 1) {
						if (!bs_sum.contains("WHERE")) {
							bs_sum += " WHERE row_id=? (";
						}
						bs_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						bs_sum += " WHERE row_id=?";
						bs_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = bs_sum.substring(bsSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_five = bsSql + laterSql + ")";
					System.out.println("str_five：" + str_five);
					Query query_bs = getSession().createSQLQuery(str_five);
					query_bs.setParameter(0, i);
					List<Double> bsList = query_bs.list();
					if (bsList.get(0) != null) {
						colList.add(4, bsList.get(0).toString());
					} else {
						colList.add(4, null);
					}
				}
			}
			// 研究生(硕士)
			String ss_sum = "SELECT SUM(ss_sum) FROM t_sheetthree";
			String ssSql = ss_sum;
			int k_six = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_six = "";
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					k_six++;
					if (k_six != 1) {
						if (!ss_sum.contains("WHERE")) {
							ss_sum += " WHERE row_id=? (";
						}
						ss_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						ss_sum += " WHERE row_id=?";
						ss_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = ss_sum.substring(ssSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_six = ssSql + laterSql + ")";
					System.out.println("str_six：" + str_six);
					Query query_ss = getSession().createSQLQuery(str_six);
					query_ss.setParameter(0, i);
					List<Double> ssList = query_ss.list();
					if (ssList.get(0) != null) {
						colList.add(5, ssList.get(0).toString());
					} else {
						colList.add(5, null);
					}
				}
			}

			/* 表三核心：处理状态集合问题 */
			// 第七行
			int state_one = 0;
			String sxj_sum = "SELECT SUM(sxj_sum) FROM t_sheetthree";
			String sxjSql = sxj_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_seven = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					state_one++;
					if (state_one != 1) {
						if (!sxj_sum.contains("WHERE")) {
							sxj_sum += " WHERE row_id=? AND school_state='0'(";
						}
						sxj_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sxj_sum += " WHERE row_id=? AND school_state='0'";
						sxj_sum += " AND( s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = sxj_sum.substring(sxjSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_seven = sxjSql + laterSql + ")";
					System.out.println("str_seven：" + str_seven);
					Query query_sxj = getSession().createSQLQuery(str_seven);
					query_sxj.setParameter(0, i);
					List<Double> sxjList = query_sxj.list();
					if (sxjList.get(0) != null) {
						// 添加两条数据
						colList.add(6, sxjList.get(0).toString());
					} else {
						colList.add(6, null);
					}
				}
			}
			// 第八行
			int state_two = 0;
			String sbk_sum = "SELECT SUM(sbk_sum) FROM t_sheetthree";
			String sbkSql = sbk_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_eight = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					state_two++;
					if (state_two != 1) {
						if (!sbk_sum.contains("WHERE")) {
							sbk_sum += " WHERE row_id=? AND school_state='0'(";
						}
						sbk_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sbk_sum += " WHERE row_id=? AND school_state='0'";
						sbk_sum += " AND( s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = sbk_sum.substring(sbkSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_eight = sbkSql + laterSql + ")";
					System.out.println("str_eight：" + str_eight);
					Query query_sbk = getSession().createSQLQuery(str_eight);
					query_sbk.setParameter(0, i);
					List<Double> sbkList = query_sbk.list();
					if (sbkList.get(0) != null) {
						// 添加两条数据
						colList.add(7, sbkList.get(0).toString());
					} else {
						colList.add(7, null);
					}
				}
			}
			// 第九行
			int state_three = 0;
			String szk_sum = "SELECT SUM(szk_sum) FROM t_sheetthree";
			String szkSql = szk_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_nine = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					state_three++;
					if (state_three != 1) {
						if (!szk_sum.contains("WHERE")) {
							szk_sum += " WHERE row_id=? AND school_state='0'(";
						}
						szk_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						szk_sum += " WHERE row_id=? AND school_state='0'";
						szk_sum += " AND( s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = szk_sum.substring(szkSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_nine = szkSql + laterSql + ")";
					System.out.println("str_nine：" + str_nine);
					Query query_szk = getSession().createSQLQuery(str_nine);
					query_szk.setParameter(0, i);
					List<Double> szkList = query_szk.list();
					if (szkList.get(0) != null) {
						// 添加两条数据
						colList.add(8, szkList.get(0).toString());
					} else {
						colList.add(8, null);
					}
				}
			}
			// 第十行
			int state_four = 0;
			String sxj1_sum = "SELECT SUM(sxj_sum) FROM t_sheetthree";
			String sxj1Sql = sxj1_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_ten = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					state_four++;
					if (state_four != 1) {
						if (!sxj1_sum.contains("WHERE")) {
							sxj1_sum += " WHERE row_id=? AND school_state='1'(";
						}
						sxj1_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sxj1_sum += " WHERE row_id=? AND school_state='1'";
						sxj1_sum += " AND( s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = sxj1_sum.substring(sxj1Sql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_ten = sxj1Sql + laterSql + ")";
					System.out.println("str_ten：" + str_ten);
					Query query_sxj = getSession().createSQLQuery(str_ten);
					query_sxj.setParameter(0, i);
					List<Double> sxjList = query_sxj.list();
					if (sxjList.get(0) != null) {
						// 添加两条数据
						colList.add(9, sxjList.get(0).toString());
					} else {
						colList.add(9, null);
					}
				}
			}
			// 第十一行
			int state_five = 0;
			String sbk1_sum = "SELECT SUM(sbk_sum) FROM t_sheetthree";
			String sbk1Sql = sbk1_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_ele = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					state_five++;
					if (state_five != 1) {
						if (!sbk1_sum.contains("WHERE")) {
							sbk1_sum += " WHERE row_id=? AND school_state='1'(";
						}
						sbk1_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sbk1_sum += " WHERE row_id=? AND school_state='1'";
						sbk1_sum += " AND( s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = sbk1_sum.substring(sbk1Sql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_ele = sbk1Sql + laterSql + ")";
					System.out.println("str_ele：" + str_ele);
					Query query_sbk = getSession().createSQLQuery(str_ele);
					query_sbk.setParameter(0, i);
					List<Double> sbkList = query_sbk.list();
					if (sbkList.get(0) != null) {
						// 添加两条数据
						colList.add(10, sbkList.get(0).toString());
					} else {
						colList.add(10, null);
					}
				}
			}
			// 第十二行
			int state_six = 0;
			String szk1_sum = "SELECT SUM(szk_sum) FROM t_sheetthree";
			String szk1Sql = szk1_sum;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_twe = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetthreeId tsei = new TSheetthreeId();
				tsei.setRowId(i);
				tsei.setSId(schoolIdList.get(j));
				if (findThreeRowId(tsei)) {
					state_six++;
					if (state_six != 1) {
						if (!szk1_sum.contains("WHERE")) {
							szk1_sum += " WHERE row_id=? AND school_state='1'(";
						}
						szk1_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						szk1_sum += " WHERE row_id=? AND school_state='1'";
						szk1_sum += " AND( s_id='" + schoolIdList.get(j) + "'";
					}
					String cutSql = szk1_sum.substring(szk1Sql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加）
					str_twe = sbk1Sql + laterSql + ")";
					System.out.println("str_twe：" + str_twe);
					Query query_szk = getSession().createSQLQuery(str_twe);
					query_szk.setParameter(0, i);
					List<Double> szkList = query_szk.list();
					if (szkList.get(0) != null) {
						// 添加两条数据
						colList.add(11, szkList.get(0).toString());
					} else {
						colList.add(11, null);
					}
				}
			}

			System.out.println(colList);
			// 数据列表
			sheetThreeList.add(colList);
		}
		return sheetThreeList;
	}

	// **********************************************************************************************************
	// 表四总表
	public List<List<String>> FindFourCountbyId(List<String> schoolIdList) {
		// 定义基本sql字符串
		String baseSql = "SELECT SUM(amount) FROM t_sheetfour";
		int baseLength = baseSql.length();
		List<List<String>> sheetFourList = new ArrayList<List<String>>();
		// 根据学校id去查询数据库的总数
		// 遍历rowId
		List<String> colList = null;
		// bug--------------------------------------------------------------
		for (int i = 1; i <= 12; i++) {
			// bug-------------------第十二条数据可以进来-------------------------------------------
			colList = new ArrayList<String>();
			// 添加总计
			String sql_sum = "SELECT SUM(amount) FROM t_sheetfour";
			int k_one = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_one = "";
				// 拼接联合主键
				TSheetfourId tsfi = new TSheetfourId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFourRowId(tsfi)) {
					// false
					k_one++;
					if (k_one != 1) {
						if (!sql_sum.contains("WHERE")) {
							sql_sum += " WHERE row_id=? (";
						}
						sql_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sql_sum += " WHERE row_id=?";
						sql_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = sql_sum.substring(baseLength);
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_one = baseSql + laterSql + ")";
					System.out.println("str_one：" + str_one);
					Query query_sum = getSession().createSQLQuery(str_one);
					query_sum.setParameter(0, i);
					List<BigDecimal> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(0, amountList.get(0).toString());
					} else {
						colList.add(0, null);
					}
				}
			}

			// 解除劳动关系
			String relation_sum = "SELECT SUM(relation) FROM t_sheetfour";
			String relationSql = relation_sum;
			int k_two = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_two = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfourId tsfi = new TSheetfourId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFourRowId(tsfi)) {
					k_two++;
					if (k_two != 1) {
						if (!relation_sum.contains("WHERE")) {
							relation_sum += " WHERE row_id=? (";
						}
						relation_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						relation_sum += " WHERE row_id=?";
						relation_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					// 截取字符串
					String cutSql = relation_sum
							.substring(relationSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_two = relationSql + laterSql + ")";
					System.out.println("str_two：" + str_two);
					Query query_relation = getSession().createSQLQuery(str_two);
					query_relation.setParameter(0, i);
					List<BigDecimal> relationList = query_relation.list();
					if (relationList.get(0) != null) {
						// 添加两条数据
						colList.add(1, relationList.get(0).toString());
					} else {
						colList.add(1, null);
					}
				}
			}
			// 离退休人员
			String retire_sum = "SELECT SUM(retire) FROM t_sheetfour";
			String retireSql = retire_sum;
			int k_three = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_three = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfourId tsfi = new TSheetfourId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFourRowId(tsfi)) {
					k_three++;
					if (k_three != 1) {
						if (!retire_sum.contains("WHERE")) {
							retire_sum += " WHERE row_id=? (";
						}
						retire_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						retire_sum += " WHERE row_id=?";
						retire_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					// 截取字符串
					String cutSql = retire_sum.substring(retireSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_three = retireSql + laterSql + ")";
					System.out.println("str_three：" + str_three);
					Query query_retire = getSession().createSQLQuery(str_three);
					query_retire.setParameter(0, i);
					List<BigDecimal> retireList = query_retire.list();
					if (retireList.get(0) != null) {
						// 添加两条数据
						colList.add(2, retireList.get(0).toString());
					} else {
						colList.add(2, null);
					}
				}
			}
			// 高校毕业生
			String graduate_sum = "SELECT SUM(graduate) FROM t_sheetfour";
			String graduateSql = graduate_sum;
			int k_four = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_four = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfourId tsfi = new TSheetfourId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFourRowId(tsfi)) {
					k_four++;
					if (k_four != 1) {
						if (!graduate_sum.contains("WHERE")) {
							graduate_sum += " WHERE row_id=? (";
						}
						graduate_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						graduate_sum += " WHERE row_id=?";
						graduate_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					// 截取字符串
					String cutSql = graduate_sum
							.substring(graduateSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_four = graduateSql + laterSql + ")";
					System.out.println("str_four：" + str_four);
					Query query_graduate = getSession()
							.createSQLQuery(str_four);
					query_graduate.setParameter(0, i);
					List<BigDecimal> graduateList = query_graduate.list();
					if (graduateList.get(0) != null) {
						// 添加两条数据
						colList.add(3, graduateList.get(0).toString());
					} else {
						colList.add(3, null);
					}
				}
			}
			// 其他
			String other_sum = "SELECT SUM(other) FROM t_sheetfour";
			String otherSql = other_sum;
			int k_five = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_five = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfourId tsfi = new TSheetfourId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFourRowId(tsfi)) {
					k_five++;
					if (k_five != 1) {
						if (!other_sum.contains("WHERE")) {
							other_sum += " WHERE row_id=? (";
						}
						other_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						other_sum += " WHERE row_id=?";
						other_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = other_sum.substring(otherSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_five = otherSql + laterSql + ")";
					System.out.println("str_five：" + str_five);
					Query query_other = getSession().createSQLQuery(str_five);
					query_other.setParameter(0, i);
					List<BigDecimal> otherList = query_other.list();
					if (otherList.get(0) != null) {
						// 添加两条数据
						colList.add(4, otherList.get(0).toString());
					} else {
						colList.add(4, null);
					}
				}
			}

			// 数据列表
			// 第十二条数据加不进去，造成bug····················································
			sheetFourList.add(colList);
			// 第十二条数据加不进去，造成bug····················································
			System.out.println(colList);
		}
		return sheetFourList;
	}

	public List<List<String>> FindFiveCountbyId(List<String> schoolIdList) {
		// 定义基本sql字符串
		String baseSql = "SELECT SUM(sum) FROM t_sheetfive";
		int baseLength = baseSql.length();
		List<List<String>> sheetFiveList = new ArrayList<List<String>>();
		// 根据学校id去查询数据库的总数
		// 遍历rowId
		List<String> colList = null;
		// bug--------------------------------------------------------------
		for (int i = 1; i <= 7; i++) {
			// bug-------------------第十二条数据可以进来-------------------------------------------
			colList = new ArrayList<String>();
			// 添加总计
			String sql_sum = "SELECT SUM(sum) FROM t_sheetfive";
			int k_one = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_one = "";
				// 拼接联合主键
				TSheetfiveId tsfi = new TSheetfiveId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFiveRowId(tsfi)) {
					// false
					k_one++;
					if (k_one != 1) {
						if (!sql_sum.contains("WHERE")) {
							sql_sum += " WHERE row_id=? (";
						}
						sql_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						sql_sum += " WHERE row_id=?";
						sql_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = sql_sum.substring(baseLength);
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_one = baseSql + laterSql + ")";
					System.out.println("str_one：" + str_one);
					Query query_sum = getSession().createSQLQuery(str_one);
					query_sum.setParameter(0, i);
					List<BigDecimal> amountList = query_sum.list();
					if (amountList.get(0) != null) {
						// 添加两条数据
						colList.add(0, amountList.get(0).toString());
					} else {
						colList.add(0, null);
					}
				}
			}

			// 解除劳动关系
			String relation_sum = "SELECT SUM(emp) FROM t_sheetfive";
			String relationSql = relation_sum;
			int k_two = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_two = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfiveId tsfi = new TSheetfiveId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFiveRowId(tsfi)) {
					k_two++;
					if (k_two != 1) {
						if (!relation_sum.contains("WHERE")) {
							relation_sum += " WHERE row_id=? (";
						}
						relation_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						relation_sum += " WHERE row_id=?";
						relation_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					// 截取字符串
					String cutSql = relation_sum
							.substring(relationSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_two = relationSql + laterSql + ")";
					System.out.println("str_two：" + str_two);
					Query query_relation = getSession().createSQLQuery(str_two);
					query_relation.setParameter(0, i);
					List<BigDecimal> relationList = query_relation.list();
					if (relationList.get(0) != null) {
						// 添加两条数据
						colList.add(1, relationList.get(0).toString());
					} else {
						colList.add(1, null);
					}
				}
			}
			// 离退休人员
			String retire_sum = "SELECT SUM(retire) FROM t_sheetfive";
			String retireSql = retire_sum;
			int k_three = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_three = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfiveId tsfi = new TSheetfiveId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFiveRowId(tsfi)) {
					k_three++;
					if (k_three != 1) {
						if (!retire_sum.contains("WHERE")) {
							retire_sum += " WHERE row_id=? (";
						}
						retire_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						retire_sum += " WHERE row_id=?";
						retire_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					// 截取字符串
					String cutSql = retire_sum.substring(retireSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_three = retireSql + laterSql + ")";
					System.out.println("str_three：" + str_three);
					Query query_retire = getSession().createSQLQuery(str_three);
					query_retire.setParameter(0, i);
					List<BigDecimal> retireList = query_retire.list();
					if (retireList.get(0) != null) {
						// 添加两条数据
						colList.add(2, retireList.get(0).toString());
					} else {
						colList.add(2, null);
					}
				}
			}
			// 高校毕业生
			String graduate_sum = "SELECT SUM(graduate) FROM t_sheetfive";
			String graduateSql = graduate_sum;
			int k_four = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_four = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfiveId tsfi = new TSheetfiveId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFiveRowId(tsfi)) {
					k_four++;
					if (k_four != 1) {
						if (!graduate_sum.contains("WHERE")) {
							graduate_sum += " WHERE row_id=? (";
						}
						graduate_sum += " OR s_id='" + schoolIdList.get(j)
								+ "'";
					} else {
						graduate_sum += " WHERE row_id=?";
						graduate_sum += " AND (s_id='" + schoolIdList.get(j)
								+ "'";
					}
					// 截取字符串
					String cutSql = graduate_sum
							.substring(graduateSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_four = graduateSql + laterSql + ")";
					System.out.println("str_four：" + str_four);
					Query query_graduate = getSession()
							.createSQLQuery(str_four);
					query_graduate.setParameter(0, i);
					List<BigDecimal> graduateList = query_graduate.list();
					if (graduateList.get(0) != null) {
						// 添加两条数据
						colList.add(3, graduateList.get(0).toString());
					} else {
						colList.add(3, null);
					}
				}
			}
			// 其他
			String other_sum = "SELECT SUM(other) FROM t_sheetfive";
			String otherSql = other_sum;
			int k_five = 0;
			for (int j = 0; j < schoolIdList.size(); j++) {
				String str_five = "";
				// 如果没有学校的话，添加条件：and 1=0;
				// 拼接联合主键
				TSheetfiveId tsfi = new TSheetfiveId();
				tsfi.setRowId(i);
				tsfi.setSId(schoolIdList.get(j));
				if (findFiveRowId(tsfi)) {
					k_five++;
					if (k_five != 1) {
						if (!other_sum.contains("WHERE")) {
							other_sum += " WHERE row_id=? (";
						}
						other_sum += " OR s_id='" + schoolIdList.get(j) + "'";
					} else {
						other_sum += " WHERE row_id=?";
						other_sum += " AND (s_id='" + schoolIdList.get(j) + "'";
					}
					// 截取字符串
					String cutSql = other_sum.substring(otherSql.length());
					String laterSql = cutSql.replace(")", "");
					// 对产生的新字符串加
					str_five = otherSql + laterSql + ")";
					System.out.println("str_five：" + str_five);
					Query query_other = getSession().createSQLQuery(str_five);
					query_other.setParameter(0, i);
					List<BigDecimal> otherList = query_other.list();
					if (otherList.get(0) != null) {
						// 添加两条数据
						colList.add(4, otherList.get(0).toString());
					} else {
						colList.add(4, null);
					}
				}
			}

			// 数据列表
			// 第十二条数据加不进去，造成bug····················································
			sheetFiveList.add(colList);
			// 第十二条数据加不进去，造成bug····················································
			System.out.println(colList);
		}
		return sheetFiveList;
	}

}
