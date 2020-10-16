package edu.uspg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IAdministradorDAO;
import edu.uspg.model.Administrador;

@Service
public class AdministradorServiceImpl implements IAdministradorService {
	
	@Autowired
	private IAdministradorDAO dao;

	@Override
	public Administrador crear(Administrador adm) {
		return dao.save(adm);
	}

	@Override
	public Administrador modificar(Administrador adm) {
		return dao.save(adm);
	}

	@Override
	public List<Administrador> listar() {
		return dao.findAll();
	}

	@Override
	public Administrador listarPorId(Integer id) {
		return dao.findOne(id);
		//return null
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	
	

}