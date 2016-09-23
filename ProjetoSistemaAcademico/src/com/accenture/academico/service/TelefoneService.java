package com.accenture.academico.service;

import java.util.List;
import com.accenture.academico.model.Telefone;


public interface TelefoneService {

	public void addTelefone(Telefone t);
	public void updateTelefone(Telefone t);
	public void removeTelefoneById(int id );
	public List<Telefone> listTelefones();
	
}
