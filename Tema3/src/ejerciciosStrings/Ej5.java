package ejerciciosStrings;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
		 * completa separando las palabras introducidas con espacios en blanco. Terminar
		 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
		 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
		 * “fin” no aparecerá en la frase final.
		 */
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// variable para almacenar las palabras introducidas
		String palabra;
		
		// variable para ir anyadiendo las palabras introducidas
		String frase = "";
		
		// variable para terminar de pedir palabras para completar la frase
		String terminar = "FIN";
		
		// pedimos las palabras
		System.out.println("Introduzca una palabra para anyadir a la frase:");
		palabra = sc.nextLine();
		
		// bucle para anyadir las palabras introducidas
		while (palabra != terminar.toUpperCase()) {
			
			// anyadimos las palabras introducidas a la frase
			frase += " " + palabra;
			
			// volvemos a pedir una palabra
			System.out.println("Introduzca una palabra para anyadir a la frase:");
			palabra = sc.nextLine();
		}
		
		// devolvemos la frase final
		System.out.println(frase);
		
		// cerramos el escaner
		sc.close();
	}

}
