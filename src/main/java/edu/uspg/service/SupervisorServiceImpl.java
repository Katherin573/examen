package edu.uspg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.ISupervisorDAO;
import edu.uspg.model.Supervisor;

@Service
public class SupervisorServiceImpl implements ISupervisorService {
	
	@Autowired
	private ISupervisorDAO dao;

	@Override
	public Supervisor crear(Supervisor sup) {
		return dao.save(sup);
	}

	@Override
	public Supervisor modificar(Supervisor sup) {
		return dao.save(sup);
	}

	@Override
	public List<Supervisor> listar() {
		return dao.findAll();
	}

	@Override
	public Supervisor listarPorId(Integer id) {
		return dao.findOne(id);
		//return null
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	
	

}
