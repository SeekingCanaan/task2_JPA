package com.jhy.demo.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jhy.demo.entity.Person;
import com.jhy.demo.repository.PersonRepository;
import com.jhy.demo.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class userServiceImpl implements personService {


    @Autowired
    private PersonRepository personRepository;

    @Override
    public String findAll() {

        List<Person> users = personRepository.findAll();

        Map<String, Object> map = new HashMap<>();

        map.put("data", users);

        return JSON.toJSONString(map);
    }

    @Override
    public String savePerson(Person user) {

        Person save = personRepository.save(user);

        Map<String, Object> map = new HashMap<>();

        map.put("data", save);

        map.put("msg", "添加成功");

        return JSON.toJSONString(map);
    }

    @Override
    public String updatePerson(Person user) {
        Person save = personRepository.save(user);

        Map<String, Object> map = new HashMap<>();

        map.put("data", save);

        map.put("msg", "更新成功");

        return JSON.toJSONString(map);
    }

    @Override
    public String deletePersonById(Integer id) {
        personRepository.deleteById(id);
        Map<String, Object> map = new HashMap<>();

        map.put("msg", "删除成功");

        return JSON.toJSONString(map);
    }


}
