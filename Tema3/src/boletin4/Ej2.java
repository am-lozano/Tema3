package boletin4;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
		 * contenido en la tabla t.
		 */
		
		// variable para la tabla de enteros
		int[] tabla = {1, 2, 45, 6, 3, 66, 5};
		
		// numero maximo de la tabla
		System.out.println(maximo(tabla));

	}

	static int maximo (int t[]) {
		
		// variable para el numero maximo de la tabla
		int max = Integer.MIN_VALUE;
		
		// recorremos la tabla con un for-each
		for (int valor : t) {
			if (valor >= max) {
				max = valor;
			}
		}
		
		// devolvemos el numero maximo
		return max;
		
	}
	
}
