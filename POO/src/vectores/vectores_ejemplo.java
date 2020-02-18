package vectores;

import java.util.*;

public class vectores_ejemplo {

	public static void main(String[] args) {
		
		//De esta manera lo creamos con longitud 10 por defecto
		//y cuando nos pasemos de esta, se duplicara de 10 a 20
		//de 20 a 40...
		Vector<String> v = new Vector<String>();
		
		//De esta manera se crea el vector con longitud predefinida
		//y si se rebasa, se duplica de 10 a 20, de 20 a 40...
		Vector<String> vv = new Vector<String>(20);
		
		//De esta manera se crea el vector con longitud predefinida
		//y se indican los aumentos en caso de rebasarla
		Vector<String> vvv = new Vector<String>(20,5);
		
		v.addElement("uno");
		v.addElement("dos");
		v.addElement("cuatro");
		v.addElement("cinco");
		v.addElement("seis");
		v.addElement("siete");
		v.addElement("ocho");
		v.addElement("nueve");
		v.addElement("diez");
		v.addElement("once");
		v.addElement("doce");
		
		mostrarVector(v);
		System.out.println("La capacidad del vector es: "+v.capacity());
		System.out.println("La longitud del vector es: "+v.size());
		System.out.println("Insertamos el <tres> en la posicion 2: ");v.insertElementAt("tres",2);
		mostrarVector(v);
		System.out.println("El primer elemento es: "+v.firstElement());
		System.out.println("El ultimo elemento es: "+v.lastElement());
		//Para cada posicion en la que apareceria
		System.out.println("La posicion del <seis> es: "+v.indexOf("seis"));
		//Para saber la ultima posicion en la que aparece
		System.out.println("La ultima posicion del <seis> es: "+v.lastIndexOf("seis"));
		//Borrar todo el vector
		v.removeAllElements();
		//Borrar algun elemento indicando valor
		v.removeElement("ocho");
		//Borrar algun elemento indicando posicion
		v.removeElementAt(2);
		//Ajustar tamaño del vector a los elementos que contiene
		v.trimToSize();
		//Establecer nuevo tamaño vector
		v.setSize(99);
		//Saber si el vector esta vacio
		v.isEmpty();
	}
	
	public static void mostrarVector (Vector<String> a) {
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(i+" "+a.elementAt(i));
		}
		
	}
}