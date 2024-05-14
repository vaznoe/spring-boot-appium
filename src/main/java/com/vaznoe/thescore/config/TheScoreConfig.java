package com.vaznoe.thescore.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@ComponentScan("com.vaznoe.thescore")
@PropertySource(value = "classpath:application.properties")
public class TheScoreConfig {

    @Bean
    public AndroidConfig androidConfig() {
        com.codeborne.selenide.Configuration.browserSize = null;
        com.codeborne.selenide.Configuration.browser = AndroidConfig.class.getName();
        return new AndroidConfig();
    }
}
