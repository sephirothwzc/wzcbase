package com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge;

import com.sephiroth.wzcbase.utilsbase.PageQueryInVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel("合同大类有条件分页查询InVO")
public class ContractTypeLargeGetInVO extends PageQueryInVO {

    /**
     * key
     */
    @ApiModelProperty("key")
    private String ctTypeId;

    /**
     * 编码
     */
    @ApiModelProperty("编码")
    private String ctTypeCode;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String ctTypeName;

    /**
     * 简码
     */
    @ApiModelProperty("简码")
    private String shortName;

    /**
     * 是否有效 1有效 0无效
     */
    @ApiModelProperty("是否有效 1有效 0无效")
    private String enableFlag;
}
