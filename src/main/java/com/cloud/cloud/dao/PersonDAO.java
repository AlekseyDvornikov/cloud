package com.cloud.cloud.dao;

import com.cloud.cloud.entities.Person;

import java.util.List;


public interface PersonDAO {

    public void save(Person p);

    public List<Person> list();

}
