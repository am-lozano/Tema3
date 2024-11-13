package boletin3;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
		 * asigna los valores según la siguiente tabla. Muestra el contenido de todos
		 * los elementos del array dispuestos en forma de tabla como se muestra en la
		 * figura.
		 */

		// variable para el array bidimensional (matriz de 3x6)
		int[][] tabla = new int[3][6];

		// asignamos los valores de la tabla
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;

		// mostramos la tabla con las notas
		System.out.println(Arrays.toString(tabla[0]));
		System.out.println(Arrays.toString(tabla[1]));
		System.out.println(Arrays.toString(tabla[2]));

//		muestra solo ese valor
//		System.out.println(tabla[2][2]);
		
	}

}
