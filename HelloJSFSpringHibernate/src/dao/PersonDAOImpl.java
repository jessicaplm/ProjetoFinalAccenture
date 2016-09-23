package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(PersonDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Pessoa salva com sussesso no banco, detalhes= " + p);
	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		for (Person p : personsList) {
			
			logger.info("Pessoa da lista= " + p);

		}
		return personsList;
	}

	@Override
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
	
		logger.info("pessoa atualizada Dados = " + p);
	}

	@Override
	public void removePersonById(int id) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		Person p  = (Person)session.load(Person.class, new Integer(id));
		if (null!=p) {
			
			session.delete(p);
		}
		logger.info("Pessoa deletada com sussesso, detalhes = " +p);
	}

}
