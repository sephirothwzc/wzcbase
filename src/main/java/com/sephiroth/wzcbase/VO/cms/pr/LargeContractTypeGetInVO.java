package com.sephiroth.wzcbase.VO.cms.pr;

import com.sephiroth.wzcbase.utilsbase.PageQueryInVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LargeContractTypeGetInVO extends PageQueryInVO {

    /**
     * key
     */
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
}
