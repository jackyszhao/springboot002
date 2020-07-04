package com.test.springboot002;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.test.springboot002.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
class Springboot002ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        log.info("=======This is @Slf4j test=========");
        System.out.println(person);
    }

    @Test
    void testHelloServcie(){
        boolean b = ioc.containsBean("helloService");
        log.info("helloSerivce is :" + b);
    }

}
