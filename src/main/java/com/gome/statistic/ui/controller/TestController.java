package com.gome.statistic.ui.controller;

import com.gome.statistic.infrastructure.exception.ServiceException;
import com.gome.statistic.infrastructure.mysql.entity.HaiyanUserAnalyseEntity;
import com.gome.statistic.infrastructure.mysql.mapper.HaiyanUserAnalyseEntityMapper;
import com.gome.statistic.ui.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wenjie
 * @Date: 2019/9/19 3:25 PM
 */
@RestController
public class TestController extends BaseController {

    @Autowired
    private HaiyanUserAnalyseEntityMapper haiyanUserAnalyseEntityMapper;
    @GetMapping("/api/v1/test/exception")
    public ResponseEntity exceptionTest() {
        throw new ServiceException("user.info.not.exist");
        //return ok("xx");
    }

    @GetMapping("/api/v1/test/orm")
    public ResponseEntity ormTest(){
        //HaiyanUserAnalyseEntity haiyanUserAnalyseEntity = haiyanUserAnalyseEntityMapper.selectByPrimaryKey(150L);
        return ok("xxxxxxxx");
    }
}
