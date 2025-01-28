package collecciones2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y
		 * luego la mezcle de forma aleatoria. Finalmente, muestra la lista original y
		 * la lista mezclada por pantalla.
		 */

		// creamos la lista para almacenar los numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// variable para usar en el bucle para anadir los numeros a la lista
		int i = 1;

		// anadimos los numeros a la lista
		while (i <= 10) {
			numeros.add(i);

			// incrementamos la variable i
			i++;
		}

		// mostramos la lista original
		System.out.println(numeros);

		// desordenamos la lista
		Collections.shuffle(numeros);

		// mostramos la lista desordenada
		System.out.println(numeros);
	}

}
