package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.accenture.academico.model.Telefone;

@Repository
public class TelefoneDAOImpl implements TelefoneDAO {

	private static final Logger logger = LoggerFactory.getLogger(TelefoneDAOImpl.class);

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addTelefone(Telefone t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Telefone saved successfully, Telefone Details="+t);
	}
	
	@Override
	public void updateTelefone(Telefone t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(t);

		logger.info("Telefone atualizado, Dados = " + t);
	}
	
	@Override
	public void removeTelefoneById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Telefone t = (Telefone) session.load(Telefone.class, new Integer(id));
		if (null != t) {

			session.delete(t);
		}
		logger.info("Telefone deletado com sussesso, detalhes = " + t);
	}
	
	@Override
	public List<Telefone> listTelefones() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Telefone> telefonesList = session.createQuery("from Telefone").list();
		for(Telefone t : telefonesList) {
			logger.info("Telefone List::"+t);
		}
		return telefonesList;
	}




}
