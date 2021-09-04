package com.code.interfaceService;

import java.util.List;
import java.util.Optional;

import com.code.modelo.Persona;

public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int d);
	public int save(Persona p);
	public void delete(int id);
	
}
