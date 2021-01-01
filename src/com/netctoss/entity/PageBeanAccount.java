package com.netctoss.entity;

import java.util.Arrays;
import java.util.List;

public class PageBeanAccount {
	private int pageNum;
	private int pageCount;
	private int pageSize;
	private int totalSize;
	private int firstPageNum;
	
	@Override
	public String toString() {
		return "PageBeanAccount [pageNum=" + pageNum + ", pageCount=" + pageCount + ", pageSize=" + pageSize
				+ ", totalSize=" + totalSize + ", firstPageNum=" + firstPageNum + ", previousPageNum=" + previousPageNum
				+ ", nextPageNum=" + nextPageNum + ", everyPageStart=" + everyPageStart + ", everyPageEnd="
				+ everyPageEnd + ", list=" + list + ", params=" + Arrays.toString(params) + ", url=" + url + ", where="
				+ where + ", hasPreviou=" + hasPreviou + ", hasNext=" + hasNext + "]";
	}
	private int previousPageNum;
	private int nextPageNum;
	
	private int everyPageStart;
	private int everyPageEnd;
	
	private List<Account> list;
	private String[] params;
	
	private String url;
	private String where;
	
	private boolean hasPreviou;
	private boolean hasNext;
		
	
	public PageBeanAccount(int pageNum, int pageCount, int pageSize, int totalSize, int firstPageNum,
			int previousPageNum, int nextPageNum, int everyPageStart, int everyPageEnd, List<Account> list,
			String[] params, String url, String where, boolean hasPreviou, boolean hasNext) {
		super();
		this.pageNum = pageNum;
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
		this.firstPageNum = firstPageNum;
		this.previousPageNum = previousPageNum;
		this.nextPageNum = nextPageNum;
		this.everyPageStart = everyPageStart;
		this.everyPageEnd = everyPageEnd;
		this.list = list;
		this.params = params;
		this.url = url;
		this.where = where;
		this.hasPreviou = hasPreviou;
		this.hasNext = hasNext;
	}
	public PageBeanAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFirstPageNum() {
		return firstPageNum;
	}
	public void setFirstPageNum(int firstPageNum) {
		this.firstPageNum = firstPageNum;
	}
	public int getPreviousPageNum() {
		return previousPageNum;
	}
	public void setPreviousPageNum(int previousPageNum) {
		this.previousPageNum = previousPageNum;
	}
	public int getNextPageNum() {
		return nextPageNum;
	}
	public void setNextPageNum(int nextPageNum) {
		this.nextPageNum = nextPageNum;
	}
	public int getEveryPageStart() {
		return everyPageStart;
	}
	public void setEveryPageStart(int everyPageStart) {
		this.everyPageStart = everyPageStart;
	}
	public int getEveryPageEnd() {
		return everyPageEnd;
	}
	public void setEveryPageEnd(int everyPageEnd) {
		this.everyPageEnd = everyPageEnd;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public boolean getHasPreviou() {
		return hasPreviou;
	}
	public void setHasPreviou(boolean hasPreviou) {
		this.hasPreviou = hasPreviou;
	}
	public boolean getHasNext() {
		return hasNext;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String[] getParams() {
		return params;
	}
	public void setParams(String[] params) {
		this.params = params;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public List<Account> getList() {
		return list;
	}
	public void setList(List<Account> list) {
		this.list = list;
	}
	
}
