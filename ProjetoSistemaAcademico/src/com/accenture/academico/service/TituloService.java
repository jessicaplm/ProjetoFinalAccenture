package com.accenture.academico.service;

import java.util.List;
import com.accenture.academico.model.Titulo;


public interface TituloService {
	
	public void addTitulo(Titulo t);
	public List<Titulo> listTitulo();
	public void updateTitulo(Titulo t);
	public void removeTituloById(int id );

}
