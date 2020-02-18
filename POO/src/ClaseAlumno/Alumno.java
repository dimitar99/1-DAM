package ClaseAlumno;

public class Alumno {
	String nombre;
	char grupo;

	Alumno() {

	}

	Alumno(String nombre, char grupo) {
		this.nombre = nombre;
		this.grupo = grupo;
	}

	char getGrupo() {
		return grupo;
	}

	void cambiarGrupo(char nuevogrupo) {
		grupo = nuevogrupo;
	}

	void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Grupo: " + getGrupo());
	}
}