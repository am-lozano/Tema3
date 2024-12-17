package ejerciciosStrings;

import java.util.Scanner;

public class Ej3 {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		/*
		 * Diseña una función que recibe una frase como parámetro y devuelva cuántos
		 * espacios en blanco tiene. Recuerda probar la función en un main.
		 * 
		 */
		
		// variable para almacenar la cadena introducida
		String cadena;
		
		// variable para almacenar el resultado de la funcion
		int espacios;
		
		// pedimos la cadena
		System.out.println("Introduzca la cadena:");
		cadena = sc.nextLine();
		
		// inicializamos la variable espacios
		espacios = espaciosVacios(cadena);
		
		// devolvemos el numero de espacios en blanco
		System.out.println("Su cadena tiene " + espacios + " espacios en blanco");
		
		// cerramos el escaner
		sc.close();

	}
	
	static int espaciosVacios (String cadena) {
		
		// variable para contar el numero de espacios en blanco
		int cont = 0;
		
		// recorremos la cadena para saber cuantos espacios en blanco tiene
		for (int i = 0; i < cadena.length(); i++) {
			
			// cada vez que encuentre un espacio en blanco se suma 1 al contador
			if (cadena.charAt(i) == ' ') {
				cont++;
			}
		}
		
		// devolvemos el numero de espacios en blanco
		return cont;
	}

}
