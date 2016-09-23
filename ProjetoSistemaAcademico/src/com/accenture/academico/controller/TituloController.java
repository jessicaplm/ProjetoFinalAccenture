package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Titulo;
import com.accenture.academico.service.TituloService;

@Controller
@ManagedBean(name="tituloController")
@SessionScoped
public class TituloController {

	
	
	private Titulo titulo;
	private TituloService tituloService;

	public void setTituloService(TituloService tituloService) {
		this.tituloService= tituloService;
	}
	
	
	public void addTitulo(Titulo t) {
		this.tituloService.addTitulo(t);
	}

	public List<Titulo> listTitulo() {
		return this.tituloService.listTitulo();
	}

	public void updateTitulo(Titulo t) {
		this.tituloService.updateTitulo(t);
	}

	public void removeTitulo(int id){
		this.tituloService.removeTituloById(id);
	}

	public Titulo getEndereco() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

}