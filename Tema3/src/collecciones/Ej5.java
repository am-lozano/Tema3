package collecciones;

import java.util.LinkedList;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
		 * que se insertarán en una colección, de forma que se conserve el orden de
		 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
		 * pantalla.
		 */
		
		// variable para almacenar los nombres introducidos
		String cad;
		
		// escaner para pedri los nombres por consola
		Scanner sc = new Scanner (System.in);
		
		// lista para almacenar los nombres introducidos
		LinkedList<String> nombres = new LinkedList<String>();
		
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
