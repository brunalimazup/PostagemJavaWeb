package br.com.comentarios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.comentarios.models.ComentarioModel;

@Service
public class ComentarioService {

	private List<ComentarioModel> comentarios = new ArrayList<ComentarioModel>(); {{
		comentarios.add(new ComentarioModel(2,"foto","milena",12, "solteira", "."));
	}
	};
	

	
	public List<ComentarioModel> mostrarComentario(){
		return this.comentarios;
	}
	public void salvarComentarios(ComentarioModel comentarioModel) {
		comentarios.add( comentarioModel);
	}
	
}