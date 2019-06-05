package com.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageBean implements Serializable{
	
	private int currentPage;//当前页
	private int pageSize=5;//每页显示的条数
	private int totalPage;//总页数
	private int count;//总数
	private List<StuInfo> pageData=new ArrayList<StuInfo>();
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<StuInfo> getPageData() {
		return pageData;
	}
	public void setPageData(List<StuInfo> pageData) {
		this.pageData = pageData;
	}
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageBean(int currentPage, int pageSize, int totalPage, int count,
			List<StuInfo> pageData) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.count = count;
		this.pageData = pageData;
	}
	public PageBean(int currentPage, int totalPage, int count,
			List<StuInfo> pageData) {
		super();
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.count = count;
		this.pageData = pageData;
	}
	
	
	
	
}
