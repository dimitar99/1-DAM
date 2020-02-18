package usuario;

public class Usuario {

	private String nombre;
	private String contrasenya;
	private boolean encriptada;
	
	public Usuario() {
		
		this.nombre = "";
		this.contrasenya = "";
		this.encriptada = false;
		
	}
	
	public Usuario(String a, String b) {
		
		this.nombre = a;
		this.contrasenya = b;
		 
	}
	
	public void setNombre(String a) {
		
		this.nombre = a;	
		
	}
	
	public String getNombre() {	
		
		return nombre;		
		
	}
	
	public void setContrasenya(String a) {		
		
		this.contrasenya = a;		
		
	}
	
	public String getContrasenya() {
		
		return contrasenya;		
		
	}
	
	public void setEncriptada(boolean a) {	
		
		this.encriptada = a;
		
	}
	
	public boolean getEncriptada() {
		
		return encriptada;		
		  
	}
	
	public void encriptar() {
		
		String enc = "";
		
		for(int i=0; i<getContrasenya().length(); i++) {
			char c = (char)(getContrasenya().charAt(i) + 3);
			enc += c;
		}
		setContrasenya(enc);
		setEncriptada(true);
	}
	
	public void desencriptar() {
		
		String enc = "";
		
		for(int i=0; i<getContrasenya().length(); i++) {
			char c = (char)(getContrasenya().charAt(i) - 3);
			enc += c;
		}
		setContrasenya(enc);
		setEncriptada(false);
		
	}
	
	public void imprimeUsuario() {
		
		System.out.println("Nombre usuario: " + getNombre());
		
		if(getEncriptada()) {
			System.out.println("Contraseña encriptada: " + getContrasenya());
		}else{
			System.out.println("Contraseña no encriptada: " + getContrasenya());
		}	
		
	}
	
}