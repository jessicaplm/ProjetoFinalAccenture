package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Publicacao;



@Repository
public class PublicacaoDAOImpl implements PublicacaoDAO{
	
	//Traz o log do sgbd
	private static final Logger logger = LoggerFactory.getLogger(PublicacaoDAOImpl.class);
	
	//Cria a sessão do bd para poder implementar os metodos
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void createPublicacao(Publicacao p) {
		//abre a sessão com o bd
		Session session = this.sessionFactory.getCurrentSession();
		// salva o objeto no banco de dados
		session.persist(p);
		logger.info("publicação criada, publicação Details= "+p);
	}
	
	@Override
	public void updatePublicacao(Publicacao p) {
		//abre a sessão com o bd
		Session session = this.sessionFactory.getCurrentSession();
		// salva o objeto no banco de dados
		session.merge(p);
		logger.info("publicação alterada, publicação Details= "+p);
		
	}

	@Override
	public void removePublicacao(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Publicacao p  = (Publicacao)session.load(Publicacao.class, new Integer(id));
		if (null!=p) {
			
			session.delete(p);
		}
		logger.info("Publicação deletada com sussesso, detalhes = " +p);
		
		
	}
	

	@Override
	public List<Publicacao> listPublicacao() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Publicacao> publicaoList = session.createQuery("from Publicacao").list();
		for(Publicacao p : publicaoList){
			logger.info("Publicacao Lista:: "+ p);
		}
		return publicaoList;
		
	}



}
