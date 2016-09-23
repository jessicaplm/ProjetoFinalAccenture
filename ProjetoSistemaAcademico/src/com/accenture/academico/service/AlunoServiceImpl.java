package com.accenture.academico.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;


@Service("alunoService")
@Transactional(readOnly=true)
public class AlunoServiceImpl implements AlunoService {

	private AlunoDAO alunoDAO; 


	public void setAlunoDAO(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}

	@Override
	@Transactional(readOnly=false)
	public void addAluno(Aluno a) {
		// TODO Auto-generated method stub
		this.alunoDAO.addAluno(a);
	}

	@Override
	public List<Aluno> listAluno() {
		// TODO Auto-generated method stub
		return this.alunoDAO.listAluno();
	}

	@Override
	@Transactional(readOnly=false)
	public void updateAluno(Aluno a) {
		// TODO Auto-generated method stub
		this.alunoDAO.updateAluno(a);
	}

	@Override
	@Transactional(readOnly=false)
	public void removeAlunoById(int id) {
		// TODO Auto-generated method stub
		this.alunoDAO.removeAlunoById(id);
	}

}
