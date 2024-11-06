package boletin1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// variable para almacenar los numeros pedidos
		int num;

		// variable para la tabla
		int tabla[] = new int[8];


		// creamos el bucle para pedir los numeros al usuario y los almacenamos en la
		// tabla (array)
		for (int i = 0; i < tabla.length; i++) {

			// pedimos el numero al usuario
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();

			// asignamos los numeros introducidos a la tabla
			tabla[i] = num;

		}

		// recorremos la tabla y hacemos la suma de los valores
		for (int valor : tabla) {
			
			// comprobamos si los numeros son par o impar y lo mostramos
			if (valor % 2 == 0)
				System.out.println(valor + " par");
			else 
				System.out.println(valor + " impar");
			
//			valor % 2 == 0 ? valor + " par" : valor + " impar";
				
		}
		
		// cerramos el escaner
		sc.close();

	}

}
