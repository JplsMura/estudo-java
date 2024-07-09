package CRUD.Domain.DAO;

import CRUD.Domain.entity.Person;

import java.util.List;

public interface PersonDAOInterface {
    void addPerson(Person person);
    List<Person> getAllPeople();
    boolean updatePerson(Person person);
    boolean deletePerson(int id);
}
