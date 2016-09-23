package com.accenture.academico.dao;

import java.util.List;
import com.accenture.academico.model.Telefone;

public interface TelefoneDAO {

	public void addTelefone(Telefone t);
	public void updateTelefone(Telefone t);
	public void removeTelefoneById(int id );
	public List<Telefone> listTelefones();
	
}
