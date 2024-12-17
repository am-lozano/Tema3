package ejerciciosStrings;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {

		/*
		 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
		 * imprimir tanto la palabra como el número de caracteres de la misma.
		 */
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// variable para almacenar la frase
		String cadena;
		
		// variable para almacenar la palabra actual que se este comprobando
		String actPalabra;
		
		// variable para almacenar la ultima palabra
		String ultPalabra;
		
		// pedimos la frase
		System.out.println("Introduzca una frase:");
		cadena = sc.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			
		}
		
		// cerramos el escaner
		sc.close();

	}

}
