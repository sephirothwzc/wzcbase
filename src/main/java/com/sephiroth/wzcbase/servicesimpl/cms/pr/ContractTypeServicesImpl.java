package com.sephiroth.wzcbase.servicesimpl.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.services.cms.pr.ContractTypeServices;
import org.springframework.stereotype.Service;

@Service
public class ContractTypeServicesImpl implements ContractTypeServices {

    /**
     * 有条件分页查询获取合同大类
     * @param param
     * @return
     */
    @Override
    public <S,T> PageInfo<S> getOutVOPageInfo(T param) {
        return null;
    }
}
