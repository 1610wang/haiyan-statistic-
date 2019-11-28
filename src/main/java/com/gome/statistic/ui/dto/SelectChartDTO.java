package com.gome.statistic.ui.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 4:01 PM
 */
@Data
public class SelectChartDTO {
    //@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String startDate;

    //@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String endDate;
}
