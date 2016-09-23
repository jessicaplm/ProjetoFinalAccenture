package com.accenture.academico.service;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accenture.academico.dao.TelefoneDAO;
import com.accenture.academico.model.Telefone;

@Service
@Transactional(readOnly = true)
public class TelefoneServiceImpl implements TelefoneService{

	private TelefoneDAO telefoneDAO;
	
	public void setTelefoneDAO(TelefoneDAO telefoneDAO) {
		this.telefoneDAO = telefoneDAO;
	}
	
	@Override
	@Transactional(readOnly = false)
	public void addTelefone(Telefone t) {
		telefoneDAO.addTelefone(t);
		
	}

	@Override
	public List<Telefone> listTelefones() {
		return telefoneDAO.listTelefones();
	}

	@Override
	@Transactional(readOnly = false)
	public void updateTelefone(Telefone t) {
		telefoneDAO.updateTelefone(t);
	}

	@Override
	@Transactional(readOnly = false)
	public void removeTelefoneById(int id) {
		telefoneDAO.removeTelefoneById(id);
	}
	
}
