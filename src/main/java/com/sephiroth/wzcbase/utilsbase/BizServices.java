package com.sephiroth.wzcbase.utilsbase;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.*;

/**
 * services 超级父类
 */
public interface BizServices {

    <S,T extends PageQueryInVO> PageInfo<S> getOutVOPageInfo(T param,Class<S> clazz);

    <T> T findById(String id,Class<T> clazz);

    <T> int putUpdate(T param);

    <T> int postInsert(T param);
}
