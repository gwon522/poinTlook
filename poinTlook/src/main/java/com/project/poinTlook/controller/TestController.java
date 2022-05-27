package com.project.poinTlook.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test")
    public String test(){
        logger.info("테스트컨트롤러의 테스트 메서드");
        return "test";
    }

    @RequestMapping("/ip")
    public ResponseEntity<String> ip(HttpServletRequest req){
        logger.info("테스트컨트롤러의 테스트 메서드");
        logger.info(req.toString());
        return ResponseEntity.ok(req.getRemoteAddr());
    }
}

