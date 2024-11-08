package boletin1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para calcular la suma de todos los números y,
		 * además, averiguar el máximo y mínimo y mostrarlos por pantalla.
		 * 
		 */

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// variable para almacenar los numeros pedidos
		int num;

		// variable para la tabla
		int tabla[] = new int[10];

		// variable para calcular la suma de los valores de la tabla
		int suma = 0;

		// variable para el numero minimo
		int min;

		// variable para el numero maximo
		int max;

		// creamos el bucle para pedir los numeros al usuario y los almacenamos en la
		// tabla (array)
		for (int i = 0; i < tabla.length; i++) {

			// pedimos el numero al usuario
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();

			// asignamos los numeros introducidos a la tabla
			tabla[i] = num;

		}

		// asignamos por defecto el numero maximo y minimo al primer valor de la tabla
		min = tabla[0];
		max = tabla[0];

		// recorremos la tabla y hacemos la suma de los valores
		for (int valor : tabla) {
			suma += valor;

			// recorremos la tabla y comprobamos los siguientes numeros
			if (valor < min) 
				min = valor;
			if (valor > max) 
				max = valor;
			
		}

		// mostramos la suma de la tabla
		System.out.println(suma);
		
		// mostramos el numero maximo y minimo
		System.out.println("Maximo: " + max + ", y el minimo: ");

		sc.close();

	}

}
