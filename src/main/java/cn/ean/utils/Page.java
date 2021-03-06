package cn.ean.utils;

import java.util.List;

/**
 * FileName:Page
 * Author:ean
 * Date:2021/8/7 11:47 下午
 **/
public class Page<T> {
    private int total;    // 总条数
    private int page;     // 当前页
    private int size;     // 每页数
    private List<T> rows; // 结果集

    @Override
    public String toString() {
        return "Page{" +
                "total=" + total +
                ", page=" + page +
                ", size=" + size +
                ", rows=" + rows +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
