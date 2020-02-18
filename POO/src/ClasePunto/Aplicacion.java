package ClasePunto;

public class Aplicacion {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		p1.mostrarPunto();
		Punto p2 = new Punto("B",5,6);
		p2.mostrarPunto();
		Punto p3 = new Punto("C",0,0);
		Punto p4 = new Punto("D",2,0);
		Punto p5 = new Punto("E",0,2);
		Punto p6 = new Punto("F",2,2);
		System.out.println("#########################################################");
		System.out.println("La distancia de p1 es: " + p1.calcularDistancia());
		System.out.println("La distancia de p2 es: " + p2.calcularDistancia());
		System.out.println("#########################################################");
		System.out.print("El mayor es: "); Punto.masAlto(p1, p2).mostrarPunto();
		System.out.println("#########################################################");
		p1.mostrarPunto(); p1.Cuadrante();
		System.out.println("#########################################################");
		p2.mostrarPunto(); p2.Cuadrante();
		System.out.println("#########################################################");
		
		if(Punto.esCuadrado(p3,p4,p5,p6)) {
			System.out.println("Es cuadrado");
		}else{
			System.out.println("No lo es");
		}
		
	}
}
