package boletin2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
		 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
		 * Luego muestra el array por pantalla.
		 */

		Scanner sc = new Scanner(System.in);

		// Pedir al usuario el tamaño y valor
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = sc.nextInt();

		System.out.print("Introduce el valor para llenar el array: ");
		int valor = sc.nextInt();

		// Crear el array y llenarlo con el valor dado
		int[] array = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			array[i] = valor;
		}

		// Mostrar el array
		System.out.println("Array resultante:");
		for (int i = 0; i < tamaño; i++) {
			System.out.print(array[i] + " ");
		}

		// cerramos el escaner
		sc.close();
		
	}
}
