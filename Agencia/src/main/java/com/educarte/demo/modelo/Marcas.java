package com.educarte.demo.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marcas")
public class Marcas {
	@Id
	@GeneratedValue()
	private int id;
	private String nombre;
	
	@OneToMany(mappedBy="marca", cascade=CascadeType.ALL)
	private List<Modelos> modelos;
	
	
	public Marcas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marcas(int id, String nombre, List<Modelos> modelos) {
		this.id = id;
		this.nombre = nombre;
		this.modelos = modelos;
	}
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
	public List<Modelos> getModelos() {
		return modelos;
	}
	public void setModelos(List<Modelos> modelos) {
		this.modelos = modelos;
	}
}

