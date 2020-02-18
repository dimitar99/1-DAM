package Astro;

import java.util.*;

public class Catalogo {
	
	String nombre_catalogo;
	ArrayList<astro> lista_astros = new ArrayList<astro>();
	
	public Catalogo() {
		
	}
	
	public Catalogo(String nombre_catalogo, ArrayList lista_astros) {
		this.nombre_catalogo = nombre_catalogo;
		this.lista_astros = lista_astros;
	}

	public String getNombre_catalogo() {
		return nombre_catalogo;
	}

	public void setNombre_catalogo(String nombre_catalogo) {
		this.nombre_catalogo = nombre_catalogo;
	}

	public ArrayList getLista_astros() {
		return lista_astros;
	}

	public void setLista_astros(ArrayList lista_astros) {
		this.lista_astros = lista_astros;
	}

	@Override
	public String toString() {
		return "Catalogo [nombre_catalogo=" + nombre_catalogo + ", lista_astros=" + lista_astros + "]";
	}
	
	private int posicionDe(astro a) {
		int posicion = 0;
		for ( astro elemento : lista_astros) {
			if(elemento.getNombre().equals(a)) {
				posicion++;
			}else {
				posicion++;	
			}
		}
		return posicion;
	}
	
	private boolean esEstrellaSimpleVista(int i) {
		if(i < 5) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void mostrarCatalogo(ArrayList<astro> a) {
		for(int i=0; i<a.size(); i++) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println( i + "- Nombre(" + a.get(i).getNombre() + "), Tipo(" + a.get(i).getTipo() + "), Brillo(" + a.get(i).getBrillo() + "), Distancia(" + a.get(i).getDistancia() + ")");
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public static void mostrarAsimpleVista(ArrayList<astro> a) {
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).getBrillo() < 5) {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println( i + "- Nombre(" + a.get(i).getNombre() + "), Tipo(" + a.get(i).getTipo() + "), Brillo(" + a.get(i).getBrillo() + "), Distancia(" + a.get(i).getDistancia() + ")");
			}
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public static void astroMasBrillante(ArrayList<astro> a) {
		double brillo = 0; int posicion = 0;
		for(int i=0; i<a.size()-1; i++) {
			if(a.get(i).getBrillo() > brillo) {
				brillo = a.get(i).getBrillo();
			}
			posicion ++;
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(" Nombre(" + a.get(posicion).getNombre() + "), Tipo(" + a.get(posicion).getTipo() + "), Brillo(" + a.get(posicion).getBrillo() + "), Distancia(" + a.get(posicion).getDistancia() + ")");
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public static void otroMasBrillante(ArrayList<astro> a, String b) {
		int posicion = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).getNombre().equals(b)){
				posicion = i;
			}
		}
		for(int i=0; i<a.size(); i++) {
			if(a.get(posicion).getNombre() != a.get(i).getNombre() && a.get(posicion).getBrillo() < a.get(i).getBrillo()) {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println( i + "- Nombre(" + a.get(i).getNombre() + "), Tipo(" + a.get(i).getTipo() + "), Brillo(" + a.get(i).getBrillo() + "), Distancia(" + a.get(i).getDistancia() + ")");
				System.out.println("-------------------------------------------------------------------------");
			}
		}
	}
	
	public static boolean dentro_lista(ArrayList<astro> a, String b) {
		int aparece = 0;
		for(astro elemento : a) {
			if(elemento.getNombre() == b) {
				aparece++;
			}
		}
		if(aparece > 0) {
			return true;
		}else {
			return false;
		}
	}
	
}