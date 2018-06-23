package com.sephiroth.wzcbase.controller.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetInVO;
import com.sephiroth.wzcbase.VO.cms.pr.LargeContractTypeGetOutVO;
import com.sephiroth.wzcbase.services.cms.pr.ContractTypeServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("合同大类")
@RestController
public class LargeContractTypeController {

    @Autowired
    private ContractTypeServices contractTypeServices;

    @ApiOperation("Get:支持有条件查询分页获取合同大类")
    @GetMapping(value = "LargeContractType")
    public PageInfo<LargeContractTypeGetOutVO> getOutVOPageInfo(LargeContractTypeGetInVO param) {
        return contractTypeServices.getLargeOutVOPageInfo(param);
    }
}
