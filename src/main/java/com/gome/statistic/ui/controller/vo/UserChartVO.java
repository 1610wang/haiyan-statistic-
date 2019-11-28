package com.gome.statistic.ui.controller.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: wenjie
 * @Date: 2019/9/23 4:07 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserChartVO {
    private Integer userCount;
    private Integer loginCount;
    private Integer target;
    private String time;
}
