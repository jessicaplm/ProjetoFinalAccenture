package com.accenture.academico.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Cidade;
import com.accenture.academico.model.Endereco;
import com.accenture.academico.model.Professor;
import com.accenture.academico.model.Sexo;
import com.accenture.academico.model.Telefone;
import com.accenture.academico.model.Titulo;
import com.accenture.academico.service.ProfessorService;
import com.accenture.academico.service.TituloService;

@Controller
@ManagedBean(name= "professorController")
@SessionScoped
public class ProfessorController {
	private Titulo titulo;
	private List<Endereco> enderecos;
	private List<Telefone> telefones;
	private Professor professor;
	
	private ProfessorService professorService;
	
	public void setProfessorService(ProfessorService professorService) {
		this.professorService = professorService;
	}
	
	private TituloService tituloService;
	
	public void setTituloService(TituloService tituloService) {
		this.tituloService = tituloService;
	}
	
	
	
	public void addEnderecosList(Endereco e) {
		System.out.println("ADD");
		Endereco end = new Endereco();
		end.setBairro(e.getBairro());
		end.setCidade(e.getCidade());
		end.setLogradouro(e.getLogradouro());
		end.setNumero(e.getNumero());
		end.setUf(e.getUf());

		this.enderecos.add(end);
	}

	public void addTelefonesList(Telefone e) {
		Telefone tel = new Telefone();
		tel.setDdd(e.getDdd());
		tel.setTelefone(e.getTelefone());
		this.telefones.add(tel);
	}
	
	
	public List<Titulo> getTitulos(){
		
		return this.tituloService.listTitulo();
	}
	
	public ProfessorController() {

		enderecos = new ArrayList<Endereco>();
		telefones = new ArrayList<Telefone>();
		titulo = new Titulo();

	}
	

	public void addProfessor(Professor p ){

		for (int i = 0; i < enderecos.size(); i++) {
			p.getEnderecos().add(enderecos.get(i));
			
		}
		for (int i = 0; i < telefones.size(); i++) {
			p.getTelefone().add(telefones.get(i));
			
		}	
		
		
		p.setTitulacao(titulo.getTitulo());
		p.setDataAdmissao(new Date());
		
		this.professorService.addProfessor(p);
	}
	public List<Professor> listProfessor(){
		return this.professorService.listProfessor();
	}
	public void updateProfessor(Professor p){
		this.professorService.updateProfessor(p);
	}
	public void removeProfessorById(int id ){
		this.professorService.removeProfessorById(id);
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}

	public Cidade[] getCidades() {
		return Cidade.values();
	}
	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}



	public List<Endereco> getEnderecos() {
		return enderecos;
	}



	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}



	public List<Telefone> getTelefones() {
		return telefones;
	}



	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
}
