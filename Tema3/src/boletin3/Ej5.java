package boletin3;

import java.util.Random;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
		 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
		 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de
		 * filas y columnas, igual que si de una hoja de cálculo se tratara. La suma
		 * total debe aparecer en la esquina inferior derecha. Un ejemplo de cómo deben
		 * mostrarse dichas sumas parciales sería:
		 */

		// clase random para generar numeros randoms
		Random rand = new Random();
		
		// variable para almacenar la tabla
		int tabla[][] = new int[4][5];
		
		// variable para hacer la suma de las filas o columnas
		int suma = 0;
		
		// variable para la suma de las filas y columnas
		int sumaTotal = 0;
		
		// bucles para asignar los numeros randoms a la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				
				tabla[i][j] = rand.nextInt(100, 1000);
				
			}
		}
		
		// bucle para recorrer la tabla por filas
		for (int i = 0; i < tabla.length; i++) {
			
			// inicializamos la variable suma a 0
			suma = 0;
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.print(tabla[i][j] + "\t");
				
				suma += tabla[i][j];
			}
			
			System.out.println(suma);
		}
		
		// bucle para recorrer la tabla por columnas
		for (int j = 0; j < tabla[0].length; j++) {
			
			// inicializamos la variable suma a 0
			suma = 0;
			
			for (int i = 0; i < tabla.length; i++) {
				
				suma += tabla[i][j];
				
			}
			
			sumaTotal += suma;
			
			System.out.print(suma + "\t");
		}

		System.out.println(sumaTotal);

	}

}
