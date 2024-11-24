package boletin4bi;

import java.util.Arrays;
import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
		 * debe devolver un array de dos posiciones que contenga el mínimo en la
		 * posición 0 y el máximo en la posición 1.
		 * 
		 * Define un método main que rellene un array de 6 filas por 10 columnas con 
		 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
		 * A continuación, debe llamar a la función con este array y mostrar por
		 * consola los valores mínimo y máximo de la tabla.
		 */
		
		// clase random para generar numeros aleatorios y rellenar la tabla
		Random rand = new Random();
		
		// variable para almacenar la tabla
		int[][] tabla = new int[6][10];
		
		// variable para generar numeros aleatorios comprendidos entre [0, 1000]
		int numRandom = rand.nextInt(0, 1001);
		
		// variable para almacenar la tabla con el valor minimo y maximo
		int[] minimoMaximo;
		
		// rellenamos la tabla con los numeros generados aleatoriamente
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				
				// asignamos los numeros generados a la tabla
				tabla[i][j] = numRandom;
				
				// volvemos a generar el numero aleatorio
				numRandom = rand.nextInt(0, 1001);
				
			}
		}
		
		minimoMaximo = minMax(tabla);
		
		// mostramos la tabla rellena
//		for (int i = 0; i < tabla.length; i++) {
//			for (int j = 0; j < tabla[i].length; j++) {
//				System.out.println(tabla[i][j] + " ");
//			}
//			System.out.println();
//		}
				
		System.out.println("El numero minimo y maximo de la tabla proporcionada son: " + Arrays.toString(minimoMaximo));

	}
	
	static int[] minMax (int t[][]) {
		
		// variable para almacenar la tabla con el numero menor y mayor de la tabla proporcionada
		int[] tablaNX = new int[2];
		
		// variable para almacenar el minimo
		int min = Integer.MAX_VALUE;
		
		// variable para almacenar el maximo
		int max = Integer.MIN_VALUE;
		
		// recorremos la tabla que le proporcionesmos
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				
				// si el valor de la tabla es menor que min, se le asigna a la variable min para almacenar el numero mas chico de la tabla
				if (t[i][j] < min)
					min = t[i][j];
				
				// si el valor de la tabla es mayor que max, se le asigna a la variable min para almacenar el numero mas grande de la tabla
				if (t[i][j] > max)
					max = t[i][j];
				
			}
		}
		
		// asignamos los valores minimos y maximos de la tabla proporcionada a la tabla resultante con longitud 2
		tablaNX[0] = min;
		tablaNX[1] = max;
		
		// devolvemos la tabla resultante
		return tablaNX;
		
	}

}
