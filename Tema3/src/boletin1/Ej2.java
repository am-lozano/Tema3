package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla.
		 * Utiliza el mismo bucle tanto para solicitar los 5 números como para almacenarlos en la tabla. 
		 * A continuación, en un bucle distinto, mostrar por consola los números en el mismo orden en el que se han introducido.
		 */
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// variable para almacenar los numeros pedidos
		double num;
		
		// variable para la tabla
		double tabla[] = new double[5];
		
		// creamos el bucle para pedir los numeros al usuario y los almacenamos en la tabla (array)
		for (int i = 0; i < tabla.length; i++) {
			
			// pedimos el numero al usuario
			System.out.println("Introduzca un numero: ");
			num = sc.nextDouble();
			
			// asignamos los numeros introducidos a la tabla
			tabla[i] = num;
			
		}
		
		// creamos un bucle for-each para recorrer la tabla entera y la mostramos
		for (double valor : tabla) {
			
			// mostramos la tabla
			System.out.println(valor);
			
		}
		
		// cerramos el escaner
		sc.close();

	}

}
