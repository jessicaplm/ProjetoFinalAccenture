package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.MeioComunicacao;


@Repository
public class MeioComunicacaoDAOImpl implements MeioComunicacaoDAO{

	//Traz o log do sgbd
	private static final Logger logger = LoggerFactory.getLogger(MeioComunicacaoDAOImpl.class);
	
	//Cria a sessão do bd para poder implementar os metodos
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
		
	@Override
	public void createMeioComunicacao(MeioComunicacao mc) {
		//abre a sessão com o bd
		Session session = this.sessionFactory.getCurrentSession();
		// salva o objeto no banco de dados
		session.persist(mc);
		logger.info("MeioComunicacao criada, MeioComunicacao Details= "+mc);
		
	}

	@Override
	public void updateMeioComunicacao(MeioComunicacao mc) {
		//abre a sessão com o bd
		Session session = this.sessionFactory.getCurrentSession();
		// salva o objeto no banco de dados
		session.persist(mc);
		logger.info("MeioComunicacao alterada, MeioComunicacao Details= "+mc);
		
	}

	@Override
	public void removeMeioComunicacao(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		MeioComunicacao mc  = (MeioComunicacao)session.load(MeioComunicacao.class, new Integer(id));
		if (null!=mc) {
			
			session.delete(mc);
		}
		logger.info("MeioComunicacao deletado com sussesso, detalhes = " + mc);
		
		
	}

	@Override
	public List<MeioComunicacao> listMeioComunicacao() {
		Session session = this.sessionFactory.getCurrentSession();
		List<MeioComunicacao> meioComunicacaoList = session.createQuery("from meioComunicacao").list();
		for(MeioComunicacao mc : meioComunicacaoList){
			logger.info("MeioComunicacao Lista:: "+ mc);
		}
		return meioComunicacaoList;
		
	
	}

}
