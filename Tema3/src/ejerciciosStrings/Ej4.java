package ejerciciosStrings;

import java.util.Scanner;

public class Ej4 {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		/*
		 * Diseñar una función a la que se le pase una cadena de caracteres y la
		 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
		 * Recuerda probar la función en un main.
		 */
		
		// variable para almacenar la frase
		String frase;
		
		// variable para almacenar la frase inversa
		String fraseInversa;
		
		// pedimos la frase
		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		
		// una vez escrita la frase inicializamos la variable para la frase inversa
		fraseInversa = inversa(frase);
		
		// devolvemos la frase inversa
		System.out.println("La frase original es: " + frase);
		System.out.println("La frase inversa es: " + fraseInversa);

		
	}
	
	// funcion para devolver la cadena inversa
	static String inversa (String cadena) {
		
		// variable para almacenar la cadena inversa
		String cadInversa = "";
		
		// bucle para recorrer la cadena introducida
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadInversa += cadena.charAt(i);
		}
		
		// devolvemos la cadena pero invertida
		return cadInversa;
	}

}
