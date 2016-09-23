package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
@ManagedBean(name="enderecoBean")
@SessionScoped
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEndereco;
	@Column(length = 200, nullable = false)
	private String logradouro;
	@Column(length = 100, nullable = false)
	private String bairro;
	@Column(nullable = false)
	private int numero;
	@Column(nullable = false)
	private Cidade cidade;
	@Column(nullable = false)
	private String uf;
	
	@ManyToOne
	@JoinColumn(name = "idPerson")
	private Pessoa pessoa;
	public  Endereco (){
		
		pessoa=new Pessoa();
		
		
	}
	
	
	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void endereco(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return "PE";
	}

	public void setUf(String uf) {
		this.uf = "PE";
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
