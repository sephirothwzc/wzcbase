package com.sephiroth.wzcbase.utilsbase;

import lombok.Data;

@Data
public class PageQueryInVO {

    /**
     * 排序 顺序
     */
    private Boolean descending;

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 每页行数
     */
    private Integer pageSize = 10;

    /**
     * 总行数？未知
     */
    private Integer totalItems;
}
