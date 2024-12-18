package ejerciciosStrings;

import java.util.Scanner;

public class Ej6 {
	
	// creamos el escaner
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		/*
		 * Realizar una función que reciba una frase como parámetro de entrada y nos
		 * indique si es palíndroma, es decir, que la frase sea igual leyendo de
		 * izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
		 * espacios. Un ejemplo de frase palíndroma es: “Dabale arroz a la zorra el
		 * abad”. Las vocales con tilde hacen que un algoritmo tome una frase palíndroma
		 * como si no lo fuese. Por esto, supondremos que el usuario introduce la frase
		 * sin tildes.
		 * 
		 */
		
		// usar replace y trim para eliminar espacios
		
		// variable para almacenar la frase introducida
		String cad;
		
		// pedimos la frase
		System.out.println("Introduzca una frase:");
		cad = sc.nextLine();
		
		// eliminamos los espacios en blanco de la frase
		cad = cad.trim().replace(" ", "");
		
		// cerramos el escaner
		sc.close();
		
	}
	
	static boolean palindroma (String cad) {
		
		// variable para saber si la frase es palindroma
		boolean es = false;
		
		// variable para almacenar la frase pero en orden inverso
		String cadInversa = "";
		
		// recorremos la frase introducida y la vamos almacenando en la variable cadInversa
		for (int i = 0; i < cad.length(); i++) {
			
			// almacenamos los caracteres de la frase en "cadInversa"
			cadInversa += cad;
		}
		
		// recorremos la frase para saber si es palindroma
		for (int i = 0, j = 0; i < cad.length(); i++, j++) {
			
//			if (cad.charAt(i)) {
//				
//			}
		}
		
		// devolvemos si la frase es palindroma o no
		return es;
	}

}
