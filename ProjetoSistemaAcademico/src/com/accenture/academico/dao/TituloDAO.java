package com.accenture.academico.dao;

import java.util.List;
import com.accenture.academico.model.Titulo;

public interface TituloDAO {
	
	public void addTitulo(Titulo t);
	public List<Titulo> listTitulo();
	public void updateTitulo(Titulo t);
	public void removeTituloById(int id );

}
