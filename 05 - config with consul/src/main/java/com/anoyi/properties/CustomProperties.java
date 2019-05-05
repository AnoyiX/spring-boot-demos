package com.anoyi.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.anoyi.custom")
@Data
public class CustomProperties {

    private String name;

}
