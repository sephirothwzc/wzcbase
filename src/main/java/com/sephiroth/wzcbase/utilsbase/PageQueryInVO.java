package com.sephiroth.wzcbase.utilsbase;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("分页查询入参")
@Data
public class PageQueryInVO {

    /**
     * 排序 顺序
     */
    @ApiModelProperty("排序顺序 true|false")
    private Boolean descending;

    @ApiModelProperty("排序字段")
    private String sortBy;

    /**
     * 页码
     */
    @ApiModelProperty("页码")
    private Integer pageNum;

    /**
     * 每页行数
     */
    @ApiModelProperty("每页行数")
    private Integer pageSize = 10;

    /**
     * 总行数？未知
     */
    @ApiModelProperty("总行数")
    private Integer totalItems;
}
