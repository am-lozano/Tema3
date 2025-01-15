package ejerciciosStrings;

public class Ej13 {

	public static void main(String[] args) {

		/*
		 * Un anagrama es una palabra, o frase, que resulta de la transposición de otra
		 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
		 * mora. Construir una función que recibe dos palabras por parámetro e indique
		 * si son anagramas una de otra.
		 * 
		 */

	}

	// funcion para saber si la palabra es un anagrama
	static boolean esAnagrama(String cad1, String cad2) {

		// funcion que devuelve verdadero o falso dependiendo de si la palabra es un
		// anagrama
		boolean anagrama = true;

		// variable para usar en el bucle mas adelante
		int i = 0;

		// variable para contar cuantas veces aparece cada letra
		int cont1 = 0;
		int cont2 = 0;

		// variable para almacenar cada letra
		char letra1;
		char letra2;

		// recorremos la palabra
		while (i < cad1.length() && !anagrama) {

			letra1 = cad1.charAt(i);
			letra2 = letra1;

			// recorremos la primera palabra
			for (int j = 0; j < cad1.length(); j++) {

				// sumamos cuantas veces aparece una letra en la palabra

			}

			// recorremos la segunda palabra
			for (int j = 0; j < cad1.length(); j++) {

				// sumamos cuantas veces aparece una letra en la palabra

			}
			
			/*
			 *  comprobamos si los contadores tienen el mismo valor
			 *  
			 *  en caso afirmativo, significara que tienen el mismo numero de dicha letra, lo cual es un buen indicativo de que la palabra sea un anagrama
			 *  en caso negativo, la palabra no puede ser un anagrama
			 */
			if (cont1 != cont2) {
				anagrama = false;
			}

			i++;
		}

		// devolvemos el resultado de si es un anagrama
		return anagrama;
	}

}
