package com.jhy.demo.controller;

import com.jhy.demo.entity.Person;
import com.jhy.demo.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class personController {

    @Autowired
    private personService personService;

    @GetMapping("/person")
    public String findAll() {
        return personService.findAll();
    }

    @PostMapping("/person")
    public String savePerson(@RequestBody Person p) {
        return personService.savePerson(p);
    }

    @PutMapping("/person")
    public String updatePerson(@RequestBody Person p) {
        return personService.updatePerson(p);
    }

    @DeleteMapping("/person/{id}")
    public String deletePersonById(@PathVariable Integer id) {
        return personService.deletePersonById(id);
    }
}
