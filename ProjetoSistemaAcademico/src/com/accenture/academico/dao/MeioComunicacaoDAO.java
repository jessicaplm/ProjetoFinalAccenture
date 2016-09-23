package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.MeioComunicacao;

public interface MeioComunicacaoDAO {
	
	public void createMeioComunicacao(MeioComunicacao mc);
	public void updateMeioComunicacao(MeioComunicacao mc);
	public void removeMeioComunicacao(int id);
	public List<MeioComunicacao> listMeioComunicacao();

}
