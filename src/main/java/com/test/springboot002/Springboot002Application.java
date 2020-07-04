package com.test.springboot002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:beans.xml")
@SpringBootApplication
public class Springboot002Application {

    public static void main(String[] args) {

        SpringApplication.run(Springboot002Application.class, args);

    }

}
