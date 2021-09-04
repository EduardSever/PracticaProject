package com.mitocode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mitocode.DemoConsolaApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepolmpl2 implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		
		LOG.info("BIEVENIDO " + nombre);
	}
}