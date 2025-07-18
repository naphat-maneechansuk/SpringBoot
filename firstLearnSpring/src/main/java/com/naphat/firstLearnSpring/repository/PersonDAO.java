package com.naphat.firstLearnSpring.repository;

import com.naphat.firstLearnSpring.entity.Person;

public interface PersonDAO {
    void savePerson(Person person);
    void deletePerson(int id);
    Person getPerson(int id);
}
