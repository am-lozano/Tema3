package boletin1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N.
		 */

		// creamos la clase random para generar los numeros aleatorios
		Random rand = new Random();

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// variable para los numeros generados
		int num;

		// variable para ir comprobando si los numeros son iguales
		int indice = 0;

		// valor que se quiere encontrar
		int valor;

		// variable para guardar la tabla
		int tabla[] = new int[100];

		for (int i = 0; i < tabla.length; i++) {

			// generamos el numero aleatorio
			num = rand.nextInt(1, 11);

			// asignamos los numeros generados a cada celda de la tabla
			tabla[i] = num;

		}

		// preguntamos el valor que se desea encontrar
		System.out.println("Introduzca el valor");
		valor = sc.nextInt();

		// revisamos la tabla y mientras no encontremos el numero y no terminemos la
		// tabla seguimos
		while (indice < tabla.length && valor != tabla[indice]) {

			indice++;
		}

		// si el indice al acabar es menor que la longitud de la tabla significa que se
		// ha encontrado el elemento
		if (indice < tabla.length)
			System.out.println("El valor " + valor + " se encuentra en la posicion " + indice);
		else // indice <= tabla -> no existe el elemento en la tabla
			System.out.println("El valor " + valor + " no se encuentra en la tabla");

		// cerramos el escaner
		sc.close();

	}

}
