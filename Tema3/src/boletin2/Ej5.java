package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
		 * enteros aleatorios entre 0 y 99. Luego pedirá por teclado un valor y se
		 * mostrará por pantalla si ese valor existe en el array, además de cuántas
		 * veces.
		 * 
		 */

		// Crear el array de tamaño 1000
		int[] array = new int[1000];
		Random rand = new Random();

		// Rellenar el array con números aleatorios entre 0 y 99
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100); // Valor aleatorio entre 0 y 99
		}

		// Solicitar al usuario un número a buscar
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entre 0 y 99 para buscar: ");
		int numBuscado = sc.nextInt();

		// Contar cuántas veces aparece el número en el array
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numBuscado) {
				contador++;
			}
		}

		// Mostrar si el número existe y cuántas veces
		if (contador > 0) {
			System.out.println("El número " + numBuscado + " existe en el array y aparece " + contador + " veces.");
		} else {
			System.out.println("El número " + numBuscado + " no existe en el array.");
		}

		sc.close();
	}

}
