package com.examen.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.models.Etiqueta;

@Repository
public interface IEtiquetaRepository extends CrudRepository<Etiqueta, Integer>{
	
	Etiqueta findById(int id);
	
	public List<Etiqueta> findAll();
}
