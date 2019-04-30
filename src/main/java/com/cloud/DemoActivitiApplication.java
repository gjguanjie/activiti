package com.cloud;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoActivitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoActivitiApplication.class, args);
    }

}
