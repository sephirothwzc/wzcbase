package com.sephiroth.wzcbase.controller.cms.pr;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.pr.ContractTypeLarge.*;
import com.sephiroth.wzcbase.services.cms.pr.ContractTypeServices;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "Put:根据key修改，返回受影响行数")
    @PutMapping(value = "ContractTypeLarge")
    public int putUpdate(@Validated PutUpdateInVO param) {
        return contractTypeServices.putUpdate(param);
    }

    @ApiOperation(value = "Post:新增，返回受影响行数")
    @PostMapping(value = "ContractTypeLarge")
    public int postInsert(@Validated PostInsertInVO param) {
        return contractTypeServices.postInsert(param);
    }
}
