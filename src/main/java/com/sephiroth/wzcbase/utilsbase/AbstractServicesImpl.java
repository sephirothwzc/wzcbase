package com.sephiroth.wzcbase.utilsbase;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.utilscommon.MockVO;
import lombok.val;

public abstract class AbstractServicesImpl implements BizServices {

    public abstract <D> D getDAO();

    public <S,T extends PageQueryInVO> PageInfo<S> getOutVOPageInfo(T param,Class<S> clazz) {
        val resultPage = new PageInfo<S>();
        resultPage.setList(MockVO.mockList(clazz, param.getPageSize()));
        resultPage.setTotal(100);
        return resultPage;
    }

    public <T> T findById(String id,Class<T> clazz) {
        return MockVO.mockList(clazz, 1).get(0);
    }

    public <T> int putUpdate(T param) {
        return 1;
    }

    public <T> int postInsert(T param) {
        return 1;
    }
}
