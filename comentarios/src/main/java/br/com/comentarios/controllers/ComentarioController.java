package br.com.comentarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.comentarios.models.ComentarioModel;
import br.com.comentarios.services.ComentarioService;

@Controller
public class ComentarioController {

	@Autowired
	private ComentarioService comentarioService;
	
	@GetMapping("/")
	public ModelAndView mostrarComentario() {
		ModelAndView modelAndView = new ModelAndView("home.html");
		modelAndView.addObject("comentarios", comentarioService.mostrarComentario());
		return modelAndView;
	}
	
	@PostMapping("/novosComentarios")
	public String salvarComentarios(String foto, String nome, int idade, String estadoCivil, String comentario) {
		comentarioService.salvarComentarios(new ComentarioModel(comentarioService.mostrarComentario().size()+ 1,
				foto, nome, idade, estadoCivil, comentario));
		return "redirect:/";
	}
	@GetMapping("/novosComentarios")
	public ModelAndView cadastroPerfil() {
		ModelAndView modelAndView = new ModelAndView("comentar.html");
	    return modelAndView;
	}
	
	}

