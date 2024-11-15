package boletin3;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
		 * fila). Muestra la tabla por pantalla.
		 */
		
		// creamos la tabla
		int[][] tabla = new int [10] [10];
		
		// mostramos la tabla
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla[i].length; j++) {
				
				tabla[i][j] = (i + 1) * (j + 1);
				
				System.out.print(tabla[i][j] + "\t");
				
			}
			
			System.out.println();
			
		}
		
		
	}

}
