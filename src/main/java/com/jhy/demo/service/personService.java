package com.jhy.demo.service;

import com.jhy.demo.entity.Person;
import org.springframework.stereotype.Service;

@Service
public interface personService {

    String findAll();

    String savePerson(Person p);

    String updatePerson(Person p);

    String deletePersonById(Integer id);
}
