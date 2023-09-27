package com.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.models.Comentario;
import com.examen.respositories.IComentarioRepository;

@Service
public class ComentarioService {

	@Autowired
	private IComentarioRepository comenDao;
	
	public Comentario agregarComentario(Comentario comentario) {
		try {
			Comentario savedComentario = comenDao.save(comentario);
			return savedComentario;
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public Comentario buscarPorId(int id) {
		return comenDao.findById(id);
	}
	
	public List<Comentario> findAllComentario(){
		return comenDao.findAll();
	}
}
