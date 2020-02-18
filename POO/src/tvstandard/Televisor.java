package tvstandard;

public class Televisor {

	public int canal;
	private int volumen;
	

	public Televisor(){
		canal = 0;
		setVolumen(5);
	}
	
	public void subirCanal() {
		canal++;
	}
	
	public void bajarCanal() {
		canal--;
	}
	
	public void setVolumen(int volumen) {
		volumen = 5;
	}

	public int getVolumen(int volumen) {
		return volumen;
	}
	
	public void setCanal(int a) {
		if ( a < 0) {
			canal = 0;
		}else {
			canal = a;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	
	public void subirColor() {
		subirColorAyuda();
	}
	
	private static void subirColorAyuda() {
		System.out.println("Subiendo el color");
	}
	
	public void bajarColor() {
		bajarColorAyuda();
	}
	
	private static void bajarColorAyuda() {
		System.out.println("Bajando el color");
	}
	
}