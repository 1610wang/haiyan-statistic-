package com.gome.statistic.infrastructure.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * 消息工具类
 * @Author: wenjie
 * @Date: 2019/9/19 3:14 PM
 */
@Slf4j
public class MessageUtil {
    private static ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();

    static {
        messageSource.setCacheSeconds(-1);
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());
        messageSource.setBasenames("/i18n/messages");
    }

    public static String getMessage(String messageCode, Object[] params) {
        String message = "";
        try {
            Locale locale = LocaleContextHolder.getLocale();
            message = messageSource.getMessage(messageCode, params, locale);
        } catch (Exception e) {
            log.error("parse message error! ", e);
        }
        return message;
    }
}
