package com.cdy.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

/**
 * todo
 * Created by 陈东一
 * 2018/7/29 10:28
 */
@Controller
@Slf4j
public class IstioController {
    @Value("${version}")
    private String version;
    
    @RequestMapping("/version")
    @ResponseBody
    public String version(){
        log.info(version);
        return version;
    }
    
    @RequestMapping("/timeout")
    @ResponseBody
    public String timeout(@RequestParam(value = "time") Integer time){
        log.info("timeout");
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            log.error(e.getMessage(),e);
            return e.getMessage();
        }
        return version;
    }

}
