package com.gome.statistic.infrastructure.feign.DTO;

import lombok.Data;

import java.util.List;

/**
 * @Author: wenjie
 * @Date: 2019/9/19 4:26 PM
 */
@Data
public class MessageDTO {
    String reminder;
    String title;
    String content;
    List<String> users;
}
