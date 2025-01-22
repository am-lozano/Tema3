package collecciones;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
		 * el orden alfabético.
		 */

		// variable para almacenar los nombres introducidos
		String cad;

		// escaner para pedri los nombres por consola
		Scanner sc = new Scanner(System.in);

		// lista para almacenar los nombres introducidos por orden alfabetico
		TreeSet<String> nombres = new TreeSet<String>();

		// pedimos el nombre para anadir a la lista
		System.out.println("Introduzca un nombre:");
		cad = sc.nextLine();

		while (!cad.equalsIgnoreCase("fin")) { // bucle para introducir nombres hasta introducir la palabra clave

			// anadimos el nombre a la lista
			nombres.add(cad);

			// volvemos a pedir un nombre para almacenar
			System.out.println("Introduzca un nombre:");
			cad = sc.nextLine();
		}

		// mostramos la lista
		System.out.println(nombres);

		// cerramos el escaner
		sc.close();

	}

}
