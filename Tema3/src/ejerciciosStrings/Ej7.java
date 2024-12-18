package ejerciciosStrings;

import java.util.Scanner;

public class Ej7 {

	// creamos el escaenr
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
		 * devolver cuántas veces aparece la palabra en la frase.
		 */

		// variable para almacenar la frase introducida por el usuario
		String cadena;

		// variable para almacenar la palabra para buscar en la frase, ambas
		// introducidas por el usuario
		String palabra;

		// variable para almacenar el resultado de la funcion con el numero de veces que
		// aparece la palabra introducida en la frase
		int contador;

		// pedimos la frase
		System.out.println("Introduzca una frase:");
		cadena = sc.nextLine();

		// pedimos la palabra para buscar
		System.out.println("Introduzca una palabra para contar cuantas veces aparece en la frase anterior:");
		palabra = sc.nextLine();

		// una vez conocidas la frase y la palabra para buscar podemos inicializar la
		// variable "contador" con la funcion para saber cuantas veces aparece la
		// palabra en la frase, ademas eliminamos los espacios en blanco iniciales y
		// finales de la frase en caso de tener para evitar errores
		contador = numVeces(cadena.trim(), palabra);

		// espacio en blanco para separar
		System.out.println();

		// mostramos cuantas veces aparece la palabra en la frase
		System.out.println("La palabra: " + palabra + " aparece: " + contador + " veces en la frase");

		// cerramos el escaner
		sc.close();

	}

	static int numVeces(String cad, String palabra) {

		// variable para contar las veces que la palabra aparece en la frase
		int cont = 0;

		// variable auxiliar para ir almacenando las palabras de la cadena
		String aux = "";

		// bucle para recorrer la cadena introducida por el usuario
		for (int i = 0; i < cad.length(); i++) {

			// vamos anyadiendo los caracteres de la cadena a la variable auxiliar
			aux += cad.charAt(i);

			// comprobamos si cada palabra de la frase es igual a la palabra introducida
			// para buscar
			if (palabra.equals(aux)) {
				cont++;

			}

			// si encontramos un espacio en blanco o tabulaciones "reiniciamos" la variable auxiliar para
			// que tenga mas de una palabra
			if (cad.charAt(i) == ' ' || cad.charAt(i) == '	') {
				aux = "";
			}
		}

		// devolvemos el numero de veces que la palabra aparece en la frase
		return cont;
	}

}
