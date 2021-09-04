package com.code.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.Persona;
import com.code.repo.IPersonaRepo;
import com.code.repo.IUsuarioRepo;

@Controller
public class DemoController {
	@Autowired
	private IUsuarioRepo repo;

	@GetMapping("/greeting")//login
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		// logicas
		model.addAttribute("name", name);
		return "greeting";//greeting
	}
	@GetMapping("/listar")//login
	public String listar(Model model) {   
		// logicas
		model.addAttribute("personas ", repo.findAll());
		return "listar";//greeting
	}
}
