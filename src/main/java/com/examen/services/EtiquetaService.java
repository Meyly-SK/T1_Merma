package com.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.models.Etiqueta;
import com.examen.respositories.IEtiquetaRepository;

@Service
public class EtiquetaService {

	@Autowired
	private IEtiquetaRepository etiDao;
	
	public Etiqueta agregarEtiqueta(Etiqueta etiqueta) {
		try {
			Etiqueta savedEtiqueta = etiDao.save(etiqueta);
			return savedEtiqueta;
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public Etiqueta buscarPorId(int id) {
		return etiDao.findById(id);
	}
	
	public List<Etiqueta> findAllEtiqueta(){
		return etiDao.findAll();
	}
}
