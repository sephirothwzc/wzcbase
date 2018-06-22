package com.sephiroth.wzcbase.services.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetInVO;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetOutVO;

/**
 * 合同大类
 */
public interface LargeContractTypeServices {

    PageInfo<LargeContractTypeGetOutVO> getOutVOPageInfo(LargeContractTypeGetInVO param);
}
