package com.demo.testingsonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingSonarApplication {

    public static void main(String[] args) {
        String s = "this is a test";
        SpringApplication.run(TestingSonarApplication.class, args);
    }
}
