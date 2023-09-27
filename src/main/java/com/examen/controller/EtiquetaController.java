package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;

import com.examen.models.Etiqueta;
import com.examen.services.EtiquetaService;

@Controller
public class EtiquetaController {

	@Autowired
	private EtiquetaService serviEti;
	
	public Etiqueta guardarEtiqueta(Etiqueta etiqueta) {
		try {
			return serviEti.agregarEtiqueta(etiqueta);
		}catch(DataIntegrityViolationException ex) {
			throw ex;
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public Etiqueta getEtiqueta(int id) {
		return serviEti.buscarPorId(id);
	}
	
	public List<Etiqueta> listaEtiqueta(){
		return serviEti.findAllEtiqueta();
	}
}
