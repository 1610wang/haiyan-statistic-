package com.gome.statistic.domain.service.impl;

import com.gome.statistic.domain.constant.DateConstant;
import com.gome.statistic.domain.service.HaiyanUserAnalyseService;
import com.gome.statistic.infrastructure.mysql.mapper.ext.HaiyanUserAnalyseEntityExtMapper;
import com.gome.statistic.ui.controller.vo.UserChartVO;
import com.gome.statistic.ui.dto.SelectChartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 4:12 PM
 */
@Service
public class HaiyanUserAnalyseServiceImpl implements HaiyanUserAnalyseService {

    @Autowired
    private HaiyanUserAnalyseEntityExtMapper haiyanUserAnalyseEntityExtMapper;
    /**
     * 查询用户图表
     * @param selectChartDTO
     * @return
     */
    @Override
    public List<UserChartVO> selectUserChart(SelectChartDTO selectChartDTO) {
        List<UserChartVO> userChartVOS = new ArrayList<>();
       // System.out.println(DateConstant.getByConstant(selectChartDTO.getStartDate()));
        List<HaiyanUserAnalyseEntityExtMapper.LoginCountVO> loginCountVOS = haiyanUserAnalyseEntityExtMapper.getLoginCount(DateConstant.getByConstant(selectChartDTO.getStartDate()), DateConstant.getByConstant(selectChartDTO.getEndDate()));
        List<HaiyanUserAnalyseEntityExtMapper.UserCountVO> userCountVOS = haiyanUserAnalyseEntityExtMapper.getUserCount(DateConstant.getByConstant(selectChartDTO.getStartDate()), DateConstant.getByConstant(selectChartDTO.getEndDate()));
        System.out.println("-------"+ DateConstant.getByValue("2019-03-29 00:00:00"));
        for(HaiyanUserAnalyseEntityExtMapper.LoginCountVO vo : loginCountVOS){
            System.out.println(vo.getStartTime());
            System.out.println(DateConstant.getByValue(vo.getStartTime()));
            userChartVOS.add(new UserChartVO(null,vo.getCount(),1000, DateConstant.getByValue(vo.getStartTime())));
        }
        return userChartVOS;
    }
}
