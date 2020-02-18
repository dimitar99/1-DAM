package usuario;

import java.util.*;

public class Departamento_app {

	public static void main(String[] args) {
		
		ArrayList<Departamento> dep = new ArrayList<Departamento>();		
		Scanner sc=new Scanner (System.in); int opc = 0, opc1 = 0;
		
		do {
			verMenu1();
			try {
				System.out.print("OPCION: "); opc = Integer.parseInt(sc.nextLine());
			}catch (Exception e){
				System.out.println("Opcion invalida");
			}
			switch (opc) {
			case 1:
				anyadirDepartamento(dep);
				break;
			case 2:
				eliminarDepartamento(dep);
				break;
			case 3:
				gestionarDepartamento(dep);
				break;
			case 4:
				System.out.println("Adios..........");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		}while (opc != 4);
		
	}
	
	public static void verMenu1() {
		System.out.println("****************************");
		System.out.println("1-Crear Departamento");
		System.out.println("2-Borrar Departamento");
		System.out.println("3-Gestionar Departamento");
		System.out.println("4-Salir");
		System.out.println("****************************");
	}
	
	public static void verMenu2() {
		System.out.println("****************************************");
		System.out.println("1-Crear Usuario");
		System.out.println("2-Borrar Usuario");
		System.out.println("3-Modificar Usuario");
		System.out.println("4-Encriptar Contraseña");
		System.out.println("5-Desencriptar Contraseña");
		System.out.println("6-Visualizar Datos del Departamento");
		System.out.println("7-Visualizar Usuarios (encriptados)");
		System.out.println("8-Visualizar Usuarios (desencriptados)");
		System.out.println("9-Salir");
		System.out.println("****************************************");
	}
	
	public static void verDepartamentos(ArrayList<Departamento> dep) {
		System.out.println("Departamentos: ");
		for( Departamento d : dep ) {
			System.out.println(d.getNombre());
		}
	}

	public static void anyadirDepartamento(ArrayList<Departamento> dep) {
		Scanner sc=new Scanner (System.in); int opc = 0;
		try {
			boolean existe;
			do {
				existe = false;
				System.out.print("Nombre Departamento: "); String nombre = sc.nextLine();
				System.out.print("Maximo Usuarios: "); int maxUsers = Integer.parseInt(sc.nextLine());
				Departamento dep1 = new Departamento(nombre,maxUsers);
				for ( Departamento d : dep ) {
					if(d.getNombre().equals(nombre)) {
						System.out.println("El departamento ya existe");
						existe=true;
					}else {
						existe=false;
					}
				}
				dep.add(dep1);
			}while(existe);
		}catch (Exception e) {
			System.out.println();
		}
	}
	
	public static void eliminarDepartamento(ArrayList<Departamento> dep) {
		if(!dep.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nombre Departamento: "); String nombre = sc.nextLine();
			
			Iterator it = dep.iterator();
			while(it.hasNext()) {
				Departamento d = (Departamento)it.next();
				if(d.getNombre().equals(nombre)) {
					it.remove();
					System.out.println("Eliminado.........");
				}
			}
		}
	}
	
	public static void gestionarDepartamento(ArrayList<Departamento> dep) {
		int opc = 0;
		if(!dep.isEmpty()) {
			Scanner sc = new Scanner (System.in);
			System.out.print("Introduce nombre DEP: "); String nombre = sc.nextLine();
			Iterator it = dep.iterator();
			while(it.hasNext()) {
				Departamento d = (Departamento) it.next();
				if(d.getNombre().equals(nombre)) {
					do {
						verMenu2();
						try {
							System.out.print("OPCION: "); opc = Integer.parseInt(sc.nextLine());
						}catch(Exception e) {
							System.out.println("OPCION INVALIDA");
						}
						switch (opc) {
						case 1:
							d.setUsuarios();
							break;
						case 2:
							d.eliminarUsuario();
							break;
						case 3:
							d.modificarUsuario();
							break;
						case 4:
							d.encriptar();
							break;
						case 5:
							d.desencriptar();
							break;
						case 6:
							d.visualizarDatos();
							break;
						case 7:
							d.visualizarUsuariosEncriptados();
							break;
						case 8:
							d.visualizarUsuariosNoEncriptados();
							break;
						case 9:
							System.out.println("Saliendo.....");
							break;
						default:
							System.out.println("OPCION INVALIDA");
							break;
						}
					}while(opc != 9);
				}
				}
			}
	}
	
}