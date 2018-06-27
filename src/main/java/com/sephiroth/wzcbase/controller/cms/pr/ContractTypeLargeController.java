package com.sephiroth.wzcbase.controller.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.ContractTypeLargeGetInVO;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.ContractTypeLargeGetOutVO;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.FindByIdGetOutVO;
import com.sephiroth.wzcbase.services.cms.pr.ContractTypeServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api("合同大类")
@RestController
public class ContractTypeLargeController {

    @Autowired
    private ContractTypeServices contractTypeServices;

    @ApiOperation("Get:支持有条件查询分页获取合同大类")
    @GetMapping(value = "ContractTypeLarge")
    public PageInfo<ContractTypeLargeGetOutVO> getOutVOPageInfo(ContractTypeLargeGetInVO param) {
        return contractTypeServices.getLargeOutVOPageInfo(param);
    }

    @ApiOperation("Get:根据key获取合同大类，通常用于修改")
    @GetMapping(value = "ContractTypeLarge/{ctTypeid}")
    public FindByIdGetOutVO findById(@PathVariable("ctTypeid") String id) {
        return contractTypeServices.findById(id);
    }

//    public int putUpdate(@Validated PutUpdateInVO param) {
//        return contractTypeServices.putUpdate(param);
//    }
}
