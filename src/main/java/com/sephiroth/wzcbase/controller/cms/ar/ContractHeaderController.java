package com.sephiroth.wzcbase.controller.cms.ar;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.ar.ContractHeader.*;
import com.sephiroth.wzcbase.services.cms.ar.ContractHeaderServices;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Api(value = "")
@RestController
public class ContractHeaderController {
    
    @Autowired
    private ContractHeaderServices bizServices;
    
    @ApiOperation("Get:支持有条件查询分页获取")
    @GetMapping(value = "ContractHeader")
    public PageInfo<ContractHeaderGetOutVO> getOutVOPageInfo(ContractHeaderGetInVO param) {
        return bizServices.getOutVOPageInfo(param,ContractHeaderGetOutVO.class);
    }
    
    @ApiOperation("Get:根据key获取，通常用于修改")
    @GetMapping(value = "ContractHeader/{id}")
    public ContractHeaderFindOutVO findById(@PathVariable("id") String id) {
        return bizServices.findById(id,ContractHeaderFindOutVO.class);
    }
    
    @ApiOperation(value = "Put:根据key修改，返回受影响行数")
    @PutMapping(value = "ContractHeader")
    public int putUpdate(@Validated ContractHeaderAddInVO param) {
        return bizServices.putUpdate(param);
    }
    
    @ApiOperation(value = "Post:新增，返回受影响行数")
    @PostMapping(value = "ContractHeader")
    public int postInsert(@Validated ContractHeaderUpdInVO param) {
        return bizServices.postInsert(param);
    }

}
