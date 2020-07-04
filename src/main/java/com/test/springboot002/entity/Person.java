package com.test.springboot002.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
//@PropertySource(value = {"classpath:person.properties"}, encoding="utf8")
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private int age;
    private String email;

//    @Override
//    public String toString(){
//        return "name: " + name + " age: " + age + " email: " + email;
//    }


}
