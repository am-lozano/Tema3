package boletin4bi;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba una tabla bidimensional y devuelva en otro
		 * array distinto su transposición:
		 * 
		 * Define un método main que llame a esta función pasándole una tabla
		 * bidimensional y muestre por pantalla el resultado.
		 * 
		 */

		// variable para almacenar la matriz a la que queremos hacerle la traspuesta
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// variable para almacenar la matriz traspuesta
		int[][] mTraspuesta = matrizTraspuesta(matriz);

		System.out.println("La matriz original era:");
		System.out.println();

		// mostramos la matriz original
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println();

		System.out.println("La matriz traspuesta es:");
		System.out.println();

		// mostramo la matriz traspuesta
		for (int i = 0; i < mTraspuesta.length; i++) {
			for (int j = 0; j < mTraspuesta[i].length; j++) {

				System.out.print(mTraspuesta[i][j] + "\t");
			}

			System.out.println();
		}

	}

	// metodo para hacer la matriz traspuesta
	static int[][] matrizTraspuesta(int[][] t) {

		// variable para almacenar la matriz traspuesta
		int[][] traspuesta = new int[t.length][t[0].length];

		// leemos la matriz original por columnas para asi mostrar la matriz traspuesta
		for (int j = 0; j < t[0].length; j++) {
			for (int i = 0; i < t[j].length; i++) {

				traspuesta[i][j] = t[j][i];

			}
		}
		
		

		return traspuesta;

	}

}
