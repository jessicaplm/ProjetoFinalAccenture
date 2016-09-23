package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="meioComunicacao")
@ManagedBean(name="meioComunicacaoBean")
@SessionScoped
public class MeioComunicacao {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMeioComunicacao;
	
	@Column(length=100)
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "meioComunicacao", targetEntity = Publicacao.class, fetch = FetchType.LAZY)
	private List<Publicacao> publicacoes;

	public int getIdMeioComunicacao() {
		return idMeioComunicacao;
	}

	public void setIdMeioComunicacao(int idMeioComunicacao) {
		this.idMeioComunicacao = idMeioComunicacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Publicacao> getPublicacao() {
		return publicacoes;
	}

	public void setPublicacao(List<Publicacao> publicacao) {
		this.publicacoes = publicacao;
	}
}
