package com.code.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
	
	

}
