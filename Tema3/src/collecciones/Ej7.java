package collecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
		 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
		 * para almacenar las parejas de palabras. El programa mostrará un menú con dos
		 * opciones:
		 * 
		 * Inserta palabra. Debe solicitar una palabra en español y su traducción al
		 * inglés.
		 * 
		 * Busca palabra. Pregunta por una palabra en español y devuelve su traducción
		 * en inglés.
		 * 
		 * Salir. Termina el programa.
		 */

		// variable para salir
		boolean fin = false;

		// variable para saber la opcion elegida
		int opcion;
		
		// variable para introducir la palabra al diccionario
		String espanol;
		
		// variable para almacenar la traduccion de la palabra anadida
		String ingles;
		
		// variable para almacenar la palabra de la que se quiere buscar la traduccion
		String espanolTraducir;
		
		// variable para almacenar la traduccion de la palabra que se ha buscado
		String traduccion;

		// coleccion TreeMap para almacenar las palabras con sus respectivas
		// traducciones en el diccionario
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		// anadimos las palabras con sus traducciones
		diccionario.put("hola", "hello");
		diccionario.put("adiós", "goodbye");
		diccionario.put("gracias", "thank you");
		diccionario.put("por favor", "please");
		diccionario.put("mañana", "tomorrow");
		diccionario.put("hoy", "today");
		diccionario.put("noche", "night");
		diccionario.put("día", "day");
		diccionario.put("amigo", "friend");
		diccionario.put("familia", "family");
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("libro", "book");
		diccionario.put("escribir", "to write");
		diccionario.put("leer", "to read");
		diccionario.put("comer", "to eat");
		diccionario.put("beber", "to drink");
		diccionario.put("trabajar", "to work");
		diccionario.put("estudiar", "to study");
		diccionario.put("vivir", "to live");

		// escaner para pedir datos al usuario
		Scanner sc = new Scanner(System.in);

		// bucle para preguntar la opcion del menu
		do {

			System.out.println("Diccionario espanol-ingles");

			// mostramos las opciones del menu
			System.out.println("1. Inserta palabra. \n 2. Busca palabra. \n 3. Salir.");

			// espacio en blanco para separar
			System.out.println();

			// pedimos la opcion que se quiera realizar
			System.out.println("Elija una de las siguientes opciones:");
			opcion = sc.nextInt();
			
			// vaciamos el bufer
			sc.nextLine();

			// menu con las distintas opciones
			switch (opcion) {

			// Inserta palabra
			case 1 -> {
				
				// pedimos la palabra en espanol
				System.out.println("Introduzca la palabra es espanol:");
				espanol = sc.nextLine();
				
				
				
				// pedimos la palabra en ingles
				System.out.println("Introduzca la traduccion:");
				ingles = sc.nextLine();
				
				// anadimos la palabra y la traduccion al diccionario
				diccionario.put(espanol, ingles);
				
				// espacio en blanco para separar
				System.out.println();
			}

			// Busca palabra
			case 2 -> {
				
				// pedimos la palabra que se quiere traducir
				System.out.println("Introduzca la palabra que quiere traducir:");
				espanolTraducir = sc.nextLine();
				
				// recogemos la traduccion y la mostramos
				traduccion = diccionario.get(espanolTraducir);
				
				if(traduccion == null) { // mostramos si la palabra no esta en el diccionario
					System.out.println("La palabra que quiere traducir no se encuentra en el diccionario");
					
				} else { // si la palabra se encuentra en el diccionario mostramos la traduccion
					System.out.println(traduccion);
				}
				
				// espacio en blanco para separar
				System.out.println();

			}

			// Termina el programa
			case 3 -> {
				fin = true;
			}
			default ->{
				System.err.println("Introduzca un valor valido");
			}
			}

		} while (!fin);

	}

}
