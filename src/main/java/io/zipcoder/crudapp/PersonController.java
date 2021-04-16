package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    PersonRepository personRepository;

    //@RequestMapping(value = "/people", method = RequestMethod.POST)
    @PostMapping("/people")
    public Person create(@RequestBody Person p){
       return personRepository.save(p);
    }

    //@RequestMapping(value = "/people{id}",method = RequestMethod.GET)
    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable Long id){
        return personRepository.findOne(id);
    }

    //@RequestMapping(value = "/people",method = RequestMethod.GET)
    @GetMapping("/people")
    public List<Person> getPersonList(){
        List<Person> returnList = new ArrayList<>();
        for(Person p : personRepository.findAll()){
            returnList.add(p);
        }
        return returnList;
    }

    //@RequestMapping(value = "/people/{id}",method = RequestMethod.PUT)
    @PutMapping("/people")
    public Person updatePerson(Person p){
        Person temp = personRepository.findOne(p.getId());
        temp.setFirstName(p.getFirstName());
        temp.setLastName(p.getLastName());
        return personRepository.save(temp);
    }

    //@RequestMapping(value = "/people/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/people/{id}")
    public void deletePerson(Long id){
        personRepository.delete(id);
    }

}
