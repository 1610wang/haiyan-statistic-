package com.gome.statistic.ui.controller;

import com.gome.statistic.domain.service.HaiyanUserAnalyseService;
import com.gome.statistic.infrastructure.exception.ServiceException;
import com.gome.statistic.infrastructure.feign.DTO.MessageDTO;
import com.gome.statistic.infrastructure.feign.OpsturnInterface;
import com.gome.statistic.ui.base.BaseController;
import com.gome.statistic.ui.controller.vo.UserChartVO;
import com.gome.statistic.ui.dto.SelectChartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wenjie
 * @Date: 2019/9/19 3:25 PM
 */
@RestController
public class HaiyanStatisticController extends BaseController {

    @Autowired
    private HaiyanUserAnalyseService haiyanUserAnalyseService;

    @GetMapping("/api/v1/user/chart")
    public ResponseEntity getUserChart(@RequestBody SelectChartDTO selectChartDTO) {
        List<UserChartVO> userChartVOS = haiyanUserAnalyseService.selectUserChart(selectChartDTO);
        return ok(userChartVOS);
    }
}
