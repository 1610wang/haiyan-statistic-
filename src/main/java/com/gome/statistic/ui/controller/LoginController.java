//package com.gome.statistic.ui.controller;
//
//import com.gome.statistic.infrastructure.exception.ServiceException;
//import com.gome.statistic.infrastructure.feign.DTO.MessageDTO;
//import com.gome.statistic.infrastructure.feign.OpsturnInterface;
//import com.gome.statistic.ui.base.BaseController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @Author: wenjie
// * @Date: 2019/9/19 3:25 PM
// */
//@RestController
//public class LoginController extends BaseController {
//
//    @Autowired
//    private OpsturnInterface opsturnInterface;
//
//    @PostMapping("/api/v1/login")
//    public ResponseEntity login(@RequestParam("username")String username,@RequestParam("password") String password) {
//        OpsturnInterface.Result result = opsturnInterface.messageToMeiBan(messageDTO);
//        if("发送失败".equals(result.getStatus())){
//            throw new ServiceException("send.meiban.message.error");
//        }
//        return ok(result.getStatus());
//    }
//}
