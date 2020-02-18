package Astro;

public class astro {

	public static final int ESTRELLA = 0;
	public static final int NEBULOSA = 1;
	public static final int GALAXIA = 2;
	
	private String nombre;
	private int tipo;
	private double brillo;
	private double distancia;
	
	public astro(){
		this.nombre = "Sirius";
		this.tipo = 0;
		this.brillo = -1.42;
		this.distancia = 8.7;
	}
	
	public astro(String a, int b, double c, double d) {
		this.nombre = a;
		this.tipo = b;
		this.brillo = c;
		this.distancia = d;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getBrillo() {
		return brillo;
	}

	public void setBrillo(double brillo) {
		this.brillo = brillo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public astro buscarNombre(String nombre) {
		if(this.getNombre().equals(nombre)) {
			return this;
		}else {
			return null;
		}
	}
	
	public static boolean compararAstros(astro a, astro b) {
		boolean iguales = true;
		if(a.getNombre().equals(b.getNombre())) {
			iguales = false;
		}
		if(a.getBrillo() ==  b.getBrillo()) {
			iguales = false;
		}
		if(a.getTipo() == b.getTipo()) {
			iguales = false;
		}
		if(a.getDistancia() == b.getDistancia()) {
			iguales = false;
		}
		if(iguales) {
			return iguales;
		}else {
			return iguales;
		}
	}
	
	public static void formato(astro a) {
		System.out.println( a.getNombre() + ": " + a.getTipo() + " (" + a.getBrillo() + " , " + a.getDistancia() + ")");
	}
	
	public static void magnitudAbsoluta(astro a) {
		double magnitud = a.getBrillo() + Math.log(a.getDistancia())*5;
		System.out.println("La magnitud absoluta es: " + magnitud);
	}
	
	public int mas_brillante(astro a) {
		if(this.getBrillo() > a.getBrillo()) {
			return 1;
		}else if (this.getBrillo() < a.getBrillo()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public String visibilidad() {
		if(this.getBrillo() < 5) {
			return "a simple vista";
		}else if(this.getBrillo() >= 5 && this.getBrillo() < 7) {
			return "con prismaticos";
		}else if(this.getBrillo() >= 7 && this.getBrillo() <= 25) {
			return "con telescopio";
		}else {
			return "con grandes telescopios";
		}
	}
	
}