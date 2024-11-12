package boletin2;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tipo entero e introduzca la siguiente
		 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
		 * introducir 10 diez veces el 10, y luego la muestre por pantalla. En esta
		 * ocasión has de utilizar Arrays.fill().
		 * 
		 */

		// creamos la tabla
		int[] tabla = new int[55];
		
		// variable para usar en el for mas adelante
		int inicio = 0;

		// rellenamos la tabla con la secuencia de números
		for (int i = 1; i <= 10; i++) {
			
			// rellenamos la tabla con los valores
			Arrays.fill(tabla, inicio, inicio + i, i);
			
			// volvemos a inicializar la variable inicio
			inicio += i;
		}

		// mostramos el resultado de la tabla
		System.out.println(Arrays.toString(tabla));
		
	}
}
