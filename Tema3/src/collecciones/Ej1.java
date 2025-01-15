package collecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Crear una lista de números enteros positivos introducidos por consola hasta
		 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		 * por pantalla los índices de los elementos de valor par.
		 */

		// creamos el escaner para leer datos introducidos por consola
		Scanner sc = new Scanner(System.in);

		// variable para almacenar los numeros enteros introducidos por el usuario
		int numeros;

		// lista para almacenar los numeros introducidos
		ArrayList<Integer> enterosPositivos = new ArrayList();

		// pedimos los numeros para introducir en la lista
		System.out.println("Introduzca numeros para introducir en la lista:");
		numeros = sc.nextInt();

		while (numeros >= 0) { // bucle para introducir solo los numeros positivos en la lista

			// introducimos los numeros del usuario en la lista
			enterosPositivos.add(numeros);

			// volvemos a pedir un numero para introducir en la lista
			System.out.println("Introduzca numeros para introducir en la lista:");
			numeros = sc.nextInt();

		}

		// espacio en blanco entre frases
		System.out.println();

		// mostramos los indices de los numeros pares
		System.out.println("Los numeros pares de la lista son:");

		// recorremos la lista
		for (int valor : enterosPositivos) {

			// comprobamos si el numero es par
			if (valor % 2 == 0) {
				System.out.print(enterosPositivos.indexOf(valor) + " ");
			}
		}

		se puede hacer sin hacer una variable para contar el indice manualmente?

		// cerramos el escaner
		sc.close();

	}

}
