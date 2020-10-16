package edu.uspg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Administrador;

public interface IAdministradorDAO extends JpaRepository<Administrador, Integer> {

} 
