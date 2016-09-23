package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.accenture.academico.model.Titulo;

@Repository
public class TituloDAOImpl implements TituloDAO {

	private static final Logger logger = LoggerFactory.getLogger(TituloDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addTitulo(Titulo t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Título salvo com sucesso. Detalhes do titulo: " + t);

	}

	@Override
	public List<Titulo> listTitulo() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Titulo> tituloList = session.createQuery("from Titulo").list();
		for (Titulo t : tituloList) {
			logger.info("Titulo da lista:" + t);

		}
		return tituloList;
	}

	@Override
	public void updateTitulo(Titulo t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(t);

		logger.info("Titulo atualizado. Dados: " + t);
	}

	@Override
	public void removeTituloById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Titulo t = (Titulo) session.load(Titulo.class, new Integer(id));
		if (null != t) {

			session.delete(t);
		}
		logger.info("Titulo deletado com sussesso. Detalhes: " + t);
	}

}
