package com.sephiroth.wzcbase.VO.cms.ar.ContractHeader;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@ApiModel(value = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractHeaderFindOutVO {

  /**
   * 档案头表主键ID
   */
  @ApiModelProperty(value = "档案头表主键ID")
  private String arHeaderId;
  /**
   * 合同主键ID
   */
  @ApiModelProperty(value = "合同主键ID")
  private String ctId;
  /**
   * 合同编码
   */
  @ApiModelProperty(value = "合同编码")
  private String ctCode;
  /**
   * 合同名称
   */
  @ApiModelProperty(value = "合同名称")
  private String ctName;
  /**
   * 版本号
   */
  @ApiModelProperty(value = "版本号")
  private String versionNo;
  /**
   * 档案状态（已存档：10；已寄出：20；已借出：30；已归还：40；已归档：50）
   */
  @ApiModelProperty(value = "档案状态（已存档：10；已寄出：20；已借出：30；已归还：40；已归档：50）")
  private String archivesStaus;
  /**
   * 最近收件人工号
   */
  @ApiModelProperty(value = "最近收件人工号")
  private String lastReceiveUserNo;
  /**
   * 最近收件人姓名
   */
  @ApiModelProperty(value = "最近收件人姓名")
  private String lastReceiveUserName;
  /**
   * 最近发件人工号
   */
  @ApiModelProperty(value = "最近发件人工号")
  private String lastSendUserNo;
  /**
   * 最近发件人姓名
   */
  @ApiModelProperty(value = "最近发件人姓名")
  private String lastSendUserName;
  /**
   * 最近借出人工号
   */
  @ApiModelProperty(value = "最近借出人工号")
  private String lastLoanUserNo;
  /**
   * 最近借出人姓名
   */
  @ApiModelProperty(value = "最近借出人姓名")
  private String lastLoanUserName;
  /**
   * 最近借出时间
   */
  @ApiModelProperty(value = "最近借出时间")
  private java.sql.Date lastLoanData;
  /**
   * 最近预计归还日期
   */
  @ApiModelProperty(value = "最近预计归还日期")
  private java.sql.Date lastPlanRetrunData;
  /**
   * 最近归还人工号
   */
  @ApiModelProperty(value = "最近归还人工号")
  private String lastReturnUserNo;
  /**
   * 最近归还人姓名
   */
  @ApiModelProperty(value = "最近归还人姓名")
  private String lastReturnUserName;
  /**
   * 最近归档人工号
   */
  @ApiModelProperty(value = "最近归档人工号")
  private String lastArchivesUserNo;
  /**
   * 最近归档人姓名
   */
  @ApiModelProperty(value = "最近归档人姓名")
  private String lastArchivesUserName;
  /**
   * 备注
   */
  @ApiModelProperty(value = "备注")
  private String memo;
  /**
   * 描述
   */
  @ApiModelProperty(value = "描述")
  private String notes;
  /**
   * 有效性 （有效：1，失效：2；删除：3）
   */
  @ApiModelProperty(value = "有效性 （有效：1，失效：2；删除：3）")
  private String enableFlag;
  /**
   * 创建时间
   */
  @ApiModelProperty(value = "创建时间")
  private java.sql.Date createdDate;
  /**
   * 创建人
   */
  @ApiModelProperty(value = "创建人")
  private String createdBy;
  /**
   * 更新时间
   */
  @ApiModelProperty(value = "更新时间")
  private java.sql.Date updatedDate;
  /**
   * 更新人
   */
  @ApiModelProperty(value = "更新人")
  private String updatedBy;
  /**
   * 公司代码
   */
  @ApiModelProperty(value = "公司代码")
  private String companyCode;
  /**
   * 排序号
   */
  @ApiModelProperty(value = "排序号")
  private String orderNo;

}
