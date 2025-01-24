package collecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Implementa el control de acceso al área restringida de un programa. Los
		 * nombres de usuario con sus correspondientes contraseñas deben estar
		 * almacenados en una estructura de la clase HashMap. El programa mostrará un
		 * menú con dos opciones:
		 * 
		 * Registro. Debe pedir un nombre de usuario y una contraseña. A continuación,
		 * se almacenarán en el mapa.
		 * 
		 * Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario
		 * introduce los datos correctamente, el programa dirá “Ha accedido al área
		 * restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan
		 * las oportunidades el programa dirá “Lo siento, no tiene acceso al área
		 * restringida”.
		 * 
		 * Salir. Termina el programa.
		 * 
		 */

		// variable de control para terminar el programa
		boolean fin = false;

		// variable para almacenar la opcion elegida
		int opcion;
		
		// variable para almacenar el usuario y contrasena
		String user;
		String constasena;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// HashMap para almacenar los usuarios y contrasenas
		HashMap<String, String> usuario = new HashMap<String, String>();

		// bucle para saber la opcion elegida
		do {

			// mostramos el menu
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("3. Salir");

			// pedimos una opcion
			System.out.println("Introduzca una opcion:");
			opcion = sc.nextInt();

			// vaciamos el bufer
			sc.nextLine();

			// segun la opcion elegida anteriormente hacemo lo que pide
			switch (opcion) {
			
			case 1 ->{
				
				// pedimos el usuario
				System.out.println("Introduzca un usuario:");
				user = sc.nextLine();
				
				// pedimos la contrasena del usuario
				System.out.println("Introduzca un usuario:");
				constasena = sc.nextLine();
				
				// anadimos el usuario y contrasena
				usuario.put(user, constasena);
			}
			case 2 ->{
				
				// pedimos el usuario
				System.out.println("Introduzca un usuario:");
				user = sc.nextLine();
				
				// pedimos la contrasena del usuario
				System.out.println("Introduzca un usuario:");
				constasena = sc.nextLine();
				
				// comprobamos si los datos son correctos
				if (usuario.containsKey(user)) {
					
				}
			}
			case 3 ->{
				fin = true;
			}
			default ->{
				System.err.println("Introduzca una opcion valida");
			}
			}

		} while (!fin);

	}

}
