package boletin3;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
		 * fila). Muestra la tabla por pantalla.
		 */
		
		// creamos la tabla
		int[][] tabla = new int [10] [10];
		
		// variable para los valores de cada celda
		int celda;
		
		// variable para el multiplo del primer valor
		int mul = 0;
		
		// mostramos la tabla
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
				
				mul++;
				
				celda = (j + 1) * mul;
				
				tabla [i] [j] = celda;
				
			}
			System.out.println();
		}

	}

}
