package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Endereco;


@Repository
public class EnderecoDAOImpl implements EnderecoDAO {

	private static final Logger logger = LoggerFactory.getLogger(EnderecoDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addEndereco(Endereco e) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(e);
		logger.info("Endereco salvo com sucesso, detalhes:" + e);
	}

	@Override
	public List<Endereco> listEndereco() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Endereco> enderecoList = session.createQuery("from Endereco").list();
		for (Endereco e : enderecoList) {
			logger.info("Endereco da lista= " + e);
		}
		return enderecoList;
	}

	@Override
	public void updateEndereco(Endereco e) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(e);
		logger.info("Endereco atualizado= " + e);
	}

	@Override
	public void removeEnderecoById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Endereco e = (Endereco) session.load(Endereco.class, new Integer(id));
		if (null != e) {

			session.delete(e);
		}
		logger.info("Endereco deletado com sussesso, detalhes = " + e);
	}

}
