package CursoAlumno;

import java.util.*;

public class Alumno {

	String nombre;
	int id;
	double nota_media;

	public Alumno(){
		
	}
	
	public Alumno(String a, int b, double c) {
		this.nombre = a;
		this.id = b;
		this.nota_media = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNota_media() {
		return nota_media;
	}

	public void setNota_media(double nota_media) {
		this.nota_media = nota_media;
	}

}
	