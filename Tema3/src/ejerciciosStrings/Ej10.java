package ejerciciosStrings;

import java.util.Scanner;

public class Ej10 {

	// creamos el escaner para leer datos por consola
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Disponemos de la siguiente relación de letras:
		 * 
		 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
		 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
		 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
		 * minúsculas, mostrando siempre la codificación en minúsculas. Un ejemplo: la
		 * palabra «PaquiTo» se codifica como «matqvko». Se pide realizar un programa
		 * codificador, en el que se implemente la función: char codifica(char
		 * conjunto1[],char conjunto2[], char c) que devuelve el carácter c codificado
		 * según los conjuntos 1 y 2 que se le pasan.
		 * 
		 */

		// conjunto de letras 1
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// conjunto de letras 2
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// variable para almacenar la palabra para codificar
		String cad;

		// pedimos la palabra que se quiere codificar
		System.out.println("Introduzca una palabra para codificar:");
		cad = sc.nextLine();

		// pasamos la palabra introducida a una tabla char
		cad.toCharArray();

		// recorremos la palabra
		for (int i = 0; i < cad.length(); i++) {

			/*
			 * recorremos el conjunto 1 para saber si la cada palabra esta en el conjunto 1
			 * 
			 * en caso afirmativo, la sustituimos por su correspondiente en el conjunto 2 
			 * en caso negativo pasamaos a la siguiente letra de la palabra
			 */
			for (int j = 0; j < conjunto1.length; j++) {
				if (cad[i] == conjunto1[j]) {
					
					// remplazamos la letra
					cad = cad.replace(cad[i], conjunto1[j]);
				}
			}
		}

		// cerramos el escaner
		sc.close();
	}

	// funcion para codificar cada letra de la palabra introducida
	static char codifica(char conjunto1[], char conjunto2[], char c) {

		char cambiado;

		return cambiado;
	}

}
