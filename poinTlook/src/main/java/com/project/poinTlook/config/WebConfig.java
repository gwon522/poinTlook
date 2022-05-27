package com.project.poinTlook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // TODO Auto-generated method stub
        registry.addMapping("/api/**").allowCredentials(true).allowedOrigins("http://localhost:3000");
        WebMvcConfigurer.super.addCorsMappings(registry);
    }
    
}
