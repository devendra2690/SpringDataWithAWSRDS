package com.devendrabrain.rds.SpringDataWithAWSRDS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRespository personRespository;

    public Person create(Person person) {
      return  personRespository.save(person);
    };

    public List<Person> findAll() {
        return personRespository.findAll();
    }
}
