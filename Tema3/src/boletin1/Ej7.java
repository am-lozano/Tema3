package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter.
		 * 
		 */
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// variable para almacenar la tabla
		int[] mes = new int[12];
		
		// variable para pedir la temperatura
		int temp;
		
		
		// bucle para preguntar al usuario
		for (int i = 0; i < mes.length; i++) {
			
			// pedimos los valores de la temperatura por mes
			System.out.println("Introduzca la temperatura media del mes " + (i + 1) + ":");
			temp = sc.nextInt();
			
			// asignamos los valores introducidos a la tabla
			mes[i] = temp;
			}
		
		System.out.println(Arrays.toString(mes));
		
		for (int valor : mes) {
			
			for (int i = 0; i < valor; i++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		// cerramos el escaner
		sc.close();
		
	}

}
