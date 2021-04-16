package io.zipcoder.crudapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;


    public Person(String firstName,String lastName, Integer id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public Person() {

    }
}
