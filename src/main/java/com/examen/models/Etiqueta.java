package com.examen.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "Etiqueta")
public class Etiqueta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "etiqueta_id")
	int id;
	
	@Column( name = "etiqueta_nombre")
	String nombre;
	
	@Column( name = "etiqueta_fecha")
	Date fecha;
	
	@ManyToOne
	@JoinColumn( name = "publicacion_id")
	private Publicacion publicacion;
	
	
}
