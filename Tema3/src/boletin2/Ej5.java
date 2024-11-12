package boletin2;

import java.util.Arrays;
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

		// clase random para generar numeros aleatorios
		Random rand = new Random();

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// creamos la tabla
		int[] tabla = new int[1000];

		// variable para los numeros aleatorios
		int num = rand.nextInt(1, 100);

		// variable para contar cuantas veces aparece el numbero buscando
		int contador = 0;

		// variable para el valor buscado en la tabla
		int busqueda;

		// rellenamos la tabla con valores aleatorios
		for (int i = 0; i < tabla.length; i++) {

			// asignamos el valor aleatorio a la tabla
			tabla[i] = num;

			// volvemos a generar un numero aleatorio para asignar a la tabla
			num = rand.nextInt(1, 100);
		}

		// preguntamos el valor aleatorio que se quiere buscar
		System.out.println("Introduzca un numero entre 0 y 99:");
		busqueda = sc.nextInt();

		// revisamos la tabla y si el valor buscado es igual sumamos 1 al contador
		for (int i : tabla) {

			if (busqueda == tabla[i])
				contador++;

		}

		System.out.println("El valor: " + busqueda + " aparece: " + contador + " veces");

		// cerramos el escaner
		sc.close();

	}

}
