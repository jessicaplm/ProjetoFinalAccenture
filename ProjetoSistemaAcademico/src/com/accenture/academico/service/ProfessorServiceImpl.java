package com.accenture.academico.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.ProfessorDAO;
import com.accenture.academico.model.Professor;

@Service
@Transactional(readOnly=true)
public class ProfessorServiceImpl implements ProfessorService {

	private ProfessorDAO professorDAO;
	

	public void setProfessorDAO(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}

	@Override
	@Transactional(readOnly=false)
	public void addProfessor(Professor p) {
		// TODO Auto-generated method stub
		this.professorDAO.addProfessor(p);
	}

	@Override
	public List<Professor> listProfessor() {
		// TODO Auto-generated method stub
		return this.professorDAO.listProfessor() ;
	}

	@Override
	@Transactional(readOnly=false)
	public void updateProfessor(Professor p) {
		// TODO Auto-generated method stub
		this.professorDAO.updateProfessor(p); 
	}

	@Override
	@Transactional(readOnly=false)
	public void removeProfessorById(int id) {
		// TODO Auto-generated method stub
		this.professorDAO.removeProfessorById(id); 
	}

}
