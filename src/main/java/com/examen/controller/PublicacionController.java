package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;

import com.examen.models.Publicacion;
import com.examen.services.PublicacionService;

@Controller
public class PublicacionController {

	@Autowired
	private PublicacionService serviPubli;
	
	public Publicacion guardarPublicacion(Publicacion publicacion) {
		try {
            return serviPubli.agregarPublicacion(publicacion);
        } catch (DataIntegrityViolationException ex) {
            // Manejar la excepción específica de violación de restricciones aquí
            throw ex;
        } catch (Exception ex) {
            // Manejar otras excepciones aquí
            throw ex;
        }
	}

	public Publicacion getPublicacion(int id){
		return serviPubli.buscarPorId(id);
	}
	
	public List<Publicacion> listaPublicacion(){
		return serviPubli.findAllPublicacion();
	}
}
