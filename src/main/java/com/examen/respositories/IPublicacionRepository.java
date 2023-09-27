package com.examen.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.models.Publicacion;

@Repository
public interface IPublicacionRepository extends CrudRepository<Publicacion, Integer>{

	public List<Publicacion> findAll();
	
	Publicacion findById (int id);
	
}
