package CursoAlumno;

import java.io.IOException;
import java.util.*;

public class App {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Curso a = new Curso();
		Scanner sc = new Scanner (System.in);
		int opc = 0;
		
		do {
			menu();
			try {
				System.out.print("OPCION: "); opc = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.println("SOLO NUMEROS");
			}
			switch (opc) {
			case 1:
				a.crear_alumno();
				System.out.println("Pulsa intro para continuar...");
				System.in.read();
				break;
			case 2:
				a.listado_alumnos();
				try {
					System.out.print("Indica el ID de alumno: "); int ID = Integer.parseInt(sc.next());
					a.borrar_alumno(ID);
				}catch(Exception e) {
					System.out.println("ID INEXISTENTE O ERRONEO");
				}
				System.out.println("Pulsa intro para continuar...");
				System.in.read();
				break;
			case 3:
				a.crear_curso(cursos);
				System.out.println("Pulsa intro para continuar...");
				System.in.read();
				break;
			case 4:
				borrar_curso(cursos);
				System.out.println("Pulsa intro para continuar...");
				System.in.read();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				a.listado_alumnos();
				a.mostrar_cursos(cursos);
				System.out.println("Pulsa intro para continuar...");
				System.in.read();
				break;
			case 9:
				for(int i=0; i<25; i++) {
					System.out.println();
				}
				System.out.println("SALIENDO...");
			default:
				System.out.println("OPCION NO VALIDA");
				System.out.println("Pulsa intro para continuar...");
				System.in.read();
			}
		}while(opc != 9);

	}

	public static void menu() {
		System.out.println("######################################");
		System.out.println("1-ALTA DE ALUMNOS");
		System.out.println("2-BAJA DE ALUMNOS");
		System.out.println("3-ALTA DE CURSOS");
		System.out.println("4-BAJA DE CURSOS");
		System.out.println("5-COMPROBAR SI ALUMNO ESTA EN CURSO");
		System.out.println("6-ALTA DE ALUMNOS A CURSOS");
		System.out.println("7-BAJA DE ALUMNOS DE CURSOS");
		System.out.println("8-LISTADOS");
		System.out.println("9-SALIR");
		System.out.println("######################################");
	}
	
	public static void borrar_curso(ArrayList<Curso> a) {
		Scanner sc = new Scanner (System.in);
		String nombre = "";
		if(!a.isEmpty()) {
			System.out.print("NOMBRE: "); nombre = sc.next(); int apariciones = 0;
			Iterator it = a.iterator();
			while(it.hasNext()) {
				Curso b = (Curso)(it.next());
				if(b.getNombre_curso().equals(nombre)) {
					a.remove(b);
				}
			}
		}else {
			System.out.println("NO HAY NINGUN CURSO CREADO");
		}
	}
}
;