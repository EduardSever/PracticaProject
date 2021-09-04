package com.educarte.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anidados")
public class ControladorVistas {
	
	@RequestMapping("/index")//combos
	public String combos(){
		
		return "anidados/index";//combos
	}
}
