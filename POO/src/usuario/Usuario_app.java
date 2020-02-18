package usuario;

import java.util.*;

public class Usuario_app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Usuario dimitar = new Usuario("dimitar","dimitar");

		dimitar.imprimeUsuario();
		dimitar.encriptar();
		dimitar.imprimeUsuario();
		dimitar.desencriptar();
		dimitar.imprimeUsuario();
		
	}

}
