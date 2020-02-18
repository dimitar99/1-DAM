package ColeccionDiscos;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList<Coleccion> coleccion = new ArrayList<Coleccion>();
		ArrayList<Disco> disco = new ArrayList<Disco>();
		Collections.sort(disco);
		int opc = 0;
		
		do {
			menu();
			try {
				System.out.print("OPCION: "); opc = Integer.parseInt(sc.next());
				switch (opc) {
				case 1:
					System.out.print("TIPO COLECCION: "); String tipo = sc.next();
					Coleccion a = new Coleccion(tipo);
					coleccion.add(a);
					for(Coleccion elemento : coleccion) {
						System.out.println(elemento.getTipo());
					}
					break;
				case 2:
					System.out.println("TIPO COLECCION: "); String tipo1 = sc.next();
					for(int i=0; i<coleccion.size(); i++) {
						if(coleccion.get(i).equals(tipo1)) {
							coleccion.get(i).insertar_disco();
						}
					}
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;
				default:
					break;
				}
			}catch(Exception e) {
				System.out.println("OPCION INCORRECTA");
			}
		}while(opc != 7);
		
	}

	public static void menu () {
		System.out.println("############################");
		System.out.println("1-CREAR COLECCION");
		System.out.println("2-INSERTAR DISCO");
		System.out.println("3-VISUALIZA DISCO COLECCION");
		System.out.println("4-BUSCAR DISCO TITULO");
		System.out.println("5-MODIFICAR PRECIO DISCO");
		System.out.println("6-DISCOS MAS BARATOS QUE");
		System.out.println("7-SALIR");
		System.out.println("############################");
	}
	
}