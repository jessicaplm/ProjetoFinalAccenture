package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.accenture.academico.model.Pessoa;

@Repository
public class PessoaDAOImpl implements PessoaDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(PessoaDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person salva com sussesso no banco, detalhes= " + p);
	}

	@Override
	public List<Pessoa> listPessoa() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Pessoa> pessoaList = session.createQuery("from Pessoa").list();
		for (Pessoa p : pessoaList) {

			logger.info("Person da lista= " + p);

		}
		return pessoaList;
	}

	@Override
	public void updatePessoa(Pessoa p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(p);

		logger.info("Person atualizada Dados = " + p);
	}

	@Override
	public void removePessoaById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Pessoa p = (Pessoa) session.load(Pessoa.class, new Integer(id));
		if (null != p) {

			session.delete(p);
		}
		logger.info("Person deletada com sussesso, detalhes = " + p);
	}

}
