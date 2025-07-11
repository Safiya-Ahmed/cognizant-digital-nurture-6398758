package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")  // Load XML bean config
public class SpringLearnApplication {

    public static void main(String[] args) {
        System.out.println("SpringLearnApplication started... ✅");
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}
