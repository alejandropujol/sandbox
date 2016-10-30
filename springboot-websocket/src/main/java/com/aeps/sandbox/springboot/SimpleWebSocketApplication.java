package com.aeps.sandbox.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Alejandro on 10/28/2016.
 */
@SpringBootApplication
public class SimpleWebSocketApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebSocketApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SimpleWebSocketApplication.class);
    }

}