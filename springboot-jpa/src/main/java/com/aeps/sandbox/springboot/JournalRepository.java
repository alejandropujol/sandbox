package com.aeps.sandbox.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Alejandro on 10/27/2016.
 */
public interface JournalRepository extends JpaRepository<Journal, Long> {

    List<Journal> findByTitleContaining(String word);

    @Query("select j from Journal j where j.id <> ?1")
    List<Journal> findByCustomQuery(long id);

}