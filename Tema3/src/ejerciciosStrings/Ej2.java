package ejerciciosStrings;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
		 * siguiente: el primer jugador introduce la contraseña; a continuación, el
		 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
		 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
		 * contraseña.
		 * 
		 */

		// variables para almacenar las frases
		String frase1;
		String frase2;

		// variable para almacenar la comparacion
		int comparacion;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos la primera frase
		System.out.println("Introduzca la contrasenya:");
		frase1 = sc.next();

		// pedimos la segunda frase
		System.out.println("Introduzca su intento:");
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
