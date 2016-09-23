package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.MeioComunicacao;
import com.accenture.academico.service.MeioComunicacaoService;

@Controller
@ManagedBean(name="meioComunicacaoController")
@SessionScoped
public class MeioComunicacaoController {
	
	private MeioComunicacao meioComunicacao;
	
	private MeioComunicacaoService meioComunicacaoService;

	public MeioComunicacao getMeioComunicacao() {
		return meioComunicacao;
	}

	public void setMeioComunicacao(MeioComunicacao meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

	public void setMeioComunicacaoService(MeioComunicacaoService meioComunicacaoService) {
		this.meioComunicacaoService = meioComunicacaoService;
	}
	
	
	public void createMeioComunicacao(MeioComunicacao mc) {
		meioComunicacaoService.createMeioComunicacao(mc);
		
	}

	
	public void updateMeioComunicacao(MeioComunicacao mc) {
		meioComunicacaoService.updateMeioComunicacao(mc);
		
	}

	
	public void removeMeioComunicacao(int id) {
		meioComunicacaoService.removeMeioComunicacao(id);
		
	}

	
	public List<MeioComunicacao> listMeioComunicacao() {
		// TODO Auto-generated method stub
		return meioComunicacaoService.listMeioComunicacao();
	}


}
