package com.jhy.demo.repository;

import com.jhy.demo.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void findAll() {
        System.out.println(personRepository.findAll());
    }

    @Test
    void add() {
        System.out.println(personRepository.save(new Person(3, "a", "a123", "普通用户")));
    }

    @Test
    void update() {
        System.out.println(personRepository.save(new Person(3, "aa", "a123", "普通用户")));
    }

    @Test
    void delete() {

    }
}