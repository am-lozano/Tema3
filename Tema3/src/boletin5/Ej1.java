package boletin5;

import java.util.Scanner;

public class Ej1 {
	
	// metodo escaner para saber que num se quiere buscar en la tabla
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba como parámetro una tabla bidimensional de
		 * enteros y un valor. Debe devolver un booleano indicando si dicho valor se
		 * encuentra en la tabla o no.
		 */
		
		// variable para almacenar la tabla
		int[][] tabla = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		// variable para almacenar el valor de busqueda en la tabla
		int num;
		
		// variable para almacenar el valor de salida del metodo encontrao
		boolean busqueda;
		
		// pedimos el num que se quiere buscar
		System.out.println("Introduzca el numero que desea buscar en la tabla: ");
		num = sc.nextInt();
		
		
		// asignamos los valores a la variable busqueda para utilizarla posteriormente
		busqueda = encontrado(tabla, num);
		
		// mostramos si se ha encontrado o no el numero
		System.out.println(busqueda ? "El numero " + num + " se encuentra en la tabla" : "El numero " + num + " no se encuentra en la tabla");
		
		// cerramos el escaner
		sc.close();
	}

	static boolean encontrado(int[][] t, int num) {

		// variable boolean para saber si el valor se encuentra en la tabla
		boolean enc = false;
		
		// variables para utilizar en el bucle while para leer la tabla
		int i = 0;
		int j = 0;
		
		// recorremos la tabla
		while (i < t.length && !enc) {
			while (j < t[0].length) {
				
				if (num == t[i][j])
					enc = true;
				
				// sumamos 1 a la j
				j++;
			}
			
			// sumamos 1 a la i
			i++;
			
			// inicializamos la variable j a = 0 para continuar el bucle
			j = 0;
		}

		

		return enc;
	}

}
