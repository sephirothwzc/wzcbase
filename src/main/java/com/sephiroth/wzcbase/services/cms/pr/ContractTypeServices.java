package com.sephiroth.wzcbase.services.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.ContractTypeLargeGetInVO;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.ContractTypeLargeGetOutVO;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.FindByIdGetOutVO;

/**
 * 合同大类
 */
public interface ContractTypeServices {

    PageInfo<ContractTypeLargeGetOutVO> getLargeOutVOPageInfo(ContractTypeLargeGetInVO param);

    FindByIdGetOutVO findById(String id);

//    int putUpdate(PutUpdateInVO param);
}
