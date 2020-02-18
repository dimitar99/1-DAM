package usuario;

import java.util.*;

public class Departamento {

	Scanner sc = new Scanner (System.in);
	private String nombre;
	private int max_user;
	private ArrayList<Usuario> usuarios;
	
	public Departamento() {
		this.nombre = "";
		this.max_user = 10;
		this.usuarios = new ArrayList<Usuario>();
	}

	public Departamento(String a, int b) {
		this.nombre = a;
		this.max_user = b;
		this.usuarios = new ArrayList<Usuario>();	
	}

	public String getNombre() {
		return nombre;	
	}

	public void setNombre(String nombre) {	
		this.nombre = nombre;	
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setMaxUser(int a) {
		this.max_user = a;
	}
	
	public int getMaxUser() {
		return max_user;
	}

	public void setUsuarios() {
		if(numeroUsuarios() < getMaxUser()) {
			System.out.print("Nombre usuario: "); String usuario = sc.nextLine();
			System.out.print("Contraseña: "); String contra = sc.nextLine();
			Usuario user = new Usuario(usuario,contra);
			usuarios.add(user);
		}
	}	
	
	public int numeroUsuarios() {
		return usuarios.size();
	}
	
	public void eliminarUsuario() {
		if (numeroUsuarios() > 0) {
			System.out.print("Indica el usuario a eliminar: "); String nombre = sc.nextLine();
			
			Iterator it = usuarios.iterator();
			while(it.hasNext()) {
				Usuario u = (Usuario) it.next();
				if(u.getNombre().equals(nombre)) {
					it.remove();
				}
			}
			
		}else {
			System.out.println("Departamento vacio");
		}
	}
	
	public void encriptar() {
		System.out.print("Indica el usuario: "); String nombre = sc.nextLine();
		for(Usuario u: usuarios) {
			if(u.getNombre().equals(nombre)) {
				u.encriptar();
			}
		}
	}
	
	public void desencriptar() {
		System.out.print("Indica el usuario: "); String nombre = sc.nextLine();
		for(Usuario u: usuarios) {
			if(u.getNombre().equals(nombre)) {
				u.desencriptar();
			}
		}
	}
	
	public void visualizarDatos() {
		System.out.println("Departamento: " + getNombre());
		System.out.println("Maximo usuarios: " + getMaxUser());
		System.out.println("Numero usuarios: " + numeroUsuarios());
		System.out.println();
	}
	
	public void visualizarUsuariosEncriptados() {
		System.out.println("Departamento: " + getNombre());
		System.out.println("Usuarios con contraseñas encriptadas: ");
		for(Usuario u : usuarios) {
			if(u.getEncriptada()) {
				u.imprimeUsuario();
			}
		}
	}
	
	public void visualizarUsuariosNoEncriptados() {
		System.out.println("Departamento: " + getNombre());
		System.out.println("Usuarios con contraseñas encriptadas: ");
		for(Usuario u : usuarios) {
			if(!u.getEncriptada()) {
				u.imprimeUsuario();
			}
		}
	}
	
	public void modificarUsuario() {
		if(numeroUsuarios()!= 0) {
			System.out.print("Nombre de usuario: "); String nombre = sc.nextLine();
			for (Usuario u: usuarios) {
				if(u.getNombre().equals(nombre)) {
					System.out.print("Introduce nuevo nombre: ");
					nombre = sc.nextLine();
					System.out.print("Introduce nueva contraseña: ");
					String pass = sc.nextLine();
					u.setNombre(nombre);
					u.setContrasenya(pass);
					u.setEncriptada(false);
				}
			}
		}
	}
}