package com.example.demo.handbreak;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.car;

@Repository
public interface carRepository extends JpaRepository<car, Long> {

}

