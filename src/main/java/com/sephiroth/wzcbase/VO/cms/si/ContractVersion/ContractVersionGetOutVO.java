package com.sephiroth.wzcbase.VO.cms.si.ContractVersion;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@ApiModel(value = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractVersionGetOutVO {

  /**
   * 合同编号
   */
  @ApiModelProperty(value = "合同编号")
  private String contractNo;
  /**
   * 合同名称
   */
  @ApiModelProperty(value = "合同名称")
  private String contractName;
  /**
   * 版本号
   */
  @ApiModelProperty(value = "版本号")
  private String versionNo;
  /**
   * 状态
   */
  @ApiModelProperty(value = "状态")
  private String status;

}
