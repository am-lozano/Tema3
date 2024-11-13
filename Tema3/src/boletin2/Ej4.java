package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
		 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
		 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
		 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
		 * más alta a la más baja).
		 */

		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// variable para almacenar las puntuaciones
		int[] puntuacione = new int[8];

		for (int i = 0; i < 8; i++) {
			
			// pedimos la puntuacion
			System.out.print("Jugador " + (i + 1) + ": ");
			puntuacione[i] = sc.nextInt();
		}

		// ordenamos la tabla de menor a mayor
		Arrays.sort(puntuacione);

		
		System.out.println("El orden de puntuaciones queda:");
		System.out.println();
		
		for (int i = 7; i >= 0; i--) { // mostramos las puntuaciones de mayor a menor
			System.out.println("Jugador " + (i + 1) + ": " + puntuacione[i]);
		}

		// cerramos el escaner
		sc.close();
	}
}