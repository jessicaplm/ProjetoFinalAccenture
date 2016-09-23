package service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PersonDAO;
import model.Person;

@ManagedBean(name="personService")
@SessionScoped
@Service
@Transactional(readOnly=true)
public class PersonServiceImpl implements PersonService{

	private PersonDAO personDAO; 
	
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional(readOnly=false)
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		this.personDAO.addPerson(p);
	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return this.personDAO.listPersons();
	}

	@Override
	@Transactional(readOnly=false)
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		this.personDAO.updatePerson(p);
	}

	@Override
	@Transactional(readOnly=false)
	public void removePersonById(int id) {
		// TODO Auto-generated method stub
		this.personDAO.removePersonById(id);
	}

}
