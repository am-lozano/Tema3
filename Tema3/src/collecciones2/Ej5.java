package collecciones2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación de gestión de series de TV que permita al usuario
		 * realizar las siguientes operaciones:
		 * 
		 * Agregar serie: El usuario ingresa el nombre de la serie y su valoración, y se
		 * agrega al sistema.
		 * 
		 * Buscar serie: El usuario ingresa el nombre de la serie que desea buscar, y el
		 * sistema muestra su valoración si existe.
		 * 
		 * Eliminar serie: El usuario ingresa el nombre de la serie que desea eliminar,
		 * y el sistema la elimina de la lista de series.
		 * 
		 * Salir: Termina la ejecución del programa.
		 * 
		 * El programa debe utilizar la estructura de datos adecuada para almacenar las
		 * series. Además, debe mostrar un menú de opciones y permitir al usuario
		 * realizar múltiples operaciones hasta que decida salir del programa.
		 * 
		 */

		// mapa para almacenar la serie con su correspondiente valoracion
		LinkedHashMap<String, String> seriesLista = new LinkedHashMap<>();

		// escaner para pedir datos al usuario
		Scanner sc = new Scanner(System.in);

		// variable para almacenar la opcion, elegida por el usuario, a realizar
		int opcion;

		// variable para almacenar los nombres introducidos por el usuario segun la
		// opcion elegida
		String serie;
		String valoracion;

		do { // bucle para mostrar el menu con las opciones mientras no se desee salir

			// mostramos las opciones disponibles
			System.out.println("1. Agregar serie. \n " + "2. Buscar serie. \n " + "3. Eliminar serie. \n " + "4. Salir.");

			// espacio en blanco para separar
			System.out.println();

			// pedimos la opcion que se quiere realizar
			System.out.println("Introduzca una opcion:");
			opcion = sc.nextInt();

			// vaciamos el bufer
			sc.nextLine();

			// switch con las distintas opciones a realizar segun el numero introducido
			switch (opcion) {

			case 1 -> { // Agregar serie

				// pedimos el nombre para anadir
				System.out.println("Introduzca la serie:");
				serie = sc.nextLine();

				// pedimos la valoracion
				System.out.println("Introduzca una valoracion");
				valoracion = sc.nextLine();

				// anadimos la serie con su respectiva valoracion
				seriesLista.put(serie, valoracion);
				
				// espacio en blanco para separar
				System.out.println();
				
				// mostramos el mapa con las series y valoraciones
				System.out.println(seriesLista);

				// espacio en blanco para separar
				System.out.println();

			}
			case 2 -> { // Buscar serie

				// pedimos el nombre que de la sere
				System.out.println("Introduzca la serie:");
				serie = sc.nextLine();

				// comprobamos si la serie existe en la lista
				if (seriesLista.get(serie) == null) {
					
					System.err.println("La serie no esta anadida");
					
				} else {
					
					// mostramos la valoracion de la serie buscada
					System.out.println("La serie " + serie + " tiene una valoracion de: " + seriesLista.get(serie));
					
				}
				
				
				// espacio en blanco para separar
				System.out.println();

			}
			case 3 -> { // Eliminar serie

				// pedimos la serie para eliminar
				System.out.println("Introdzca la serie que desea eliminar:");
				serie = sc.nextLine();
				
				// eliminamos la serie y su valoracion de la lista
				if (seriesLista.remove(serie) == null) { // la serie no esta en el mapa por lo que no se puede eliminar
					
					// mostramos que no se ha eliminado el elemento
					System.out.println("La serie no se encuentra en la lista");
					
				} else {
					
					// mostramos que se ha eliminado correctamente
					System.out.println("La serie se ha eliminado correctamente");
					
				}

				// espacio en blanco para separar
				System.out.println();
				
				// mostramos el mapa con las series y valoraciones
				System.out.println(seriesLista);

				// espacio en blanco para separar
				System.out.println();

			}
			}

		} while (opcion != 4);

	}

}
