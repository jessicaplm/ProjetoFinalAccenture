package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Publicacao;
import com.accenture.academico.service.PublicacaoService;

@Controller
@ManagedBean(name = "publicacaoController")
@SessionScoped
public class PublicacaoController {

	private Publicacao publicacao;
	private PublicacaoService publicacaoService;

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public void setPublicacaoService(PublicacaoService publicacaoService) {
		this.publicacaoService = publicacaoService;
	}

	public void createPublicacao(Publicacao p) {
		publicacaoService.createPublicacao(p);

	}

	public void updatePublicacao(Publicacao p) {
		publicacaoService.updatePublicacao(p);

	}

	public void removePublicacao(int id) {
		publicacaoService.removePublicacao(id);

	}

	public List<Publicacao> listPublicacao() {
		// TODO Auto-generated method stub
		return publicacaoService.listPublicacao();
	}

}