package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.MeioComunicacao;


public interface MeioComunicacaoService {
	
	
	public void createMeioComunicacao(MeioComunicacao mc);
	public void updateMeioComunicacao(MeioComunicacao mc);
	public void removeMeioComunicacao(int id);
	public List<MeioComunicacao> listMeioComunicacao();

}
