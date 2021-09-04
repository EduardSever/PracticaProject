package com.code.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.interfaceService.IpersonaService;
import com.code.interfaces.IPersona;
import com.code.modelo.Persona;
@Service
public class PersonaService implements IpersonaService {

	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}
	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		int res=0;
		Persona persona=data.save(p);
		if(!persona.equals(null)){
			res=1; 	
		}
		return res;
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
