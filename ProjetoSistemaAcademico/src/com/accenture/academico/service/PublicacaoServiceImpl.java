package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.PublicacaoDAO;
import com.accenture.academico.model.Publicacao;


@Service
@Transactional(readOnly = true)
public class PublicacaoServiceImpl implements PublicacaoService{
	
	private PublicacaoDAO publicacaoDAO;
	

	public void setPublicacaoDAO(PublicacaoDAO publicacaoDAO) {
		this.publicacaoDAO = publicacaoDAO;
	}

	@Override
	@Transactional(readOnly = false)
	public void createPublicacao(Publicacao p) {
		publicacaoDAO.createPublicacao(p);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void updatePublicacao(Publicacao p) {
		publicacaoDAO.updatePublicacao(p);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void removePublicacao(int id) {
		publicacaoDAO.removePublicacao(id);
		
	}

	@Override
	public List<Publicacao> listPublicacao() {
		// TODO Auto-generated method stub
		return publicacaoDAO.listPublicacao();
	}

}
