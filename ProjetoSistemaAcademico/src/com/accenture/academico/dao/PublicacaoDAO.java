package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Publicacao;


public interface PublicacaoDAO {
	
	public void createPublicacao(Publicacao p);
	public void updatePublicacao(Publicacao p);
	public void removePublicacao(int id);
	public List<Publicacao> listPublicacao();

}
