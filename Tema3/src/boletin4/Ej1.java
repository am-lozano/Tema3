package boletin4;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
		 * la suma de todos los valores almacenados en la tabla. Prueba el
		 * comportamiento de la función en un método main.
		 */
		
		// variable para almacenar la tabla
		int[] tablaEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sumaEnteros = suma(tablaEnteros);
		
		System.out.println(sumaEnteros);
		
	}
	
	static int suma (int[] tabla) {
		
		int sumaTabla = 0;
		
		for (int valor : tabla) {
			sumaTabla += valor;
		}
		
		return sumaTabla;
		
	}

}
