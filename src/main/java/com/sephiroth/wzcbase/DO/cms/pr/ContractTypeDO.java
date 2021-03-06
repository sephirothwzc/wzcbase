package com.sephiroth.wzcbase.DO.cms.pr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractTypeDO {

    private String ctTypeId;

    /**
     * 编码
     */
    private String ctTypeCode;

    /**
     * 名称
     */
    private String ctTypeName;

    /**
     * 简码
     */
    private String shortName;

    /**
     * 是否有效 1有效 0无效
     */
    private String enableFlag;

    /**
     *
     */
    private String createBy;
}
