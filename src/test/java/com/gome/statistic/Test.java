package com.gome.statistic;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanUserAnalyseEntity;
import com.gome.statistic.infrastructure.mysql.mapper.HaiyanUserAnalyseEntityMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 3:42 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    HaiyanUserAnalyseEntityMapper haiyanUserAnalyseEntityMapper;

    @org.junit.Test
    public void test(){
        HaiyanUserAnalyseEntity haiyanUserAnalyseEntity = haiyanUserAnalyseEntityMapper.selectByPrimaryKey(150L);
        System.out.println(haiyanUserAnalyseEntity);
    }
}
