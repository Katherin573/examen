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

import edu.uspg.model.Alumno;
import edu.uspg.service.IAlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
	
	@Autowired
	private IAlumnoService service;
	
	@GetMapping
	public List<Alumno> listar(){ 
		
		return service.listar();
	}
	
	@GetMapping(value = "/{id}")
	public Alumno listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	 
	@PostMapping 
	public Alumno registrar(@RequestBody Alumno alu) {
		return service.crear(alu);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
}
