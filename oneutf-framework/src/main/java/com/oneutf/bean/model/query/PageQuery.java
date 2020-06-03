package com.oneutf.bean.model.query;

import lombok.Data;

/**
 * @author 分页查询
 */
@Data
public class PageQuery {

    /**
     * 每页数量
     */
    private Integer limit;

    /**
     * 页数
     */
    private Integer page;

    public Integer getLimit() {
        return this.limit != null && this.limit > 0 ? this.limit : 10;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return this.page != null && this.page > 0 ? this.page : 1;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
