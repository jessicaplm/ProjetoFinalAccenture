package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Pessoa;

public interface PessoaDAO {

	
	public void addPessoa(Pessoa p );
	public List<Pessoa> listPessoa();
	public void updatePessoa(Pessoa p);
	public void removePessoaById(int id );
}
