package com.accenture.academico.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;









import com.accenture.academico.model.Aluno;
import com.accenture.academico.model.Cidade;
import com.accenture.academico.model.Endereco;
import com.accenture.academico.model.Pessoa;



import com.accenture.academico.model.Sexo;
import com.accenture.academico.model.Telefone;
import com.accenture.academico.model.TipoPessoa;
import com.accenture.academico.service.AlunoService;

@Controller
@ManagedBean(name = "alunoController")
@SessionScoped
public class AlunoController {
	//teste

	private List<Endereco> enderecos;
	private List<Telefone> telefones;
	
	@Autowired
	private AlunoService alunoService;

	public AlunoController() {

		enderecos = new ArrayList<Endereco>();
		telefones = new ArrayList<Telefone>();

	}

	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
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

	public void addAluno(Aluno a) {


		a.setTipoPerson(TipoPessoa.Aluno);
		
		for (int i = 0; i < enderecos.size(); i++) {
			a.getEnderecos().add(enderecos.get(i));
			
		}
		for (int i = 0; i < telefones.size(); i++) {
			a.getTelefone().add(telefones.get(i));
			
		}

		
	
		this.alunoService.addAluno(a);
	}

	public List<com.accenture.academico.model.Aluno> listAluno() {

		return this.alunoService.listAluno();
	}

	public void updateAluno(com.accenture.academico.model.Aluno a) {
		
//		com.accenture.academico.model.Aluno aluno = new com.accenture.academico.model.Aluno();
//		List<com.accenture.academico.model.Endereco> ender = new ArrayList<com.accenture.academico.model.Endereco>();
//		List<com.accenture.academico.model.Telefone> tel = new ArrayList<com.accenture.academico.model.Telefone>();
//
//		aluno.setCpfPerson(a.getCpfPerson());
//		aluno.setNomePerson(a.getNomePerson());
//
//		switch (a.getSexoPerson()) {
//		case Masculino:
//			aluno.setSexoPerson(com.accenture.academico.model.Sexo.Masculino);
//			break;
//		case Feminino:
//			aluno.setSexoPerson(com.accenture.academico.model.Sexo.Feminino);
//			break;
//		default:
//			aluno.setSexoPerson(com.accenture.academico.model.Sexo.outros);
//			break;
//		}
//
//		switch (com.accenture.academico.model.TipoPessoa.Aluno) {
//		case Aluno:
//			aluno.setTipoPerson(com.accenture.academico.model.TipoPessoa.Aluno);
//			break;
//		case Professor:
//			aluno.setTipoPerson(com.accenture.academico.model.TipoPessoa.Professor);
//			break;
//		default:
//
//			break;
//		}
//
//		for (int i = 0; i < telefones.size(); i++) {
//
//			tel.get(i).setDdd(telefones.get(i).getDdd());
//			tel.get(i).setIdTelefone(telefones.get(i).getDdd());
//
//		}
//
//		for (int i = 0; i < enderecos.size(); i++) {
//
//			ender.get(i).setBairro(enderecos.get(i).getBairro());
//			ender.get(i).setBairro(enderecos.get(i).getLogradouro());
//			ender.get(i).setBairro(enderecos.get(i).getUf());
//			ender.get(i).setNumero(enderecos.get(i).getNumero());
//			switch (enderecos.get(i).getCidade()) {
//			case Arcoverde:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Arcoverde);
//				break;
//			case Bezerros:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Bezerros);
//				break;
//			case Camaragibe:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Camaragibe);
//				break;
//			case Caruaru:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Caruaru);
//				break;
//			case Garanhuns:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Garanhuns);
//				break;
//			case Gravata:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Gravata);
//				break;
//			case Jaboatao:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Jaboatao);
//				break;
//			case Olinda:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Olinda);
//				break;
//			case Petrolina:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Petrolina);
//
//				break;
//			case Recife:
//				ender.get(i).setCidade(
//						com.accenture.academico.model.Cidade.Recife);
//				break;
//
//			default:
//				break;
//			}
//		}
//		aluno.setEnderecos(ender);
//		aluno.setTelefone(tel);

		this.alunoService.updateAluno(a);
	}

	public void removeAlunoById(int id) {

		this.alunoService.removeAlunoById(id);

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

	public Sexo[] getSexos() {
		return Sexo.values();
	}

	public Cidade[] getCidades() {
		return Cidade.values();
	}

}
