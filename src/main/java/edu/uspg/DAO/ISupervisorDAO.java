package edu.uspg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Supervisor;

public interface ISupervisorDAO extends JpaRepository<Supervisor, Integer> {

}
