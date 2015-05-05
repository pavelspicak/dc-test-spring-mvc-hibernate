package com.dcThree.springMvcHibernate.service.dao;

import com.dcThree.springMvcHibernate.entity.Person;

import java.util.List;

/**
 * User: spicak
 * Date: 5.5.15
 * Time: 8:37
 */
public interface PersonDAO {
    public void addPerson(Person p);

    public void updatePerson(Person p);

    public List<Person> listPersons();

    public Person getPersonById(int id);

    public void removePerson(int id);
}
