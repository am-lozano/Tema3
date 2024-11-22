package boletin4uni;

import java.util.Arrays;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
		 * t, la función devolverá una tabla vacía.
		 */

		// variable para la tabla
		int[] tabla = { 1, 2, 3, 4, 5 };

		// asignamos la funcion buscarTodos a una variable y le asignamos una tabla y un
		// valor para buscar dentro de la tabla
//		int busqueda = buscarTodos(tabla, 3);
//
//		// mostramos el resultado
//		System.out.println(busqueda);
		
		int[] a = buscarTodos(tabla, 5);
		
		System.out.println(Arrays.toString(a));

	}

	static int numVeces(int t[], int valor) {

		// variable para saber cuantas veces aparece el valor buscado
		int cont = 0;

		// bucle for-each para recorrer la tabla
		for (int contenido : t) {

			// si el valor buscado aparece en la tabla sumamos 1 al contador
			if (contenido == valor) {

				cont++;

			}
		}

		return cont;
	}

	static int[] buscarTodos(int t[], int valor) {
		
		int tamanyo = numVeces(t, valor);

		// variable para crear una tabla con el tamanyo
		int[] tabla = new int[tamanyo];

		return tabla;
	}
	
	
	
	
	
	
	
	

	/*
	 * static int[] buscarTodos (int t[], int valor) {
	 * 
	 * // variable para recorrer la tabla int busqueda = 0;
	 * 
	 * // variable boolean para saber si el valor ha sido encontrado boolean enc =
	 * false;
	 * 
	 * // bucle while para recorrer la tabla y buscar el valor while (busqueda <
	 * t.length && !enc) {
	 * 
	 * // si el valor se ha encontrado salimos del bucle if (valor == t[busqueda]) {
	 * 
	 * enc = true;
	 * 
	 * } else { // si no se encuentra se pasa al siguiente indice de la tabla
	 * 
	 * busqueda++; }
	 * 
	 * // si el valor no esta en la tabla devolvemos -1 para mostrar que no se ha
	 * encontrado en la tabla if (!enc)
	 * 
	 * busqueda = -1;
	 * 
	 * }
	 * 
	 * return busqueda;
	 * 
	 * }
	 */

}
