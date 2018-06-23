package com.sephiroth.wzcbase.services.cms.pr;

import com.github.pagehelper.PageInfo;

/**
 * 合同大类
 */
public interface ContractTypeServices {

    <S,T> PageInfo<S> getOutVOPageInfo(T param);
}
