package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Pessoa;
import com.accenture.academico.service.PessoaService;


@Controller
@ManagedBean(name= "pessoaController")
@SessionScoped
public class PessoaController {
	
	private PessoaService pessoaService;
	private Pessoa pessoa;
	
	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	public void addPessoa(Pessoa p ){
		this.pessoaService.addPessoa(p);
	}
	public List<Pessoa> listPessoa(){
		return this.pessoaService.listPessoa();
		
	}
	public void updatePessoa(Pessoa p){
		this.pessoaService.updatePessoa(p);
		
	}
	public void removePessoaById(int id ){
		this.pessoaService.removePessoaById(id);
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
