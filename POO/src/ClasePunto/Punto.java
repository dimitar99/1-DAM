package ClasePunto;

public class Punto {

	private int x;
	private int y;
	private String nombre;
	
	public Punto() {
		setNombre("A");
		setX(0);
		setY(0);
	}
	
	public Punto(String c,int a, int b) {
		setX(a);
		setY(b);
		setNombre(c);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public double calcularDistancia() {
		double distancia;
		
		distancia = Math.sqrt((this.x*this.x) + (this.y*this.y));
		
		return distancia;
	}
	
	public void mostrarPunto() {
		System.out.println(nombre + "(" + this.getX() + "," + this.getY() + ")");
	}
	
	//Mas alto se refiere a que la coordenada Y es la mas alta
	public static Punto masAlto(Punto p1, Punto p2) {
		
		if(p1.getY() > p2.getY()) {
			return p1;
		}else {
			return p2;
		}
		
	}
	
	public void Cuadrante() {
		
		if(getX() > 0 && getY() > 0) {
			System.out.println("Esta en el primer cuadrante");
		}
		if(getX() < 0 && getY() > 0) {
			System.out.println("Esta en el segundo cuadrante");
		}
		if(getX() < 0 && getY() < 0) {
			System.out.println("Esta en el tercer cuadrante");
		}
		if(getX() > 0 && getY() < 0) {
			System.out.println("Esta en el cuarto cuadrante");
		}
		if(getX() == 0 && getY() == 0) {
			System.out.println("Coordenada origen");
		}
		if(getX() == 0 && getY() != 0) {
			System.out.println("Eje de coordenadas Y");
		}
		if(getX() != 0 && getY() == 0) {
			System.out.println("Eje de coordenadas X");
		}
	}
	
	public static boolean enLineaV(Punto a, Punto b) {
		if(a.getX() == b.getX()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean esCuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
		if(p1.getX() == p3.getX() && p2.getX() == p4.getX() && p1.getY() == p2.getY() && 
		   p3.getY() == p4.getY() && distanciaPunto(p1,p3) == distanciaPunto(p2,p4) ){
			return true;
		}else {
			return false;
		}
	}
	
	public static double distanciaPunto(Punto p1, Punto p2) {
		double distancia;
		double a = Math.pow(p1.getX()-p2.getX(), 2);
		double b = Math.pow(p1.getY()-p2.getY(), 2);
		
		distancia = Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2));
		
		return distancia;
	}
}