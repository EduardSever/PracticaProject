package com.mitocode;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.code.model.Usuario;
import com.code.repo.IUsuarioRepo;


@SpringBootTest
class DemoWebApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	public void CrearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(1);
		us.setNombre("Perla");
		us.setClave("723");
		Usuario retorno = repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}
}
