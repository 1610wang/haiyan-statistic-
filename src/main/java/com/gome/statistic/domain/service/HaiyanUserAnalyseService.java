package com.gome.statistic.domain.service;

import com.gome.statistic.ui.controller.vo.UserChartVO;
import com.gome.statistic.ui.dto.SelectChartDTO;

import java.util.List;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 3:57 PM
 */
public interface HaiyanUserAnalyseService {

    /**
     * 查询用户图表
     * @param selectChartDTO
     * @return
     */
    public List<UserChartVO> selectUserChart(SelectChartDTO selectChartDTO);
}
