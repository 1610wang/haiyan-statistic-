package com.gome.statistic.infrastructure.exception;

import com.gome.statistic.infrastructure.util.MessageUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务异常类
 * @Author: wenjie
 * @Date: 2019/9/19 3:12 PM
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ServiceException extends RuntimeException implements IException {
    private transient String code;

    private transient String msg;

    public ServiceException(String messageCode,Object[] param) {
        String message = MessageUtil.getMessage(messageCode, param);
        String[] split = message.split("[|]");
        this.code = split[0];
        this.msg = split[1];
    }

    public ServiceException(String messageCode) {
        this(messageCode,new Object[]{});
    }
}
