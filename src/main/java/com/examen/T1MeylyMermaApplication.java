package com.examen;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.examen.controller.ComentarioController;
import com.examen.controller.EtiquetaController;
import com.examen.controller.PublicacionController;
import com.examen.models.Publicacion;
import com.examen.models.Comentario;
import com.examen.models.Etiqueta;
import com.examen.services.PublicacionService;

@SpringBootApplication
public class T1MeylyMermaApplication {

	public static void main(String[] args) {
		SpringApplication.run(T1MeylyMermaApplication.class, args);
	}
	
	@Autowired
	private PublicacionController controlPubli;
	
	@Autowired
	private EtiquetaController controlEti;
	
	@Autowired
	private ComentarioController controlComen;
	
	@Bean
	public CommandLineRunner testMain() {
		return args -> {		
			//----------------------------------------------------------
			//Insertar Publicacion
			
			/*Publicacion publicacion1 = new Publicacion();
			publicacion1.setNombre("Nombre ejemplo");
			publicacion1.setContenido("Ninguno");
			publicacion1.setFecha(new Date());
			
			controlPubli.guardarPublicacion(publicacion1); */
			
			//Listar Publicaciones
			
			/* List<Publicacion> publicaciones = controlPubli.listaPublicacion();
			System.out.println(publicaciones.get(0).getNombre()  + " "+ publicaciones.get(0).getContenido());
			System.out.println(publicaciones.get(1).getContenido()); */
			
			//listar por Id
			
			/*Publicacion publi = controlPubli.getPublicacion(1);
			System.out.println("Publicacion = Nombre :  "  + publi.getNombre()  + " Contenido : " + publi.getContenido()  + " Fecha : " + publi.getFecha());*/
			
			//---------------------------------------------------------------------
			
			//Insertar Etiqueta
			
			/* Etiqueta etiqueta1 = new Etiqueta();
			etiqueta1.setNombre("Etiqueta1");
			etiqueta1.setFecha(new Date());
			etiqueta1.setPublicacion(publicacion1);
			
			controlEti.guardarEtiqueta(etiqueta1);
			System.out.println("Todo bien"); */
			
			//Listar Etiqueta
			
			/*List<Etiqueta> etiquetas = controlEti.listaEtiqueta();
			System.out.println("Etiqueta 1 : " + etiquetas.get(0).getNombre()); */
			
			//Listar por Id
			
			/*Etiqueta eti = controlEti.getEtiqueta(1);
			System.out.println("Nombre : " + eti.getNombre() + " , Fecha : " + eti.getFecha() + " , " + eti.getPublicacion()); */
			
			//---------------------------------------------------------------------
			
			//Insertar Comentario
			
			/*Comentario comentario1 = new Comentario();
			comentario1.setContenido("Contenido Ejemplo");
			comentario1.setFecha(new Date());
			comentario1.setPublicacion(publicacion1);
			
			controlComen.guardarComentario(comentario1);
			System.out.println("todo bien"); */
			
			//Listar Comentario
			
			/*List<Comentario> comen  = controlComen.listaComentario();
			System.out.println("Comentario1 - Contenido : " + comen.get(0).getContenido() + " , Publicacion " + comen.get(0).getPublicacion());*/
			
			//Listar por Id
			
			/*Comentario comen = controlComen.getComentario(1);
			System.out.println("Comentario1 - Contenido : " + comen.getContenido() + " ,Fecha : " + comen.getFecha() + " ,Publicacion : " + comen.getPublicacion());*/

		};
	}

}
