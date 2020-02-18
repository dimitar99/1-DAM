package vectores;

import java.util.*;

public class vector1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();

		//Llenar vector hasta meterle un 0
		rellenarVector(v);
		System.out.println("#####################");
		mostrarVector(v);
		System.out.println("#####################");
		//Buscar elemento, diciendo veces que aparece y posicion
		buscarElemento(v);
		System.out.println("#####################");
		//Borrar elemento
		borrarElemento(v);
		System.out.println("#####################");
		mostrarVector(v);
		System.out.println("#####################");
		//Sustituir elemento
		sustituirElemento(v);
		System.out.println("#####################");
		mostrarVector(v);
	}
	
	public static void rellenarVector(Vector a) {
		
		int valor=1; Scanner sc=new Scanner(System.in);
		
		while ( valor != 0 ) {
			System.out.print("Indica un valor: "); valor=sc.nextInt();
			a.addElement(valor);
		}
		
		System.out.println("Longitud: "+a.size());
		
	}
	
	public static void mostrarVector(Vector a) {
		
		for(int i=0; i<a.size(); i++) {
			System.out.println("Posicion "+i+": "+a.elementAt(i));
		}
		
	}
	
	public static void buscarElemento(Vector a) {

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Indica el elemento a buscar: "); int elemento=sc.nextInt();
		
		for(int i=0; i<a.size(); i++) {
			int cosa=(int)a.get(i);
			if( elemento == cosa ) {
				System.out.println(+elemento+" aparece en la posicion "+i);
			}
			
		}
		
	}
	
	public static void borrarElemento(Vector a) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Indica el elemento a borrar: "); int elemento=sc.nextInt();
		
		for(int i=0; i<a.size(); i++ ) {
			int cosa=(int)a.get(i);
			if( cosa == elemento ) {
				a.remove(i);
			}
		}
		
	}

	public static void sustituirElemento(Vector a) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Indica el elemento a sustituir: "); int sustituido=sc.nextInt();
		System.out.print("Indica su sustituto: "); int sustituto=sc.nextInt();
		
		for(int i=0; i<a.size(); i++) {
			
			int cosa=(int)a.get(i);
			if( cosa == sustituido ) {
				a.remove(i);
				a.insertElementAt(sustituto, i);
			}
			
		}
	}
}	