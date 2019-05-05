package com.anoyi.controller;

import com.anoyi.bean.WebResponse;
import com.anoyi.properties.CustomProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/custom")
@EnableConfigurationProperties(CustomProperties.class)
public class ApplicationController {

    private final CustomProperties customProperties;

    @GetMapping("/name")
    public WebResponse name(){
        String name = customProperties.getName();
        return WebResponse.success(name);
    }

}
