package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Publicacao;

public interface PublicacaoService{
	
	public void createPublicacao(Publicacao p);
	public void updatePublicacao(Publicacao p);
	public void removePublicacao(int id);
	public List<Publicacao> listPublicacao();
	


}
