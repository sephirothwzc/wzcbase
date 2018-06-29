package com.sephiroth.wzcbase.controller.cms.si;

import com.github.pagehelper.PageInfo;
import com.sephiroth.wzcbase.VO.cms.si.ContractVersion.*;
import com.sephiroth.wzcbase.services.cms.si.ContractVersionServices;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Api(value = "")
@RestController
public class ContractVersionController {
    
    @Autowired
    private ContractVersionServices bizServices;
    
    @ApiOperation("Get:支持条件查询分页获取")
    @GetMapping(value = "ContractVersion")
    public PageInfo<ContractVersionGetOutVO> getOutVOPageInfo(ContractVersionGetInVO param) {
        return bizServices.getOutVOPageInfo(param,ContractVersionGetOutVO.class);
    }
    
    @ApiOperation("Get:根据key获取，通常用于修改")
    @GetMapping(value = "ContractVersion/{id}")
    public ContractVersionFindOutVO findById(@PathVariable("id") String id) {
        return bizServices.findById(id,ContractVersionFindOutVO.class);
    }
    
    @ApiOperation(value = "Put:根据key修改，返回受影响行数")
    @PutMapping(value = "ContractVersion")
    public int putUpdate(@Validated ContractVersionAddInVO param) {
        return bizServices.putUpdate(param);
    }
    
    @ApiOperation(value = "Post:新增，返回受影响行数")
    @PostMapping(value = "ContractVersion")
    public int postInsert(@Validated ContractVersionUpdInVO param) {
        return bizServices.postInsert(param);
    }

}
