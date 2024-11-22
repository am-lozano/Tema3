package boletin4uni;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma
		 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
		 * qué posición lo encuentra; y en caso contrario, devolverá -1.
		 * 
		 */
		
		// variable para la tabla
		int[] tabla = { 1, 2, 3, 4, 5 };
		
		// como la funcion tiene varias variables se le asigna a una variable para utilizarla
		int busqueda = buscar(tabla, 3);
		
		// usamos la funcion para devolver el resultado
		System.out.println(busqueda);
		
	}

	static int buscar(int t[], int clave) {

		// variable para ir comprobando si los numeros son iguales
		int buscar = 0;
		
		clave = 2;
		
		// revisamos la tabla y mientras no encontremos el numero y no terminemos la
		// tabla seguimos
		while (buscar < t.length && clave != t[buscar]) {

			buscar++;
		}

		// si el buscar al acabar es menor que la longitud de la tabla significa que se
		// ha encontrado el elemento
		if (buscar < t.length)
			System.out.println("El valor " + clave + " se encuentra en la posicion " + buscar);
		else // buscar <= tabla -> no existe el elemento en la tabla
			System.out.println("El valor " + clave + " no se encuentra en la tabla");

		return buscar;
	}

}
