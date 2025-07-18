package com.naphat.firstLearnSpring.repository;
import com.naphat.firstLearnSpring.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository implements PersonDAO{
    private EntityManager entityManager;

    @Autowired
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        entityManager.persist(person);
    }

    @Override
    @Transactional
    public void deletePerson(int id) {
        Person person = entityManager.find(Person.class,id);
        entityManager.remove(person);
    }

    @Override
    public Person getPerson(int id) {
        return entityManager.find(Person.class,id);
    }

    @Override
    public List<Person> getAllPersons() {
        TypedQuery<Person> query =  entityManager.createQuery("from Person", Person.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updatePerson(Person person) {
        entityManager.merge(person);
    }
}
