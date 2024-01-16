package com.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${wangi.value}")
    private String configStr;

    @GetMapping("/config")
    public String getConfigStr() {
        return configStr;
    }
}
