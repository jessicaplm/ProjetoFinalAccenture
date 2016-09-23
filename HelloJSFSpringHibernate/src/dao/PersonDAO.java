package dao;

import java.util.List;

import model.Person;

public interface PersonDAO {

	public void addPerson(Person p );
	public List<Person> listPersons();
	public void updatePerson(Person p );
	public void removePersonById(int id );
}
