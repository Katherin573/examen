package edu.uspg.service;

import java.util.List;

import edu.uspg.model.Alumno;


public interface IAlumnoService {


	public Alumno crear(Alumno alu) ;
	public Alumno modificar(Alumno alu);
	public List<Alumno> listar();
	public Alumno listarPorId(Integer id);
	public void eliminar(Integer id);
}
