package boletin4bi;

import java.util.Scanner;

public class Ej3 {
	
	// creamos el escaner para saber las dimensiones de la tabla
//	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		/*
		 * Define una función que reciba una tabla bidimensional y devuelva un booleano
		 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
		 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
		 * matriz. Delfine un método main que llame a la función y muestre por pantalla
		 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
		 */

//		int[][] tabla = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		int[][] tabla = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		int[][] tabla = { { 1, 2, 1, 2 }, { 1, 2, 1, 2 }, { 1, 2, 1, 2 }, { 1, 2, 1, 2 } };

//		System.out.println("Introduzca las dimensiones de la tabla:");
//		dimensiones = sc.nextInt();
		
		System.out.println("Su tabla es: ");
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();

		// comprobamos el valor devuelto por el metodo "simetria" para saber si la tabla
		// es simetrica
		System.out.println(simetria(tabla) ? "Su tabla es simetrica" : "Su tabla no es simetrica");
		
		// cerramos el escaner
//		sc.close();

	}

	// metodo para averiguar si la tabla es simetrica

	static boolean simetria(int[][] t) {
		
		return simetrica;
		
		/*
		// variables para almacenar los valores por la derecha y por la izquierda de la
		// matriz
		int inicio;
		int ultimo;
		
		// variable para saber el numero de filas de la matriz
		int filas = t.length;
		
		boolean simetrica = true;

		// leemos la tabla original y comprobamos si es simetrica -> ( A[i][j] = A[j][i]
		// )

		// leemos la matriz por columnas en ambas direcciones (de inicio a fin y de fin
		// a inicio simultaneamente) y comparamos ambos valores para saber si son
		// iguales

		for (int j = 0; j < t[0].length; j++) {
			for (int i = 0, k = filas - 1; i <= k; i++, k--) {
				
				/* almacenamos los valores por la izquierda y por la derecha de la siguiente forma ->
				 * 
				 * matriz: (1 2 3 4)
				 * 		   (1 2 1 2)
				 * 
				 * inicio = 1; ultima = 4;
				 * inicio = 2; ultima = 3;
				 * 
				 * inicio = 1; ultima = 4;
				 * inicio = 2; ultima = 3;
				 * 
				 * de esta forma vamos recorriendo la tabla por columnas en ambos sentidos a la vez y comprobando dichos valores para saber si es simetrica
				 */
//				inicio = t[i][j];
//				ultimo = t[k][j];
//				
//				if (inicio != ultimo)
//					simetrica = false;
//
//			}
//		}

//		for (int i = 0; i < t.length; i++) {
//			for (int j = 0; j < t[i].length; j++) {
//				
//				// comprobamos la simetria de la tabla
//				if (t[i][j] == t[j][i]) {
//					simetrica += 1;
//				}
//				
//			}
//		}



	}

}
