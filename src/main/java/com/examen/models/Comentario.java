package com.examen.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Comentario")
public class Comentario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "comentario_id")
	int id;
	
	@Column(name = "comentario_contenido")
	String contenido;
	
	@Column(name = "comentario_fecha")
	Date fecha;
	
	@ManyToOne
	@JoinColumn( name = "publicacion_id")
	private Publicacion publicacion;

}
