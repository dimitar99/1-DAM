package Astro;

import java.util.*;

public class Catalogo_app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//CREACION DEL ARRAYLIST CATALOGO
		ArrayList<astro> CatalogoAstronomico = new ArrayList<astro>();
		
		//MOSTRAMOS MENU
		int opc = 0;
		do {
			menu();
			try{
				System.out.print("OPCION: "); opc = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.println("SOLO NUMEROS");
			}
			switch (opc) {
				case 1:
					System.out.println("Indica el nombre del astro: "); String nombreAstro = sc.next();
					int tipo = 0;
					do {
						try {
							System.out.println("Tipo: (1-Estrella, 2-Nebulosa, 3-Galaxia: "); tipo = sc.nextInt();
						}catch(Exception e) {
							System.out.println("ERROR, DEBES INTRODUCIR UN NUMERO NO DECIMAL");
						}
					}while(tipo < 1 && tipo > 3);
					
					double brillo = 0;
					do {
						try {
							System.out.println("Indica el brillo: "); brillo = sc.nextDouble();
						}catch(Exception e) {
							System.out.println("ERROR, DEBES INTRODUCIR UN NUMERO DECIMAL");
						}
					}while(!(brillo > 0 || brillo < 0 || brillo == 0));
					
					double distancia = 0;
					do {
						try {
							System.out.println("Indica la distancia: "); distancia = sc.nextDouble();
						}catch(Exception e) {
							System.out.println("ERROR, DEBES INTRODUCIR UN NUMERO DECIMAL");
						}
					}while(!(distancia > 0 || distancia < 0 || distancia == 0));
					astro nuevo = new astro(nombreAstro,tipo,brillo,distancia);
					CatalogoAstronomico.add(nuevo);
					break;
				case 2:
					Catalogo.mostrarCatalogo(CatalogoAstronomico);
					break;
				case 3:
					Catalogo.mostrarAsimpleVista(CatalogoAstronomico);
					break;
				case 4:
					Catalogo.astroMasBrillante(CatalogoAstronomico);
					break;
				case 5:
					boolean aparece = false; String nombre = "a";
					do {
						System.out.print("NOMBRE: "); nombre = sc.next();
						if(Catalogo.dentro_lista(CatalogoAstronomico, nombre)) {
							aparece = true;
						}
					}while(!aparece);
					Catalogo.otroMasBrillante(CatalogoAstronomico, nombre);
					break;
				case 6:
					limpiar_pantalla();
					System.out.println("SALIENDO...");
					break;
				default:
					System.out.println("OPCION NO VALIDA");
					break;
		}
				
		}while(opc != 6);
	}

	public static void menu() {
		System.out.println("################################################");
		System.out.println("#1-CREAR ASTRO                                 #");
		System.out.println("#2-VISUALIZAR CATALOGO                         #");
		System.out.println("#3-VISUALIZAR ESTRELLAS VISIBLES A SIMPLE VISTA#");
		System.out.println("#4-ASTRO MAS BRILLANTE                         #");
		System.out.println("#5-DEVOLVER UN ASTRO MAS BRILLANTE             #");
		System.out.println("#6-SALIR                                       #");
		System.out.println("################################################");
	}
	
	public static void limpiar_pantalla() {
		for(int i=0; i<25; i++) {
			System.out.println("");
		}
	}
	
}