package edu.uspg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uspg.model.Administrador;
import edu.uspg.service.IAdministradorService;


@RestController
@RequestMapping("/administrador")

public class AdministradorController {

	@Autowired
	private IAdministradorService service;
	
	@GetMapping
	public List<Administrador> listar(){ 
		
		return service.listar();
	}
	
	@GetMapping(value = "/{id}")
	public Administrador listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	 
	@PostMapping 
	public Administrador registrar(@RequestBody Administrador adm) {
		return service.crear(adm);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
	
}
