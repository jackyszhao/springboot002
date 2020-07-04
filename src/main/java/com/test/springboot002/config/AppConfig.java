package com.test.springboot002.config;

import com.test.springboot002.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
