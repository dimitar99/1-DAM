package ColeccionDiscos;

import java.util.*;

public class Coleccion {
	
	Scanner sc = new Scanner (System.in);
	private String tipo;
	ArrayList<Disco> disco = new ArrayList<Disco>();
	
	public Coleccion() {
		this.tipo = "no_definido";
	}
	
	public Coleccion(String a) {
		this.tipo = a;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void buscar(String a) {
		int apariciones = 0;
		for(Disco elemento : disco ) {
			if(elemento.getTitulo().equals(a)) {
				apariciones++;
				System.out.println("Titulo(" + elemento.getTitulo() + ") Numero_Canciones(" + elemento.getNum_canciones() + ") Precio(" + elemento.getPrecio() + ")");
			}
		}
		if(apariciones == 0) {
			System.out.println("NO APARECE EL DISCO");
		}
	}
	
	public void modidicar_titulo(String a) {
		int apariciones = 0;
		for(Disco elemento : disco ) {
			if(elemento.getTitulo().equals(a)) {
				apariciones++;
				System.out.print("NUEVO NOMBRE: "); String nombre = sc.next();
				elemento.setTitulo(nombre);				
			}
		}
		if(apariciones == 0) {
			System.out.println("NO APARECE EL DISCO");
		}
	}
	
	public void disco_barato() {
		int posicion = 0;
		for(int i=0 ; i<disco.size(); i++) {
			for(int x=0; x<disco.size(); x++) {
				if(disco.get(i).getPrecio() > disco.get(x).getPrecio() ) {
					posicion = x;
				}else {
					posicion = i;
				}
			}
		}
		disco.get(posicion).visualizar_Disco();
	}
	
	public void insertar_disco() {
		System.out.println("NOMBRE DISCO: "); String nombre = sc.next();
		System.out.println("NUMERO CANCIONES: "); int num_canciones = Integer.parseInt(sc.next());
		System.out.println("PRECIO: "); float precio = Float.parseFloat(sc.next());
		Disco a = new Disco(nombre, num_canciones, precio);
		disco.add(a);
	}
	
}