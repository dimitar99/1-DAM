package zoo;

import java.io.IOException;
import java.util.*;

public class zoo_app {

	public static void main(String[] args) throws IOException {
		zoo listado = new zoo();
		Scanner sc = new Scanner(System.in); int opc = 0;
	
		do {
			menu(); 
			try {
				System.out.print("Indica opcion: "); opc = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.println("ERROR, NO HAS INTRODUCIDO UN NUMERO");
			}
			System.out.println("##############################################");
			switch (opc) {
			case 1:
				listado.anyadeAnimal();
				continuar();
				break;
			case 2:
				listado.existeAnimalPais();
				continuar();
				break;
			case 3:
				listado.mediaEdad();
				continuar();
				break;
			case 4:
				listado.eliminaAnimalesPorPais();
				continuar();
				break;
			case 5:
				listado.cuantosPesanMasDe();
				continuar();
				break;
			case 6:
				listado.animalAparece();
				continuar();
				break;
			case 7:
				listado.edadPrimerAnimal();
				continuar();
				break;
			case 8:
				listado.pesoUltimoAnimal();
				continuar();
				break;
			case 9:
				listado.mostrarListaAnimales();
				listado.reemplazarAnimal();
				continuar();
				break;
			case 10:
				listado.mostrarListaAnimales();
				listado.eliminarAnimal();
				continuar();
				break;
			case 11:
				listado.mostrarListaAnimales();
				listado.insertarAnimal();
				continuar();
				break;
			case 12:
				listado.resetZoo();
				continuar();
				break;
			case 13:
				listado.mostrarListaAnimales();
				continuar();
				break;
			case 14:
				listado.comprobarClausurado();
				continuar();
				break;
			case 15:
				sc.close();
				for(int i=0; i<24; i++) {
					System.out.println();
				}
				System.out.println("SALIENDO........");
				break;
			default:
				System.out.println("OPCION NO VALIDA");
				break;
			}
		}while(opc != 15);
		
	}
	
	public static void menu() {
		System.out.println("##############################################");
		System.out.println("1-Añadir animal...");
		System.out.println("2-Hay animales del pais...");
		System.out.println("3-Promedio edad");
		System.out.println("4-Eliminar animales del pais...");
		System.out.println("5-Cuantos pesan mas...");
		System.out.println("6-Aparece animal...");
		System.out.println("7-Edad del primer animal...");
		System.out.println("8-Peso del ultimo animal...");
		System.out.println("9-Reemplazar animal...");
		System.out.println("10-Eliminar animal...");
		System.out.println("11-Insertar animal...");
		System.out.println("12-Clausura zoo...");
		System.out.println("13-Listado animales...");
		System.out.println("14-Zoologico clausurado?...");
		System.out.println("15-SALIR");
		System.out.println("##############################################");
	}
	
	public static void continuar() throws IOException {
		System.out.println();
		System.out.println("Pulsa enter para continuar...");
		System.in.read();
	}

}
