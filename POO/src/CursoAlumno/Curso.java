package CursoAlumno;

import java.util.*;

public class Curso {
	
	Scanner sc = new Scanner (System.in);
	String nombre_curso;
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public Curso() {
		
	}
	
	public Curso(String a) {
		this.nombre_curso = a;
	}

	public String getNombre_curso() {
		return nombre_curso;
	}

	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}
	
	public void crear_alumno() {
		if(!alumnos.isEmpty()) {
			String nombre = ""; int id = 0; double media = 0;
			System.out.print("NOMBRE: "); nombre = sc.next();
			try {
				System.out.print("ID: "); id = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.print("FORMATO NUMERICO NO VALIDO");
			}
			try {
				System.out.print("MEDIA: "); media = sc.nextDouble();
			}catch(Exception e) {
				System.out.println("FORMATO DECIMAL NO VALIDO");
			}
			Alumno a = new Alumno(nombre, id, media); int o = 0;
			for(Alumno elemento : alumnos) {
				if(elemento.getId() == a.getId()) {
					o++;
				}
			}
			if(o > 0) {
				System.out.print("ERROR EL ALUMNO YA EXISTE");
			}else {
				alumnos.add(a);
			}
		}else {
			String nombre = ""; int id = 0; double media = 0;
			System.out.print("NOMBRE: "); nombre = sc.next();
			try {
				System.out.print("ID: "); id = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.print("FORMATO NUMERICO NO VALIDO");
			}
			try {
				System.out.print("MEDIA: "); media = sc.nextDouble();
			}catch(Exception e) {
				System.out.println("FORMATO DECIMAL NO VALIDO");
			}
			Alumno a = new Alumno(nombre, id, media);
			alumnos.add(a);
		}
	}
	
	public void borrar_alumno(int a) {
		Iterator it = alumnos.iterator(); int borrados = 0;
		while(it.hasNext()) {
			Alumno alumno = (Alumno) it.next();
			if(alumno.getId() == a) {
				it.remove(); borrados ++;
			}
		}
		if(borrados == 0) {
			System.out.println("NO HAY ALUMNOS CON ESE ID");
		}
	}
	
	public void listado_alumnos() {
		int index = 0;
		if(!alumnos.isEmpty()) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("---------------------LISTADO ALUMNOS ----------------------");
			System.out.println("-----------------------------------------------------------");
			for(Alumno elemento : alumnos) {
				System.out.println(index + "- Nombre(" + elemento.getNombre() + ") - ID(" + elemento.getId() + ") - Nota_Media(" + elemento.getNota_media() + ")");
				index++;
			}
			System.out.println("-----------------------------------------------------------");
		}else {
			System.out.println("-----------------------------------------------------------");
			System.out.println("LISTADO DE ALUMNOS VACIO");
			System.out.println("-----------------------------------------------------------");
		}
	}
	
	public void crear_curso(ArrayList<Curso>a) {
		String nombre = "";
		if(a.isEmpty()) {
			System.out.print("NOMBRE: "); nombre = sc.next();
			Curso curso = new Curso(nombre);
			a.add(curso);
		}else {
			System.out.print("NOMBRE: "); nombre = sc.next();
			for(Curso elemento : a) {
				if(elemento.getNombre_curso().equals(nombre)) {
					System.out.println("EL CURSO YA EXISTE ");
				}else {
					Curso curso = new Curso(nombre);
					a.add(curso);
				}
			}
		}
	}
	//cursos.get(index).anyade_a_curso(Alumno a);
	public void anyade_a_curso(ArrayList<Alumno> a) {
		System.out.println("NOMBRE ALUMNOS: "); String nombre_alumno = sc.next();
		
	}
	
	public void mostrar_cursos(ArrayList<Curso> a) {
		int index = 0;
		if(!a.isEmpty()) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("---------------------LISTADO CURSOS------------------------");
			System.out.println("-----------------------------------------------------------");
			for(Curso elemento : a) {
				System.out.println(index + "- Nombre(" + elemento.getNombre_curso() + ")");
				index++;
			}
			System.out.println("-----------------------------------------------------------");
		}else {
			System.out.println("-----------------------------------------------------------");
			System.out.println("LISTADO DE CURSOS VACIOS");
			System.out.println("-----------------------------------------------------------");
		}
	}
}