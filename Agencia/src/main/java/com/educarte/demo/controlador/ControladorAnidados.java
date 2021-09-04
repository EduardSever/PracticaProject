	package com.educarte.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educarte.demo.modelo.Marcas;
import com.educarte.demo.repositorio.MarcasJPA;

@RestController
@RequestMapping("/anidados")
public class ControladorAnidados {
	@Autowired
	MarcasJPA marJpa;
	@RequestMapping("/lista")
	public List<Marcas> lista(){
		List<Marcas> lista = marJpa.findAll();
		return lista;
	}
}
