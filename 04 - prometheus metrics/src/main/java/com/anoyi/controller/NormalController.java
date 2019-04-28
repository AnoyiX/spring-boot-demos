package com.anoyi.controller;

import com.anoyi.bean.WebResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class NormalController {

    @GetMapping("/sleep")
    public WebResponse sleep(@RequestParam("time") Integer time) throws Exception{
        log.info("Wait {}s ...", time);
        Thread.sleep(time * 1000);
        log.info("----------------------");
        return WebResponse.success();
    }

}
