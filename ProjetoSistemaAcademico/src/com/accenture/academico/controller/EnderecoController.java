package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Endereco;
import com.accenture.academico.service.EnderecoService;

@Controller
@ManagedBean(name = "enderecoController")
@SessionScoped
public class EnderecoController {

	private Endereco endereco;
	private EnderecoService enderecoService;

	public void setEnderecoService(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}

	public void addEndereco(Endereco e) {

		this.enderecoService.addEndereco(e);
	}

	public List<Endereco> listEndereco() {
		return this.enderecoService.listEndereco();
	}

	public void updateEndereco(Endereco e) {
		this.enderecoService.updateEndereco(e);
	}

	public void removeEndereco(int id){
		this.enderecoService.removeEnderecoById(id);
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
