package com.sephiroth.wzcbase.servicesimpl.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetInVO;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetOutVO;
import com.sephiroth.wzcbase.services.cms.pr.LargeContractTypeServices;
import org.springframework.stereotype.Service;

@Service
public class LargeContractTypeServicesImpl implements LargeContractTypeServices {

    /**
     * 有条件分页查询获取合同大类
     * @param param
     * @return
     */
    @Override
    public PageInfo<LargeContractTypeGetOutVO> getOutVOPageInfo(LargeContractTypeGetInVO param) {
        return null;
    }
}
