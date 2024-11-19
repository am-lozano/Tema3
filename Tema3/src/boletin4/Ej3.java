package boletin4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos entre 2 hasta fin
		 * inclusive.
		 * 
		 */
		
		// variable para la longitud
		int longitud;
		
		// variable para el fin
		int fin;
		
	}
	
	static int[] rellenaPares(int longitud, int fin) {
		int[] rellenaPares = {2};
		
		int num;
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		do {
			try {
				
				System.out.println("Introduzca un numero positivo");
				num = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un numero positivo");
			} finally {
				num = sc.nextInt();
			}
			
		} while (num < 0);
		
		return rellenaPares;
	}

}
