package com.jhy.demo.repository;

import com.jhy.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Integer> { }

