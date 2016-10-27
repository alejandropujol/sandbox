package com.aeps.sandbox.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by Alejandro on 10/26/2016.
 */
@Service
public class JournalService {

    private static final Logger log = LoggerFactory.getLogger(JournalService.class);

    @Autowired
    JournalRepository repository;

    public void insertData() throws ParseException {
        log.info("> Inserting data...");

        repository.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2016"));
        repository.save(new Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", "01/02/2016"));
        repository.save(new Journal("Spring Boot Reading", "Read more about Spring Boot", "02/01/2016"));
        repository.save(new Journal("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "03/01/2016"));

        log.info("> Done.");
    }

    public List<Journal> findAll(){
        return repository.findAll();
    }

    public List<Journal> findByTitleContaining(String word){
        return repository.findByTitleContaining(word);
    }

    public List<Journal> findByCustomQuery(long id){
        return repository.findByCustomQuery(id);
    }

}