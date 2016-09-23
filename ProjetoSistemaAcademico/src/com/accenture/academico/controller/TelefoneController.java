package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.stereotype.Controller;
import com.accenture.academico.model.Telefone;
import com.accenture.academico.service.TelefoneService;

@Controller
@ManagedBean(name="telefoneController")
@SessionScoped
public class TelefoneController {

	private Telefone telefone;
	private TelefoneService telefoneService;
	
	public void setTelefoneService(TelefoneService telefoneService) {
		this.telefoneService = telefoneService;
	}
	
	public void addTelefone(Telefone t) {
		this.telefoneService.addTelefone(t);
	}
	
	public List<Telefone> listTelefone() {
		return this.telefoneService.listTelefones();
	}
	
	public void updateTelefone(Telefone t) {

		this.telefoneService.updateTelefone(t);
	}
	
	public void removeTelefoneById(int id) {

		this.telefoneService.removeTelefoneById(id);

	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
