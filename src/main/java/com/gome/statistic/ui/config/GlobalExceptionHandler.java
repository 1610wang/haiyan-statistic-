package com.gome.statistic.ui.config;

import com.gome.statistic.infrastructure.exception.ServiceException;
import com.gome.statistic.ui.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * @Author: wenjie
 * @Date: 2019/9/19 3:32 PM
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends BaseController {
    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public Object serviceException(HttpServletRequest request,
                                   ServiceException exception) {
        return error(exception);
    }
}
