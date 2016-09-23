package com.accenture.academico.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="pessoa")
@ManagedBean(name="pessoaBean")
@SessionScoped
public class Pessoa implements Serializable {
	
	@Id	
	@Column(name="idPerson")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPerson;
	
	@Column(name="nomePerson" ,
			length=100, nullable=false)
	private String nomePerson;
	
	@Column(name="cpfPerson", length=14)
	private String cpfPerson;
	
	@Column(name="sexoPerson", nullable=false)
	private Sexo sexoPerson;
	
	@Column(name="tipoPerson", nullable=false)
	private TipoPessoa tipoPerson;
	
	
	@OneToMany(mappedBy = "pessoa", targetEntity = Endereco.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "pessoa", targetEntity = Telefone.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Telefone> telefones;
	
	public Pessoa(){
		enderecos=new ArrayList<Endereco>();
		telefones=new ArrayList<Telefone>();
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getNomePerson() {
		return nomePerson;
	}

	public void setNomePerson(String nomePerson) {
		this.nomePerson = nomePerson;
	}

	public String getCpfPerson() {
		return cpfPerson;
	}

	public void setCpfPerson(String cpfPerson) {
		this.cpfPerson = cpfPerson;
	}

	public Sexo getSexoPerson() {
		return sexoPerson;
	}

	public void setSexoPerson(Sexo sexoPerson) {
		this.sexoPerson = sexoPerson;
	}

	public TipoPessoa getTipoPerson() {
		return tipoPerson;
	}

	public void setTipoPerson(TipoPessoa tipoPerson) {
		this.tipoPerson = tipoPerson;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefone() {
		return telefones;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}
}
