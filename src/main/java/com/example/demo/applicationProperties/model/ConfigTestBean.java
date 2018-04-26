package com.example.demo.applicationProperties.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/4/26.
 */
@Configuration
@ConfigurationProperties(prefix = "com.md")
@PropertySource("classpath:test.properties")

public class ConfigTestBean {
    private String name;
    private String want;
    // 省略getter和setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}