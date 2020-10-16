package edu.uspg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IAlumnoDAO;
import edu.uspg.model.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	@Autowired
	private IAlumnoDAO dao;

	@Override
	public Alumno crear(Alumno alu) {
		return dao.save(alu);
	}

	@Override
	public Alumno modificar(Alumno alu) {
		return dao.save(alu);
	}

	@Override
	public List<Alumno> listar() {
		return dao.findAll();
	}

	@Override
	public Alumno listarPorId(Integer id) {
		return dao.findOne(id);
		//return null
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	
	

}