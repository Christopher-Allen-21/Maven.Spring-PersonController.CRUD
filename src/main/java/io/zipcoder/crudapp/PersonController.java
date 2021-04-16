package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {


    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public Person create(@RequestBody Person p){
       // return new ResponseEntity<Person>();
        return null;
    }

    @RequestMapping(value = "/people{id}",method = RequestMethod.GET)
    public Person findOne(Integer id){
        //return new ResponseEntity<Person>();
        return null;
    }

    @RequestMapping(value = "/people",method = RequestMethod.GET)
    public List<Person> findAll(){
        return null;
    }

    @RequestMapping(value = "/people/{id}",method = RequestMethod.PUT)
    public Person save(Person p){
        return null;
    }

    @RequestMapping(value = "/people/{id}",method = RequestMethod.DELETE)
    public void delete(Integer id){

    }

}
