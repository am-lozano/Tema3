package boletin3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida las dimensiones de una tabla bidimensional al
		 * usuario (número de filas y número de columnas). A continuación, crea dicha
		 * tabla bidimensional y rellénala de la siguiente forma: el elemento de la
		 * posición [i][j] debe contener el valor 10 * i + j. A continuación, muestra la
		 * tabla por consola.
		 */
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// variable para almacenar la tabla
		int[][] tabla;
		
		// variable para las filas
		int fila;
		
		// variable para las columnas
		int col;
		
		// pedimos el numero de filas y columnas
		System.out.println("Introduzca el numero de filas:");
		fila = sc.nextInt();
		
		System.out.println("Introduzca el numero de columnas:");
		col = sc.nextInt();
		
		// creamos la tabla con los valores introducidos
		tabla = new int[fila][col];
		
		// mostramos la tabla
		for(int i = 0; i < tabla.length; i++) {
			
			for(int j = 0; j < tabla[i].length; j++) {
				
				tabla[i][j] = 10 * i + j;
				
				System.out.print(tabla[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		// cerramos el escaner
		sc.close();
		
	}

}
