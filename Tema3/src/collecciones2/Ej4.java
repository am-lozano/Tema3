package collecciones2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que cree una lista de nombres de personas vacía. A
		 * continuación, mostrará el siguiente menú. Atendiendo a la opción seleccionada
		 * por el usuario el programa debe realizar la operación concreta:
		 * 
		 * 1. Añadir nuevo nombre a la lista. 
		 * 2. Elimina un nombre específico. 
		 * 3. Ordena la lista alfabéticamente. 
		 * 4. Busca si un nombre específico está en la lista.
		 * 5. Salir.
		 */

		// lista para almacenar los nombres de personas
		LinkedList<String> nombres = new LinkedList<String>();

		// escaner para pedir datos al usuario
		Scanner sc = new Scanner(System.in);

		// variable para almacenar la opcion, elegida por el usuario, a realizar
		int opcion;
		
		// variable para almacenar los nombres introducidos por el usuario segun la opcion elegida
		String nombreMenu;

		do { // bucle para mostrar el menu con las opciones mientras no se desee salir
			
			// mostramos las opciones disponibles
			System.out.println("1. Añadir nuevo nombre a la lista. \n "
					+ "2. Elimina un nombre específico. \n "
					+ "3. Ordena la lista alfabéticamente. \n "
					+ "4. Busca si un nombre específico está en la lista. \n "
					+ "5. Salir.");
			
			// espacio en blanco para separar
			System.out.println();

			// pedimos la opcion que se quiere realizar
			System.out.println("Introduzca una opcion:");
			opcion = sc.nextInt();
			
			// vaciamos el bufer
			sc.nextLine();

			// switch con las distintas opciones a realizar segun el numero introducido
			switch (opcion) {

			case 1 -> { // Añadir nuevo nombre a la lista
				
				// pedimos el nombre para anadir
				System.out.println("Introduzca un nombre para anadir:");
				nombreMenu = sc.nextLine();
				
				// anadimos el nombre a la lista
				nombres.add(nombreMenu);
				
				// mostramos la lista con el nombre anadido
				System.out.println(nombres);
				
				// espacio en blanco para separar
				System.out.println();
				
			}
			case 2 -> { // Elimina un nombre específico
				
				// pedimos el nombre que se quiere eliminar
				System.out.println("Introduzca el nombre que se quiere eliminar:");
				nombreMenu = sc.nextLine();
					
				// mostramos si el nombre se ha borrado correctamente
				System.out.println(nombres.remove(nombreMenu) ? "Su nombre se ha eliminado correctamente" : "Nombre no encontrado");
				
				// mostramos la lista sin el nombre
				System.out.println(nombres);
				
				// espacio en blanco para separar
				System.out.println();
				
			}
			case 3 -> { // Ordena la lista alfabéticamente
				
				// ordenamos la lista
				Collections.sort(nombres);
				
				// mostramos la lista ordenada
				System.out.println(nombres);
				
				// espacio en blanco para separar
				System.out.println();
				
			}
			case 4 -> { // Busca si un nombre específico está en la lista
				
				// pedimos el nombre que se quiere eliminar
				System.out.println("Introduzca el nombre que desea buscar:");
				nombreMenu = sc.nextLine();
				
				// buscamos si el nombre esta contenido en la lista
				System.out.println(nombres.contains(nombres) ? "El nombre se encuentra en la lista" : "El nombre no se encuentra en la lista");
				
				// mostramos la lista
				System.out.println(nombres);
				
				// espacio en blanco para separar
				System.out.println();
				
			}
			}

		} while (opcion != 5);

	}

}
