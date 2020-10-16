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

import edu.uspg.model.Supervisor;
import edu.uspg.service.ISupervisorService;

@RestController
@RequestMapping("/supervisor")
public class SupervisorController {
	
	@Autowired
	private ISupervisorService service;
	
	@GetMapping
	public List<Supervisor> listar(){ 
		
		return service.listar();
	}
	
	@GetMapping(value = "/{id}")
	public Supervisor listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	 
	@PostMapping 
	public Supervisor registrar(@RequestBody Supervisor sup) {
		return service.crear(sup);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
}
