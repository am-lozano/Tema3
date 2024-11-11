package boletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
		 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
		 * (ordenada) con los 6 números de la combinación ganadora. La combinación
		 * ganadora debe establecerse en el momento de crear la tabla. El programa
		 * devolverá el número de aciertos.
		 * 
		 */

		// Crear un array para la apuesta (6 números aleatorios entre 1 y 49)
		int[] apuesta = new int[6];
		Random rand = new Random();

		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i] = rand.nextInt(49) + 1; // Números entre 1 y 49
		}

		// Crear un array para la combinación ganadora (establecerla manualmente)
		int[] combinacionGanadora = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los 6 números de la combinación ganadora (entre 1 y 49):");

		for (int i = 0; i < combinacionGanadora.length; i++) {
			combinacionGanadora[i] = sc.nextInt();
		}

		// Ordenar ambas combinaciones
		Arrays.sort(apuesta);
		Arrays.sort(combinacionGanadora);

		// Mostrar las combinaciones
		System.out.println("Apuesta: " + Arrays.toString(apuesta));
		System.out.println("Combinación ganadora: " + Arrays.toString(combinacionGanadora));

		// Contar los aciertos
		int aciertos = 0;
		for (int i = 0; i < apuesta.length; i++) {
			for (int j = 0; j < combinacionGanadora.length; j++) {
				if (apuesta[i] == combinacionGanadora[j]) {
					aciertos++;
				}
			}
		}

		// Mostrar el número de aciertos
		System.out.println("Número de aciertos: " + aciertos);

		sc.close();
	}
}