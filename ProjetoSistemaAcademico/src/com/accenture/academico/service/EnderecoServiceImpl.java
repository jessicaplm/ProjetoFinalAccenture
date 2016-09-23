package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.model.Endereco;
import com.accenture.academico.dao.EnderecoDAO;


@Service
@Transactional(readOnly = true)
public class EnderecoServiceImpl implements EnderecoService {

	private EnderecoDAO enderecoDAO;

	public void setEnderecoDAO(EnderecoDAO enderecoDAO) {

		this.enderecoDAO = enderecoDAO;
	}

	@Override
	@Transactional(readOnly = false)
	public void addEndereco(Endereco e) {

		enderecoDAO.addEndereco(e);
	}

	@Override
	public List<Endereco> listEndereco() {

		return enderecoDAO.listEndereco();
	}

	@Override
	@Transactional(readOnly = false)
	public void updateEndereco(Endereco e) {

		enderecoDAO.updateEndereco(e);
	}

	@Override
	@Transactional(readOnly = false)
	public void removeEnderecoById(int id) {

		enderecoDAO.removeEnderecoById(id);
	}

}
