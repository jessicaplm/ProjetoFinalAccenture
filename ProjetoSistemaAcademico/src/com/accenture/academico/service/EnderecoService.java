package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Endereco;

public interface EnderecoService {

	public void addEndereco(Endereco e);

	public List<Endereco> listEndereco();

	public void updateEndereco(Endereco e);

	public void removeEnderecoById(int id);
}
