package boletin2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
		 * aleatorios entre 0 y 9. Luego ordena los valores del array y los mostrará por
		 * pantalla.
		 */
		
		// creamos el scaner
		Scanner sc = new Scanner(System.in);

		// pedimos los datos (tamano y valor)
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
