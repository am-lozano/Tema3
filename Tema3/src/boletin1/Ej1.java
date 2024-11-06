package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100.
		 */

		// creamos la clase random para generar los numeros aleatorios
		Random rand = new Random();

		// variable para los numeros generados
		int num;

		// variable para guardar la tabla
		int tabla[] = new int[10];

		for (int i = 0; i < tabla.length; i++) {

			// generamos el numero aleatorio
			num = rand.nextInt(1, 101);
			
			// asignamos los numeros generados a cada celda de la tabla
			tabla[i] = num;

		}

		System.out.println(Arrays.toString(tabla));

	}

}
