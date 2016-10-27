package com.aeps.sandbox.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Alejandro on 10/26/2016.
 */
@SpringBootApplication
public class SimpleJpaApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SimpleJpaApplication.class);

    @Autowired
    protected JournalService service;

    public static void main(String[] args) {
        SpringApplication.run(SimpleJpaApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("@@ Inserting Data....");
        service.insertData();

        log.info("@@ findAll() call...");
        service.findAll().forEach(entry -> log.info(entry.toString()));

        log.info("@@ findByTitleContaining('Cloud') call...");
        service.findByTitleContaining("Cloud").forEach(entry -> log.info(entry.toString()));

        log.info("@@ findByCustomQuery(2) call...");
        service.findByCustomQuery(2).forEach(entry -> log.info(entry.toString()));
    }

}