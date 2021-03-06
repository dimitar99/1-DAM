package ColeccionDiscos;

public class Disco implements Comparable<Disco>{

	private String titulo;
	private int num_canciones;
	private float precio;
	
	public Disco() {
		
	}
	
	public Disco(String a, int b, float c) {
		this.titulo = a;
		this.num_canciones = b;
		this.precio = c;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNum_canciones() {
		return num_canciones;
	}

	public void setNum_canciones(int num_canciones) {
		this.num_canciones = num_canciones;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void visualizar_Disco() {
		System.out.println("Titulo(" + this.getTitulo() + ") Numero_Canciones(" + this.getNum_canciones() + ") Precio(" + this.getPrecio() + ")");
	}
	
	@Override
	public int compareTo(Disco disco) {	
		return this.getTitulo().compareTo(disco.getTitulo());
	}
	
}
