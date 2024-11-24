package boletin4bi;

import java.util.Scanner;

public class Ej3 {
	
	// creamos el escaner para saber las dimensiones de la tabla
	static Scanner sc = new Scanner (System.in);
	
	
	public static void main(String[] args) {

		/*
		 * Define una función que reciba una tabla bidimensional y devuelva un booleano
		 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
		 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
		 * matriz. Delfine un método main que llame a la función y muestre por pantalla
		 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
		 */
		
//		int[][] tabla = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] tabla = { { 1, 2,  1, 2 }, { 1, 2,  1, 2 }, { 1, 2,  1, 2 }, { 1, 2,  1, 2 } };
		
		// variable para saber las dimensiones de la tabla
		int dimensiones;
		
//		// pedimos el tamanyo de la tabla para saber si es simetrica
//		System.out.println("Introduzca el tamanyo de la tabla: ");
		
		System.out.println("Introduzca las dimensiones de la tabla:");
		dimensiones = sc.nextInt();
		
		// comprobamos el valor devuelto por el metodo "simetria" para saber si la tabla es simetrica
		System.out.println(simetria(tabla) == dimensiones * 2 ? "La tabla es simetrica" : "La tabla no es simetrica");		
		
	}
	
	// metodo para averiguar si la tabla es simetrica
	
	static int simetria (int[][] t) {
		
		int simetrica = 0;
		
		// leemos la tabla original y comprobamos si es simetrica -> ( A[i][j] = A[j][i] )
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				
				// comprobamos la simetria de la tabla
				if (t[i][j] == t[j][i]) {
					simetrica += 1;
				}
				
			}
		}
		
		return simetrica;
		
	}

	}
