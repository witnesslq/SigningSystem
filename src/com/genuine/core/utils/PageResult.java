package com.genuine.core.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页助手。
 */
public class PageResult {

	// 总记录：
	private long totalCount;
	// 当前页：
	private int pageNo;
	// 总页数：
	private int totalPageCount;
	// 页大小：
	private int pageSize;
	// 记录列表：
	private List items;

	public PageResult(long totalCount, int pageNo, int pageSize, List items) {
		
		this.items = items != null ? items : new ArrayList();
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		if (totalCount > 0) {
			this.pageNo = pageNo;
			//计算当前页记录数
			int temp = (int) (totalCount / pageSize);
			this.totalPageCount = (totalCount % pageSize) == 0 ? temp : (temp + 1);
		} else { // 没记录的时候什么都不显示
			this.pageNo = 0;
			this.totalPageCount = 0;
		}
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

}
