package com.accenture.academico.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.PessoaDAO;
import com.accenture.academico.model.Pessoa;
@Service
@Transactional(readOnly=true)
public class PessoaServiceImpl  implements PessoaService{

	private PessoaDAO pessoaDAO;
	
	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}
	@Override
	@Transactional(readOnly=false)
	public void addPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		this.pessoaDAO.addPessoa(p);
	}

	@Override
	public List<Pessoa> listPessoa() {
		// TODO Auto-generated method stub
		return 	this.pessoaDAO.listPessoa();
	}

	@Override
	@Transactional(readOnly=false)
	public void updatePessoa(Pessoa p) {
		// TODO Auto-generated method stub
		this.pessoaDAO.updatePessoa(p);
	}

	@Override
	@Transactional(readOnly=false)
	public void removePessoaById(int id) {
		// TODO Auto-generated method stub
		this.pessoaDAO.removePessoaById(id);
	}

}
