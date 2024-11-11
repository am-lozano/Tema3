package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] puntuaciones = new int[8];

		// Pedir las puntuaciones de los jugadores
		System.out.println("Introduce las puntuaciones de los 8 jugadores (entre 1000 y 2800):");
		for (int i = 0; i < 8; i++) {
			System.out.print("Jugador " + (i + 1) + ": ");
			puntuaciones[i] = sc.nextInt();
		}

		// Ordenar las puntuaciones en orden descendente
		Arrays.sort(puntuaciones);

		// Mostrar las puntuaciones ordenadas (de mayor a menor)
		System.out.println("Ranking de puntuaciones (de mayor a menor):");
		for (int i = 7; i >= 0; i--) {
			System.out.println("Jugador " + (i + 1) + ": " + puntuaciones[i]);
		}

		// cerramos el escaner
		sc.close();
	}
}