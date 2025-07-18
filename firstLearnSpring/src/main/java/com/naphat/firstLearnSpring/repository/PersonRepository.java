package com.naphat.firstLearnSpring.repository;
import com.naphat.firstLearnSpring.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

}
