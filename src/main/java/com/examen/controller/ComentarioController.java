package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;

import com.examen.models.Comentario;
import com.examen.services.ComentarioService;

@Controller
public class ComentarioController {

	@Autowired
	private ComentarioService serviComen;
	
	public Comentario guardarComentario(Comentario comentario) {
		try {
			return serviComen.agregarComentario(comentario);
		} catch (DataIntegrityViolationException ex) {
			throw ex;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public Comentario getComentario(int id) {
		return serviComen.buscarPorId(id);
	}
	
	public List<Comentario> listaComentario(){
		return serviComen.findAllComentario();
	}
}
