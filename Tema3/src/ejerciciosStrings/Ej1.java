package ejerciciosStrings;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
		 * decir, la que contiene menos caracteres.
		 */
		
		// variables para almacenar las frases
		String frase1;
		String frase2;
		
		// variable para almacenar la comparacion
		int comparacion;
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// pedimos la primera frase
		System.out.println("Introduzca la primera frase:");
		frase1 = sc.next();
		
		// pedimos la segunda frase
		System.out.println("Introduzca la segunda frase:");
		frase2 = sc.next();
		
		// comparamos ambas cadenas
		comparacion = frase1.compareToIgnoreCase(frase2);
		
		// mostramos el resultado
		if (comparacion > 0) {
			System.out.println("La primera frase es mas larga que la segunda");
		} else if (comparacion < 0) {
			System.out.println("La segunda frase es mas larga que la segunda");
		} else {
			System.out.println("Las frases son iguales");
		}
		
		sc.close();
		
	}

}
