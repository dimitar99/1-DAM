package zoo;

import java.util.Iterator;

public class animal {

	private String nombre;
	private String paisOrigen;
	private double peso;
	private int edad;
	
	public animal() {
		this.nombre = "Juan";
		this.paisOrigen = "Africa";
		this.peso = 5.25;
		this.edad = 4;		
	}
	
	public animal(String a, String b, double c, int d) {
		this.nombre = a;
		this.paisOrigen = b;
		this.peso = c;
		this.edad = d;
	}
	
	public void setNombre(String a) {
		this.nombre = a;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(String a) {
		this.paisOrigen = a;
	}
	
	public String getPais() {
		return paisOrigen;
	}
	
	public void setPeso(double a) {
		this.peso = a;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setEdad(int a) {
		this.edad = a;
	}
	
	public int getEdad() {
		return edad;
	}

}