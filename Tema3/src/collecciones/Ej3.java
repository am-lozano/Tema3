package collecciones;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores
		 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		 * ordenada. Pinta la colección por consola una vez rellena.
		 */
		
		Random rand = new Random();
		
		// variable para almacenar el numero aleatorio generado
		int aleatorio;
		
		// coleccion para almacenar los numeros
		LinkedList<Integer> listaEnteros = new LinkedList<Integer>();
		
		// anadimos 30 numeros aleatorios a la coleccion
		for (int i = 0; i < 30; i++) {
			
			// generamos el numero aleatorio
			aleatorio = rand.nextInt(1, 11);
			
			// anadimos el numero a la coleccion
			listaEnteros.add(aleatorio);
		}
		
		// mostramos la coleccion original
		System.out.println("Su lista original es:");
		System.out.println(listaEnteros);
		
		// ordenamos la coleccion
		Collections.sort(listaEnteros);
		
		// mostramos la lista ordenada
		System.out.println("La lista ordenada es:");
		System.out.println(listaEnteros);
	}

}
