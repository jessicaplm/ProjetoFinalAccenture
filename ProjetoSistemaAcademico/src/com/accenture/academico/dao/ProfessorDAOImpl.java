package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Aluno;
import com.accenture.academico.model.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

	
	private static final Logger logger = LoggerFactory
			.getLogger(ProfessorDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addProfessor(Professor p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Professor salva com sussesso no banco, detalhes= " + p);
	}

	@Override
	public List<Professor> listProfessor() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Professor> professorList = session.createQuery("from Professor").list();
		for (Professor p : professorList) {
			
			logger.info("Professor da lista= " + p);

		}
		return professorList;
	}

	@Override
	public void updateProfessor(Professor p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(p);
	
		logger.info("Professor atualizada Dados = " + p);
	}

	@Override
	public void removeProfessorById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Professor p  = (Professor)session.load(Professor.class, new Integer(id));
		if (null!=p) {
			
			session.delete(p);
		}
		logger.info("Professor deletada com sussesso, detalhes = " +p);
	}

}
