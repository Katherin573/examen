package edu.uspg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Alumno;

public interface IAlumnoDAO extends JpaRepository<Alumno, Integer> {

}
