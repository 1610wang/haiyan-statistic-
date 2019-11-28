package com.gome.statistic.infrastructure.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 异常接口
 * @Author: wenjie
 * @Date: 2019/9/19 2:38 PM
 */
@JsonIgnoreProperties(value = {"cause","stackTrace","message","localizedMessage","suppressed"})
public interface IException {
    /**
     * 异常代码
     * @return
     */
    String getCode();

    /**
     * 异常消息
     * @return
     */
    String getMsg();
}
