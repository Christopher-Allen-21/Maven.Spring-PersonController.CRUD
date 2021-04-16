package io.zipcoder.crudapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {


    private @Id @GeneratedValue(strategy = GenerationType.AUTO)Long id;

    private String firstName;
    private String lastName;

    public Person(String firstName,String lastName, Long id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Person() {

    }

    public Long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
