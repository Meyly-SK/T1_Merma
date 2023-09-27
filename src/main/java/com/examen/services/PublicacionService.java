package com.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.models.Publicacion;
import com.examen.respositories.IPublicacionRepository;

@Service
public class PublicacionService {

	@Autowired
	private IPublicacionRepository publiDao;
	
	public Publicacion agregarPublicacion(Publicacion publicacion) {
		try {
			Publicacion savedPublicacion = publiDao.save(publicacion);
			return savedPublicacion;
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public Publicacion buscarPorId(int id) {
		return publiDao.findById(id);
	}
	
	public List<Publicacion> findAllPublicacion(){
		return publiDao.findAll();
	}
}
