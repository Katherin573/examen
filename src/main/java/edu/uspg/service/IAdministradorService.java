package edu.uspg.service;

import java.util.List;

import edu.uspg.model.Administrador;

public interface IAdministradorService {
	public Administrador crear(Administrador adm) ;
	public Administrador modificar(Administrador adm);
	public List<Administrador> listar();
	public Administrador listarPorId(Integer id);
	public void eliminar(Integer id);
}
