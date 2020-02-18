package vector3d;

import java.util.Scanner;

public class Vector_APP { 
	
	public static void main(String[] args) {
		
		vector1 v = new vector1();
		vector1 v1 = new vector1();
		vector1 v2 = new vector1();
		Scanner sc = new Scanner (System.in);
		int opc = 0;
		
		do{
			verMenu();
			opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				System.out.print("Introduce valor: "); int valorX = sc.nextInt();
				v.setX(valorX);
				System.out.print("Introduce valor: "); int valorY = sc.nextInt();
				v.setY(valorY);
				System.out.print("Introduce valor: "); int valorZ = sc.nextInt();
				v.setZ(valorZ);
				break;
			case 2:
				System.out.print("Introduce valor: "); int valorX1 = sc.nextInt();
				v1.setX(valorX1);
				System.out.print("Introduce valor: "); int valorY1 = sc.nextInt();
				v1.setY(valorY1);
				System.out.print("Introduce valor: "); int valorZ1 = sc.nextInt();
				v1.setZ(valorZ1);
				break;
			case 3:
				vector1.suma(v,v1,v2);
				break;
			case 4:
				vector1.resta(v, v1, v2);
				break;
			case 5:
				vector1.prod_escalar(v, v1, v2);
				break;
			case 6:
				vector1.longitud(v, v2);
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				break;
			}
			
		}while( opc < 7 );

	}
	
	public static void verMenu() {
		
		System.out.println("1.Introduce el primer vector:");
		System.out.println("2.Introduce el segundo vector:");
		System.out.println("3.Calcular la suma");
		System.out.println("4.Calcular la diferencia");
		System.out.println("5.Calcular el producto escalar");
		System.out.println("6.Calcular la longitud");
		System.out.println("7.Finalizar");
		
	}

}