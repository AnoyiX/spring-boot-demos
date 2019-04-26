package com.anoyi.controller;

import com.anoyi.bean.WebResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogController {

    @GetMapping("/error")
    public WebResponse error(){
        log.error("------------- ERROR -------------");
        return WebResponse.success();
    }

    @GetMapping("/warn")
    public WebResponse warn(){
        log.warn("------------- WARN -------------");
        return WebResponse.success();
    }

    @GetMapping("/info")
    public WebResponse info(){
        log.info("------------- INFO -------------");
        return WebResponse.success();
    }

    @GetMapping("/debug")
    public WebResponse debug(){
        log.debug("------------- DEBUG -------------");
        return WebResponse.success();
    }

    @GetMapping("/trace")
    public WebResponse trace(){
        log.trace("------------- TRACE -------------");
        return WebResponse.success();
    }

}
