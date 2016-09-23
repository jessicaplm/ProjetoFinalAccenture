package com.accenture.academico.service;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accenture.academico.dao.TituloDAO;
import com.accenture.academico.model.Titulo;



@Service
@Transactional(readOnly = true) 
public class TituloServiceImpl implements TituloService {

	private TituloDAO tituloDAO;
	
	public void setTituloDAO(TituloDAO tituloDAO) {
		this.tituloDAO = tituloDAO;		
	}
	public void getTituloDAO(TituloDAO tituloDAO) {
		this.tituloDAO = tituloDAO;		
	}
	@Override
	@Transactional(readOnly = false)
	public void addTitulo(Titulo t) {
		this.tituloDAO.addTitulo(t);		
		
	}

	@Override
	public List<Titulo> listTitulo() {		
		return this.tituloDAO.listTitulo();
	}

	@Override
	@Transactional(readOnly = false)
	public void updateTitulo(Titulo t) {
		this.tituloDAO.updateTitulo(t);		
		
	}

	@Override
	@Transactional(readOnly = false)
	public void removeTituloById(int id) {
		this.tituloDAO.removeTituloById(id);
				
	}

}
