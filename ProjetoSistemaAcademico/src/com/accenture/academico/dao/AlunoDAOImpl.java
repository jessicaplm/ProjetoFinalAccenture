package com.accenture.academico.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Aluno;


@Repository
public class AlunoDAOImpl implements AlunoDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(AlunoDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addAluno(Aluno a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Aluno salva com sussesso no banco, detalhes= " + a);
	}

	@Override
	public List<Aluno> listAluno() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Aluno> alunoList = session.createQuery("from Aluno").list();
		for (Aluno a : alunoList) {
			
			logger.info("Aluno da lista= " + a);

		}
		return alunoList;
	}

	@Override
	public void updateAluno(Aluno a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(a);
	
		logger.info("Aluno atualizada Dados = " + a);
	}

	@Override
	public void removeAlunoById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Aluno a  = (Aluno)session.load(Aluno.class, new Integer(id));
		if (null!=a) {
			
			session.delete(a);
		}
		logger.info("Aluno deletada com sussesso, detalhes = " +a);
	}

}
