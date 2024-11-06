package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea 10 números por teclado, los almacene en una
		 * tabla, y que luego los muestre en orden inverso, es decir, el primero que se
		 * introduce es el último en mostrarse.
		 */

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// variable para almacenar los numeros pedidos
		int num;

		// variable para la tabla
		int tabla[] = new int[10];

		// creamos el bucle para pedir los numeros al usuario y los almacenamos en la
		// tabla (array)
		for (int i = tabla.length - 1; i >= 0; i--) {

			// pedimos el numero al usuario
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();

			// asignamos los numeros introducidos a la tabla
			tabla[i] = num;

		}
		
		System.out.println(Arrays.toString(tabla));

		// cerramos el escaner
		sc.close();

	}

}
