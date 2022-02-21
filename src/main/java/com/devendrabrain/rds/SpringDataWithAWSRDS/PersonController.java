package com.devendrabrain.rds.SpringDataWithAWSRDS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public Person create(@RequestBody Person person) {
         return personService.create(person);
    }

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }

}
