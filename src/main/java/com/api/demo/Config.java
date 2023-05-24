/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author pedro
 */
@Configuration
public class Config {


@Bean
public WebMvcConfigurer corsConfigurer() {
     return new WebMvcConfigurerAdapter() {
        @Override
public void addCorsMappings(CorsRegistry registry) {
             registry.addMapping("/**")
               .allowedOrigins("http://domain2.com")
               .allowedMethods("PUT", "DELETE")
               .allowedHeaders("header1", "header2", "header3")
               .exposedHeaders("header1", "header2")
               .allowCredentials(false).maxAge(3600);
       }
    };
  }
}
