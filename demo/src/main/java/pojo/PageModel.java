package pojo;

import java.io.Serializable;
import java.util.List;

public class PageModel<T> implements Serializable {  
	  
    private static final long serialVersionUID = -3198048449643774660L;  
  
    private int pageNow; // 当前页数  
  
    private int pageSize; // 每页显示记录的条数
    
    private List<T> rows;
    
  

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}