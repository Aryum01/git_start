package com.example.interceptor.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.example.interceptor.interceptors.APILoggingInterceptor;
import com.example.interceptor.interceptors.LegacyInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new APILoggingInterceptor());
        registry.addInterceptor(new LegacyInterceptor());
    }
}