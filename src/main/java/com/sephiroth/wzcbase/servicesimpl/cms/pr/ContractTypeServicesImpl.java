package com.sephiroth.wzcbase.servicesimpl.cms.pr;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetInVO;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetOutVO;
import com.sephiroth.wzcbase.dao.ContractTypeDao;
import com.sephiroth.wzcbase.services.cms.pr.ContractTypeServices;
import com.sephiroth.wzcbase.utilscommon.MockVO;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractTypeServicesImpl implements ContractTypeServices {

    /**
     * 有条件分页查询获取合同大类
     * @param param
     * @return
     */
    @Override
    public PageInfo<LargeContractTypeGetOutVO> getLargeOutVOPageInfo(LargeContractTypeGetInVO param) {
        val resultPage = new PageInfo<LargeContractTypeGetOutVO>();
        resultPage.setList(MockVO.mockList(LargeContractTypeGetOutVO.class, param.getPageSize()));
        resultPage.setTotal(100);
        return resultPage;
    }
}
