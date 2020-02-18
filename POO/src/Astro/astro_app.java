package Astro;

import java.util.*;

public class astro_app {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<astro> a = new ArrayList<astro>();
		astro sirius = new astro();
		astro alfa = new astro("Alfa",astro.ESTRELLA,4.6,4.3);
		a.add(sirius);
		a.add(alfa);
		
		//1-BUSCAR NOMBRE
		System.out.print("Nombre: "); String nombre = sc.next();
		for( astro as : a) {
			as.buscarNombre(nombre);
		}
		
		//2-COMPARAR ASTROS
		astro.compararAstros(sirius,alfa);
		
		//3-CREAR ASTRO
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
		
		astro tercero = new astro(nombreAstro,tipo,brillo,distancia);
		
		//4-MOSTRAR DATOS
		astro.formato(alfa);
		astro.formato(sirius);
		
		//5-COMPROBAR SI IGUALES
		astro.compararAstros(alfa, sirius);
		
		//6-MOSTRAR ESTRELLA MAS BRILLANTE
		sirius.mas_brillante(alfa);
		if(sirius.mas_brillante(alfa) == 1) {
			astro.formato(sirius);
		}else if(sirius.mas_brillante(alfa) == -1) {
			astro.formato(alfa);
		}else {
			System.out.println("Los 2 astros son iguales");
		}
		
		//7-VISIBILIDAD DE UNA ESTRELLA
		sirius.visibilidad();
		alfa.visibilidad();
		
		//MAGNITUD ABSOLUTA
		astro.magnitudAbsoluta(alfa);
	}

}