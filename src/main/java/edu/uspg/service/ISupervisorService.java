package edu.uspg.service;

import java.util.List;

import edu.uspg.model.Supervisor;

public interface ISupervisorService {
	
	
	public Supervisor crear(Supervisor sup) ;
	public Supervisor modificar(Supervisor sup);
	public List<Supervisor> listar();
	public Supervisor listarPorId(Integer id);
	public void eliminar(Integer id);
}
