package boletin2;

import java.util.Arrays;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tipo entero e introduzca la siguiente
		 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
		 * introducir 10 diez veces el 10, y luego la muestre por pantalla. En esta
		 * ocasión has de utilizar Arrays.fill().
		 * 
		 */

		// Crear el array con el tamaño adecuado (sumatoria de 1+2+...+10 = 55)
		int[] array = new int[55];
		int index = 0;

		// Rellenar el array con la secuencia de números
		for (int i = 1; i <= 10; i++) {
			// Llenar el array con el número 'i', 'i' veces
			Arrays.fill(array, index, index + i, i);
			index += i;
		}

		// Mostrar el array completo
		System.out.println("Array resultante: " + Arrays.toString(array));
	}
}
