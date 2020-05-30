package paquete.principal.controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import paquete.principal.interfaceService.IAlumnoService;
import paquete.principal.modelo.Alumno;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private IAlumnoService service;
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Alumno>alumnos=service.listar();
		model.addAttribute("alumnos",alumnos);
		return "index";
	}

}
