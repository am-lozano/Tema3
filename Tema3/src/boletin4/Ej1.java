package boletin4;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
		 * la suma de todos los valores almacenados en la tabla. Prueba el
		 * comportamiento de la función en un método main.
		 */
		
		// variable para almacenar la tabla
		int[] tabla;
		
		System.out.println(suma(1));
		
	}
	
	static int suma (int num) {
		
		int suma = 0;
		
		int[] tabla = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}
		
		return suma;
		
	}

}
