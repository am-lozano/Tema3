package boletin2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
		 * primeros en un array y los 10 últimos en otro array. Por último, comparará
		 * ambos arrays y le dirá al usuario si son iguales o no.
		 */
		
		// creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// variables para los arrays
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		// variable para comprobar si las tablas son iguales
		boolean iguales = true;
		
		// pedimos los 10 primeros valores
		System.out.println("Introduzca los primeros 10 valores:");
		for (int i = 0; i < 10; i++) {
			array1[i] = sc.nextInt();
		}

		// pedimos los 10 valores siguientes
		System.out.println("Introduzca los siguientes 10 valores:");
		for (int i = 0; i < 10; i++) {
			array2[i] = sc.nextInt();
		}

		// comparamos las tablas
		for (int i = 0; i < 10; i++) {
			if (array1[i] != array2[i]) {
				iguales = false;
				break;
			}
		}

		// Mostrar resultado
		if (iguales) {
			System.out.println("Los arrays son iguales.");
		} else {
			System.out.println("Los arrays NO son iguales.");
		}

		// cerramos el escaner
		sc.close();
	}
}
