package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
@Table(name = "personas")
public class Persona {
	
	@Id
	private int id;
	@Column(name = "nombre", length = 15)
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
