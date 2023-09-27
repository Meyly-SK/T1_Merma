package com.examen.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.models.Comentario;

@Repository
public interface IComentarioRepository  extends CrudRepository<Comentario, Integer>{

	public List<Comentario> findAll();
	
	Comentario findById(int id);
}
