package zoo;

import java.io.IOException;
import java.util.*;

import usuario.Usuario;

public class zoo {
	
	ArrayList<animal> a = new ArrayList<animal>();
	Scanner sc = new Scanner(System.in);
	
	public zoo() {
		
	}
	
	public void anyadeAnimal() {
		String nombre = "a", pais = "a";double peso=0; int edad=0; 
		boolean esNombre = false, esPais = false, esDouble = false, esInt = false;
		
		do {
			try {
				System.out.print("Nombre: "); nombre = sc.next();
				esNombre = true;
			}catch (Exception e) {
				System.out.println("Formato nombre incorrecto");
			}
		}while(!esNombre);
		
		System.out.print("Pais: "); pais = sc.next();

		do {
			 try{
				 System.out.print("Peso(Decimal): "); peso = Double.parseDouble(sc.next());
				 esDouble = true;
			 }
			 catch(NumberFormatException nfe){
				 System.out.println("Formato peso incorrecto");
			 }
		}while (!esDouble);
		
		do {
			try {
				System.out.print("Edad(Entero): "); edad = Integer.parseInt(sc.next());
				esInt = true;
			}catch (Exception e) {
				System.out.println("Formato numero incorrecto");
			}
		}while(!esInt);
		
		animal animal = new animal(nombre,pais,peso,edad); a.add(animal);
	}
	
	public void existeAnimalPais() {
		System.out.print("Indica el pais de origen: "); String pais = sc.next(); boolean hay = false;
		for( animal animal: a) {
			if(animal.getPais().equals(pais)) {
				hay = true;
			}
		}
		if(hay) {
			System.out.println("Hay animales del pais " + pais);
		}else {
			System.out.println("No hay animales el pais " + pais);
		}
	}
	
	public void mediaEdad() {
		double edadMedia = 0; int totalAnimales = 0;
		for( animal animal: a) {
			int peso = animal.getEdad();
			edadMedia+=peso;
			totalAnimales++;
		}
		edadMedia/=totalAnimales;
		System.out.println("La media de edad es: " + edadMedia);
	}
	
	public void eliminaAnimalesPorPais() {
		try {
			System.out.print("Indica el pais de origen: "); String pais = sc.next(); int contador = 0;
			Iterator it = a.iterator();
			while(it.hasNext()) {
				animal animal = (animal) it.next();
				if(animal.getPais().equals(pais)) {
					it.remove(); contador++;
				}
			}
			if(contador == 0) {
				System.out.println("NO EXISTEN ANIMALES DE ESE PAIS");
			}
		}catch(Exception e) {
			System.out.println("DATO INTRODUCIDO INCORRECTO");
		}
	}
	
	public void cuantosPesanMasDe() {
		System.out.print("Indica el peso: ");
		try {
			double peso = Double.parseDouble(sc.next()); int contador = 0;
			for(animal animal :a ) {
				if(animal.getPeso() > peso) {
					contador++;
				}
			}
			System.out.println("Hay " + contador + " animales que pesan mas de " + peso + " kg");
		}catch(Exception e) {
			System.out.println("OPCION NO VALIDA");
		}

	}
	
	public void animalAparece() {
		boolean aparece = false;
		System.out.print("Indica el nombre de animal: "); 
		try {
			String nombre = sc.next();
			for(animal animal : a) {
				if(animal.getNombre().equals(nombre)) {
					aparece = true;
				}
			}
			System.out.println(nombre + " aparece");
		}catch(Exception e) {
			System.out.println("OPCION NO VALIDA");
		}
	}
	
	public void edadPrimerAnimal() {
		System.out.println("La edad del primer animal es: " + a.get(0).getEdad());
	}
	
	public void pesoUltimoAnimal() {
		System.out.println("El peso del ultimo animal es: " + a.get(a.size()-1).getPeso());
	}
	public void reemplazarAnimal() {
		sc.nextLine();
		try {
			System.out.println("Indica la posicion del animal: "); int posicion = sc.nextInt();
			System.out.print("Indica el nombre del animal: "); String nombre = sc.next();
			a.get(posicion).setNombre(nombre);
			System.out.print("Indica el pais del animal: "); String pais = sc.next();
			a.get(posicion).setPais(pais);
			System.out.print("Indica la edad del animal: "); int edad = sc.nextInt();
			a.get(posicion).setEdad(edad);
			System.out.print("Indica el peso del animal: "); double peso = sc.nextInt();
			a.get(posicion).setPeso(peso);
		}catch(Exception e) {
			System.out.println("ERROR, DATO INTRODUCIDO INCORRECTO");
		}
	}
	
	public void eliminarAnimal() {
		sc.nextLine();
		try {
			System.out.println("Indica la posicion a eliminar: "); int posicion = sc.nextInt();
			a.remove(posicion);
		}catch(Exception e) {
			System.out.println("POSICION INCORRECTA");
		}
	}
	
	public void insertarAnimal() {
		sc.nextLine();
		try {
			animal animal = new animal();
			System.out.println("Indica la posicion del animal: "); int posicion = sc.nextInt();
			System.out.print("Indica el nombre del animal: "); String nombre = sc.next();
			animal.setNombre(nombre);
			System.out.print("Indica el pais del animal: "); String pais = sc.next();
			animal.setPais(pais);
			System.out.print("Indica la edad del animal: "); int edad = sc.nextInt();
			animal.setEdad(edad);
			System.out.print("Indica el peso del animal: "); double peso = sc.nextInt();
			animal.setPeso(peso);
			a.add(posicion, animal);
		}catch(Exception e) {
			System.out.println("ERROR, DATO INTRODUCIDO INCORRECTO");
		}
	}
	
	public void resetZoo() throws IOException {
		System.out.println("Pulsa Enter para clausurar el zoo...");
		System.in.read();
		a.clear();
	}
	
	public void comprobarClausurado() {
		if(a.isEmpty()) {
			System.out.println("Zoologico clausurado");
		}else {
			System.out.println("Zoologico no clausurado");
		}
	}
	
	public void mostrarListaAnimales() {
		int contador = 0;
		System.out.println("-------------------------------------------------------");
		System.out.println("--------------------LISTA ANIMALES---------------------");
		System.out.println("-------------------------------------------------------");
		for(animal animal: a) {
			System.out.println(contador + " - Nombre(" + animal.getNombre() + ") Pais(" + animal.getPais() + ") Peso(" + animal.getPeso() + ") Edad(" + animal.getEdad() + ")");
			System.out.println("-------------------------------------------------------"); 
			contador++;
		}
	}
	
}