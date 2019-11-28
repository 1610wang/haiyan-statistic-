package com.gome.statistic.ui.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gome.statistic.infrastructure.exception.IException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wenjie
 * @Date: 2019/9/19 3:16 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {
    /** 状态true or false */
    private Boolean status;
    /** 错误信息*/
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private IException err;
    /** 返回的业务数据*/
    private Object data;
}
