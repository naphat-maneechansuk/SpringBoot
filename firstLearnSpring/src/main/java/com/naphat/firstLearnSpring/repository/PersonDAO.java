package com.naphat.firstLearnSpring.repository;

import com.naphat.firstLearnSpring.entity.Person;

import java.util.List;

public interface PersonDAO {
    void savePerson(Person person);
    void deletePerson(int id);
    Person getPerson(int id);
    List<Person> getAllPersons();
    void updatePerson(Person person);
}
