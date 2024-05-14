package com.vaznoe.thescore.config;

import com.vaznoe.thescore.pages.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vaznoe.thescore.pages")
public class PageConfig {

    @Bean
    public WelcomePage welcomePage() {
        return new WelcomePage();
    }

    @Bean
    public ScoresPage scoresPage() {
        return new ScoresPage();
    }
}
