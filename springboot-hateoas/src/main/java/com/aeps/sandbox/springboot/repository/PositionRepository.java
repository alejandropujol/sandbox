package com.aeps.sandbox.springboot.repository;

import com.aeps.sandbox.springboot.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alejandro on 10/30/2016.
 */
public interface PositionRepository extends JpaRepository<Position, Integer> {}