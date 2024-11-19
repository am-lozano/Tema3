package boletin4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma
		 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
		 * qué posición lo encuentra; y en caso contrario, devolverá -1.
		 * 
		 */

		int[] tabla = { 1, 2, 3, 4, 5 };

		System.out.println(buscar());

	}

	static int buscar(int t[], int clave) {

		// variable para ir comprobando si los numeros son iguales
		int indice = 0;

		// valor que se quiere encontrar
		int valor = 15;

		// revisamos la tabla y mientras no encontremos el numero y no terminemos la
		// tabla seguimos
		while (indice < t.length && valor != t[indice]) {

			indice++;
		}

		// si el indice al acabar es menor que la longitud de la tabla significa que se
		// ha encontrado el elemento
		if (indice < t.length)
			System.out.println("El valor " + valor + " se encuentra en la posicion " + indice);
		else // indice <= tabla -> no existe el elemento en la tabla
			System.out.println("El valor " + valor + " no se encuentra en la tabla");

		return indice;
	}

}
