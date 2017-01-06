package pojo;

import java.io.Serializable;

public class Page implements Serializable{
	
	private int offset;
	private int pageSize=10;
	private int currentPage=1;
	private int pageCount;
	private int total;
	
	public int getOffset() {
		offset=pageSize*(currentPage-1);
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize){
		this.pageSize=pageSize;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
		pageCount=((total%pageSize)==0)?(total/pageSize):(total/pageSize+1);
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		offset=(currentPage-1)*pageSize;
	}
}
