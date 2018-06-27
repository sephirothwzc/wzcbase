package com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("合同大类修改入参")
public class PutUpdateInVO {


    @ApiModelProperty(value = "key", required = true)
    @NotNull
    @Length(max = 50)
    private String ctTypeId;

    /**
     * 编码
     */
    @ApiModelProperty(value = "编码", required = true)
    @NotNull
    @Length(max = 20)
    private String ctTypeCode;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", required = true)
    @NotNull
    @Length(max = 50)
    private String ctTypeName;

    /**
     * 简码
     */
    @ApiModelProperty(value = "简码", required = true)
    @NotNull
    @Length(max = 50)
    private String shortName;

    /**
     * 是否有效 1有效 0无效
     */
    @ApiModelProperty("是否有效 1有效 0无效")
    private String enableFlag;

}
