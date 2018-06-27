package com.sephiroth.wzcbase.servicesimpl.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.*;
import com.sephiroth.wzcbase.services.cms.pr.ContractTypeServices;
import com.sephiroth.wzcbase.utilscommon.MockVO;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class ContractTypeServicesImpl implements ContractTypeServices {

    /**
     * 有条件分页查询获取合同大类
     * @param param
     * @return
     */
    @Override
    public PageInfo<ContractTypeLargeGetOutVO> getLargeOutVOPageInfo(ContractTypeLargeGetInVO param) {
        val resultPage = new PageInfo<ContractTypeLargeGetOutVO>();
        resultPage.setList(MockVO.mockList(ContractTypeLargeGetOutVO.class, param.getPageSize()));
        resultPage.setTotal(100);
        return resultPage;
    }

    /**
     * 根据主键获取合同大类
     * @param id
     * @return
     */
    @Override
    public FindByIdGetOutVO findById(String id) {
        val outVO = new FindByIdGetOutVO();
        outVO.setCtTypeId(id);
        outVO.setCtTypeCode("编码");
        outVO.setCtTypeName("ceshiname");
        outVO.setEnableFlag("1");
        outVO.setShortName("jm");
        outVO.setMemo("beizhucawadfjsldkfjasldkjflksdjfalkj");
        return outVO;
    }

    @Override
    public int putUpdate(PutUpdateInVO param) {
        return 1;
    }

    @Override
    public int postInsert(PostInsertInVO param) {
        return 1;
    }
}
