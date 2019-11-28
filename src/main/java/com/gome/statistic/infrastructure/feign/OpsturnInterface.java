package com.gome.statistic.infrastructure.feign;

import com.gome.statistic.infrastructure.feign.DTO.MessageDTO;
import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: wenjie
 * @Date: 2019/9/19 4:24 PM
 */
@FeignClient(url = "${base.opsturnUrl}", name = "opsturn",configuration = SpringEncoder.class)
public interface OpsturnInterface {
    @RequestMapping(method = RequestMethod.POST, value = "/v1/dq-mb/")
    Result messageToMeiBan(@RequestBody MessageDTO messageDTO);

    @Data
    class Result{
        String status;
    }
}
