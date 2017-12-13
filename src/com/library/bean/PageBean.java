package com.library.bean;

import java.util.List;

public class PageBean {
	private int currentNum;  
	private int currentPage; 
	private int totalPage;	
	private int totalCount;	 
	private List<Book> list; 
	public int getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Book> getList() {
		return list;
	}
	public void setList(List<Book> list) {
		this.list = list;
	}
	
}
