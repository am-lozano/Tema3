package boletin1;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Define un array de 12 números enteros con nombre num y asigna los valores
		 * según la tabla que se muestra a continuación. 
		 * Muestra el contenido de todos los elementos del array por consola. 
		 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?
		 */
		
		// creamos la tabla
		int num[] = new int[12];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		// mostramos la tabla con un bucle for-each
		for (int valor : num) {
			System.out.print(valor + " ");
		}
		
		// los valores que no le asignemos los pone automaticamente como 0, en este caso que es una tabla int
		
	}

}
