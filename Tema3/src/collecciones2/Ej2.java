package collecciones2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que genere 10 números enteros aleatorios distintos
		 * en el rango del 1 al 20 y los guarde en una implementación que no permita que
		 * se dupliquen números en el caso de que se repitan y que garantice un orden
		 * basado en inserción. Luego, muestra los números únicos generados por
		 * pantalla.
		 */

		// clase random para generar numeros aleatorios
		Random rand = new Random();

		// variable para almacenar los numeros aleatorios generados
		int random = rand.nextInt(1, 20);

		// conjunto para almacenar los numeros generados (no repetidos, orden de
		// insercion)
		LinkedHashSet<Integer> numerosAleatorios = new LinkedHashSet<Integer>();

		/*
		 * comprobamos que no se creen numeros repetidos, como los conjuntos no admiten
		 * elementos repetidos en caso de generarse varias veces el mismo elemento la
		 * segunda vez no se anadira, por lo que tendremos menos de 20 elementos, para
		 * solucionarlo controlamos el tamano del conjunto
		 */
		while (numerosAleatorios.size() < 10) {

			// anadimos el numero aleatorio generado al conjunto
			numerosAleatorios.add(rand.nextInt(1, 21));
		}

		// mostramos el conjunto
		System.out.println(numerosAleatorios);

//
// 		// almacenamos los numeros aleatorios en el conjunto
// 		for (int i = 0; i < 10; i++) {
//
//
// 		if (numerosAleatorios.contains(random)) { // en caso de que el numero sea repetido generamos otro numero
//
// 		// generamos otro numero aleatorio
// 		random = rand.nextInt(1, 20);
//
// 		}else { // en caso contrario lo anadimos
//
// 		// anadimos el numero aleatorio al conjunto
// 		numerosAleatorios.add(random);
// 		}
//
// 		System.out.println(random);
//
// 		// generamos un numero aleatorio entre 1 y 20
// 		random = rand.nextInt(1, 20);
// 		}
//
// 		// mostramos el conjunto
// 		System.out.println(numerosAleatorios);

	}

}
