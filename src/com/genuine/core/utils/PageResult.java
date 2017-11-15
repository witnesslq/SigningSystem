package com.genuine.core.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳ���֡�
 */
public class PageResult {

	// �ܼ�¼��
	private long totalCount;
	// ��ǰҳ��
	private int pageNo;
	// ��ҳ����
	private int totalPageCount;
	// ҳ��С��
	private int pageSize;
	// ��¼�б�
	private List items;

	public PageResult(long totalCount, int pageNo, int pageSize, List items) {
		
		this.items = items != null ? items : new ArrayList();
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		if (totalCount > 0) {
			this.pageNo = pageNo;
			//���㵱ǰҳ��¼��
			int temp = (int) (totalCount / pageSize);
			this.totalPageCount = (totalCount % pageSize) == 0 ? temp : (temp + 1);
		} else { // û��¼��ʱ��ʲô������ʾ
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
